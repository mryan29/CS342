/* Meg Ryan, mryan47 */

/* Game Class */
import java.util.*;


public class Game {

	private String name;	// name of the game
	private Place currentPlace;	// current Place
	private Vector<Place> places; // vector of Place objects
	
	public Game(String name) {	// constructor
		this.name = name;
		this.places = new Vector<Place>();
	}
	
	public void addPlace(Place place) { // adds a place to the collection of Places in the game
		this.places.addElement(place);
	
	}
	
	public void print() { // prints out game info
		System.out.println("-----------------------------------------------------------------------------------------------------");
		System.out.println("|");
		System.out.println("|\tGAME INFO:");
		System.out.println("|\t\tName: " + this.name);
		System.out.println("|\t\tCurrent Place: " + this.currentPlace.name());
		for (Place p : this.places) {
	 		System.out.println("|\t\t\t" + p.name());
	 	}
		System.out.println("|");
		System.out.println("-----------------------------------------------------------------------------------------------------");
		
		
	}
	
	public void setCurrentPlace(Place place) {
		this.currentPlace = place;
	}
	
	public void exit() {	// exit the game
		System.out.println("Exiting game. Thanks for playing!");
		System.exit(0);
	
	}

	public void play () {
		// calls the Place .display() method
		// read in line of text from keyboard, looking for following keywords:
		//		QUIT or EXIT - quit the game
		//		LOOK - Redisplay current place aka return to step a
		//		GO XXX - where XXX is N, S, E, W, U, or D
		//			check to see if current place has an *unlocked* Direction correspoding to the requested direction
		//				if so, update current place to one arrived at by following corresponding Driection and return to step a
		
		boolean done = false;
		while (!done) {
			this.currentPlace.display();
			System.out.print("Enter a command:\t");
			Scanner scanner = new Scanner(System.in);
			String cmd = scanner.nextLine();
			
			System.out.println("\n");
			if (cmd.equals("QUIT") ||
				cmd.equals("quit") ||
				cmd.equals("EXIT") ||
				cmd.equals("exit") )
				{	
					this.exit();
					done = true;
					break;
				}
			else if (cmd.equals("LOOK") ||
					cmd.equals("look") )
				{	
					break;
				}
			else if (cmd.equals("GO N") ||
					cmd.equals("GO NORTH") ||
					cmd.equals("go n") ||
					cmd.equals("go north") ||
					cmd.equals("n") ||
					cmd.equals("N") )
				{
					setCurrentPlace(currentPlace.followDirection("N"));
					break;
				}
			else if (cmd.equals("GO S") ||
					cmd.equals("GO SOUTH") ||
					cmd.equals("go s") ||
					cmd.equals("go south") ||
					cmd.equals("s") ||
					cmd.equals("S") )
				{
					setCurrentPlace(currentPlace.followDirection("S"));
					break;
				}
			else if (cmd.equals("GO E") ||
					cmd.equals("GO EAST") ||
					cmd.equals("go e") ||
					cmd.equals("go east") ||
					cmd.equals("e") ||
					cmd.equals("E") )
				{
					setCurrentPlace(currentPlace.followDirection("E"));
					break;
				}
			else if (cmd.equals("GO W") ||
					cmd.equals("GO WEST") ||
					cmd.equals("go w") ||
					cmd.equals("go west") ||
					cmd.equals("w") ||
					cmd.equals("W") )
				{
					setCurrentPlace(currentPlace.followDirection("W"));
					break;
				}
			else if (cmd.equals("GO U") ||
					cmd.equals("GO UP") ||
					cmd.equals("go u") ||
					cmd.equals("go up") ||
					cmd.equals("u") ||
					cmd.equals("U") )
				{
					setCurrentPlace(currentPlace.followDirection("U"));
					break;
				}
			else if (cmd.equals("GO D") ||
					cmd.equals("GO DOWN") ||
					cmd.equals("go d") ||
					cmd.equals("go down") ||
					cmd.equals("d") ||
					cmd.equals("D") )
				{
					setCurrentPlace(currentPlace.followDirection("D"));
					break;
				}
			else {
					System.out.println("-----------------------------------------------------------------------------------------------------");
					System.out.println("|");
					System.out.println("|\tHmm... I don't seem to recognize that command. Try again!");
					System.out.println("|\tPossible inputs: ");
					System.out.println("|\t\tQUIT or EXIT – Quit the game.");
					System.out.println("|\t\tLOOK – Redisplay the current place.");
					System.out.println("|\t\tGO XXX, where XXX is one of N, S, E, W, U, or D.");
					System.out.println("|");
					System.out.println("-----------------------------------------------------------------------------------------------------");
					break;
				}
			}
			
			
			
			
			/*
			switch (cmd) {
				case "QUIT":
				case "EXIT":
				case "quit":
				case "exit":
					this.exit();
					done = true;
					break;
				case "LOOK":
				case "look":
					break;
				case "GO N":
				case "GO NORTH":
				case "go n":
				case "go north":
				case "n":
				case "N":
					setCurrentPlace(currentPlace.followDirection("N"));
					break;
				case "GO S":
				case "GO SOUTH":
				case "go s":
				case "go south":
				case "s":
				case "S":
					setCurrentPlace(currentPlace.followDirection("S"));
					break;
				case "GO E":
				case "GO EAST":
				case "go e":
				case "go east":
				case "E":
				case "e":
					setCurrentPlace(currentPlace.followDirection("E"));
					break;
				case "GO W":
				case "GO WEST":
				case "go w":
				case "go west":
				case "w":
				case "W":
					setCurrentPlace(currentPlace.followDirection("W"));
					break;
				case "GO D":
				case "GO DOWN":
				case "go d":
				case "go down":
				case "D":
				case "d":
					setCurrentPlace(currentPlace.followDirection("D"));
					break;
				case "GO U":
				case "GO UP":
				case "go u":
				case "go up":
				case "u":
				case "U":
					setCurrentPlace(currentPlace.followDirection("U"));
					break;
				default:
					System.out.println("-----------------------------------------------------------------------------------------------------");
					System.out.println("|");
					System.out.println("|\tHmm... I don't seem to recognize that command. Try again!");
					System.out.println("|\tPossible inputs: ");
					System.out.println("|\t\tQUIT or EXIT – Quit the game.");
					System.out.println("|\t\tLOOK – Redisplay the current place.");
					System.out.println("|\t\tGO XXX, where XXX is one of N, S, E, W, U, or D.");
					System.out.println("|");
					System.out.println("-----------------------------------------------------------------------------------------------------");
					break;
			} */
		}
	}


}



/* THINGS TO IMPROVE IN NEXT ITERATION */
// clean up the switch statement to be more robust. reference: https://www.dotnetperls.com/switch-java
// add an option to see a map
// make exit not just a place, but actually exit the game
// fix graphics to be more aesthetically pleasing

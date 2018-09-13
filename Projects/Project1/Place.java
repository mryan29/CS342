/* Meg Ryan, mryan47 */

/* Place class */
import java.util.*;

public class Place {
	
	private int ID;
	private String name;
	private String description;
	private Vector<Direction> directions;// collection (vector) of directions
	
	public Place(int ID, String name, String description) {	// constructor
		this.ID = ID;
		this.name = name;
		this.description = description;
		this.directions = new Vector<Direction> ();
	}
	
	public String name() { // returns the name
		return this.name;
	}
	
	
	
	public String description() { // returns the description
		return this.description;
	}
	
	public void addDirection(Direction direction) { // adds a Direction object to this Place's collection of directions
		this.directions.addElement(direction);
	
	}
	
	public Place followDirection(String direction) {
		// checks to see if this place has a valid unlocked direction corresponding to string passed
		for (Direction direct : this.directions) {
			if (direct.dir().equals(direction)) {
				if (!direct.isLocked()) {
					System.out.println("Direction unlocked! Moving along...");
					return direct.follow();
				} else {
					System.out.println("Whoops! Direction is locked. Try again.");
				}
			}
		}
		// if so, returns place arrived at by following said direction
		// otherwise, returns itself aka "this"
		System.out.println("Whoops! Looks like we ran into a wall there. No doors this way. Try a different direction!");
		return this;
	}
	
	public void print() { // prints out all Place information
		System.out.println("-----------------------------------------------------------------------------------------------------");
		System.out.println("|");
		System.out.println("| \tCURRENT PLACE:");
		System.out.println("|");
	 	System.out.println("| \t\tID:\t\t" + this.ID);
	 	System.out.println("| \t\tName:\t\t" + this.name);
	 	System.out.println("| \t\tDescription:\t" + this.description);
	 	System.out.println("|");
	 	System.out.println("-----------------------------------------------------------------------------------------------------");
	 										
	 	// and print out all directions
	 	for (Direction direct : this.directions) {
	 		System.out.println(direct.dir());
	 	}
	 	
	}
	
	public void display() {
		// prints out the stored description of the current place
		System.out.println("-----------------------------------------------------------------------------------------------------");
		System.out.println("|");
		System.out.println("| \tCURRENT PLACE:");
		System.out.println("|");
		System.out.println("| \t\tName:\t\t" + this.name);
		System.out.println("| \t\tDescription:\t" + this.description);
		System.out.println("|");
		System.out.println("-----------------------------------------------------------------------------------------------------");
	}

	/*public static void main(String[] args) {
	
	
	}*/

}



/* Meg Ryan, mryan47 */

/* test driver for all other classes */
import java.util.*;

/* To Do
- read in input
*/

public class GameTester {


	public static void main(String[] args) {
		// prints name and netID
		System.out.println("\nMeg Ryan, mryan47");
		System.out.println("-----------------------------------------------------------------------------------------------------");
		System.out.println("|");
		System.out.println("|\tWelcome to my game!");
		System.out.println("|\tThis game allows you, the user, to maneuver through different rooms by giving directions.");
		System.out.println("|\t~Let the excitement ensue~");
		System.out.println("|");
		System.out.println("|\tPossible inputs: ");
		System.out.println("|\t\tQUIT or EXIT – Quit the game.");
		System.out.println("|\t\tLOOK – Redisplay the current place.");
		System.out.println("|\t\tGO XXX, where XXX is one of N, S, E, W, U, or D.");
		System.out.println("|");
		System.out.println("-----------------------------------------------------------------------------------------------------");
		
		// create Direction and Place objects, and test to make sure they're correct
			// then comment out
		Place EntranceHall 		= new Place(1, "EntranceHall", "The main entrance and exit!");
		Place OgresLair 		= new Place(2, "OgresLair", "Watch out for the Ogres! Or don't. I'm a prompt, not a cop.");
		Place Treasure 			= new Place(3, "Treasure", "Treasure's around here somewhere...Oh look! A penny!");
		Place EnchantmentPool	= new Place(4, "EnchantmentPool", "Not your average swimming pool. Still probably a good idea to not drink the water though.");
		Place PotionsLab 		= new Place(5, "PotionsLab", "Get mixin' like Heisenberg! (That was a Breaking Bad reference, FYI.)");
		Place PotionsStoreroom 	= new Place(6, "PotionsStoreroom", "Try not to break anything, clutz.");
		Place Exit				= new Place(0, "Exit", "What, like you have anything better to do than play this game?");
		
		// direction id key: <ID of From Room><ID of To Room>
		Direction N12 = new Direction(12, EntranceHall, OgresLair, "N");
		Direction N14 = new Direction(14, EntranceHall, EnchantmentPool, "E");
		Direction D16 = new Direction(16, EntranceHall, PotionsStoreroom, "D");
		Direction W10 = new Direction(10, EntranceHall, Exit, "W");
		
		Direction N21 = new Direction(21, OgresLair, EntranceHall, "S");
		Direction E23 = new Direction(23, OgresLair, Treasure, "E");
		
		Direction N32 = new Direction(32, Treasure, OgresLair, "N");
		Direction N34 = new Direction(34, Treasure, EnchantmentPool, "N");
		
		Direction S43 = new Direction(43, EnchantmentPool, Treasure, "S");
		Direction W41 = new Direction(41, EnchantmentPool, EntranceHall, "W");
		Direction D45 = new Direction(45, EnchantmentPool, PotionsLab, "D");
		
		Direction W56 = new Direction(56, PotionsLab, PotionsStoreroom, "W");
		
		Direction E65 = new Direction(65, PotionsStoreroom, PotionsLab, "E");
		Direction U61 = new Direction(61, PotionsStoreroom, EntranceHall, "U");
		
		// testing Place addDirection methods
		EntranceHall.addDirection(N12);
		EntranceHall.addDirection(N14);
		EntranceHall.addDirection(D16);
		EntranceHall.addDirection(W10);
		
		OgresLair.addDirection(N21);
		OgresLair.addDirection(E23);
		
		Treasure.addDirection(N32);
		Treasure.addDirection(N34);
		
		EnchantmentPool.addDirection(S43);
		EnchantmentPool.addDirection(W41);
		EnchantmentPool.addDirection(D45);
		
		PotionsLab.addDirection(W56);
		
		PotionsStoreroom.addDirection(E65);
		PotionsStoreroom.addDirection(U61);
		
		
		// testing Direction match method

		// testing Direction locking methods		
		

		// testing Place and Direction follow methods
		
		// create Game object containing interconnected network of Places and Directions
		Game game = new Game("mygame");
		game.addPlace(EntranceHall);
		game.addPlace(OgresLair);
		game.addPlace(Treasure);
		game.addPlace(EnchantmentPool);
		game.addPlace(PotionsLab);
		game.addPlace(PotionsStoreroom);
		
		// test Game class with play() method
		game.setCurrentPlace(EntranceHall);
		game.play();
		// initially hard code either 6 room or mystic city examples
		
	
	}

}


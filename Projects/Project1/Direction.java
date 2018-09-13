/* Meg Ryan, mryan47 */

/* Direction class */
import java.util.*;

public class Direction {

	private int ID;
	private Place from;
	private Place to;
	private String dir;
	private boolean locked;
	
	public Direction(int ID, Place from, Place to, String dir) {
		this.ID = ID;
		this.from = from;
		this.to = to;
		this.dir = dir;
		this.locked = false;
	}

	public boolean match(String s) { // returns true if string passed in matches that of the direction, dir
		if (s.equals(this.dir)) {
			return true;
		} else {
			return false;
		}	
	}
	
	public String dir() {
		return this.dir;
	}
	
	public void lock() { // locks the direction
		this.locked = true;
	}
	
	public void unlock() { // unlocks the direction
		this.locked = false;
	}
	
	public boolean isLocked() {
		if (this.locked) {
			return true;
		} else {
			return false;
		}
	}
	
	public Place follow() { // returns the "to" corresponding to this direction if it is unlocked
		// otherwise returns the "from" Place
		if (this.isLocked()) {
			return this.from;
		} else {
			return this.to;
		}
	}
	
	public void print() {	// prints out all Direction info
		System.out.println("ID: " + this.ID);
		System.out.println("from: " + this.from.name());
		System.out.println("to: " + this.to.name());
		System.out.println("dir: " + this.dir);
		System.out.println("locked: " + this.locked);	
	}


}



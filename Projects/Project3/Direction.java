/* Meg Ryan, mryan47 */
/* TO DO */
	// make dirtype class private, enum
	// add lockPattern field and a useKey(Artifact) method tht toggles state of its lock if keypattern of artifact matches the lockpattern of the direction
		// lockpattern, keypattern are ints
	// update play()
		// GET artifact
		// DROP artifact
		// USE artifact
			// rn, only usable artifacts have non-zero keypattern which will attempt to useKey() on all directions in current place
		// INVE or INVETORY
			// list all artifacts currently in possession of the player, along w total value and total mobility

/* Direction class */
import java.util.*;

public class Direction {

	private int ID;
	private Place from;
	private Place to;
	private String dir;
	private boolean locked;
	private int lockPattern;	// must be nonnegative, 0 indicates it may not be changed
	
	// internal private enum class to keep track of what "kind" of direction each Direction item is
	// "Also store a variable of this type, instead of a string"??
	static class DirType { 				// SHOULD B PRIVATE
		private String text;			// i.e. North, North-northwest
		private String abbreviation;	// i.e. NONE, N, NNW
		
		public DirType(String text, String abbreviation) {
			this.text = text;
			this.abbreviation = abbreviation;
		}
		
		enum Types {
			NONE, N, S, E, W, U, D, NE, NW, SE,
			SW, NNE, NNW, ENE, WNW, ESE, WSW, SSE, SSW;
		}
		
		public String toString() {
			return this.text;
		}
		
		
		public boolean match(String s) {	// returns true if given string matches text or abbreviation, ignoring case
			if (s.equalsIgnoreCase(this.text) || s.equalsIgnoreCase(this.abbreviation)) {
				return true;
			} else {
				return false;
			}
		
		}
	
	
	
	}
	
	public Direction(int ID, Place from, Place to, String dir) {
		this.ID = ID;
		this.from = from;
		this.to = to;
		this.dir = dir;
		this.locked = false;
	}
	
	public Direction(Scanner s) {
		this.ID = ID;
		this.from = from;
		this.to = to;
		this.dir = dir;
		this.locked = false;
	
	}
	
	public void useKey(Artifact a) {
		if (a.getKeyPattern() > 0 && a.getKeyPattern() == this.lockPattern) {
			if (this.isLocked()) {
				this.unlock();
			} else {
				this.lock();
			}
		}
	
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
		System.out.println("lockpattern: " + this.lockPattern);
	}


}



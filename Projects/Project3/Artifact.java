/* Meg Ryan, mryan47 */
/* TO DO */
	// how to get game to call use()

/* Artifact class */
import java.util.*;

public class Artifact {

	private int value;
	private int mobility;	// movability or mobility? measure of size/weight, negative = immovable, used only as optional right now
	private String name;
	private String description;
	private int keyPattern;			// 0 for any artifact that can't act as key, negative may be applied as master keys (optional)
	
	public Artifact(Scanner s) {	// constructor
	
	
	}


	public int value() {
		return this.value;
	}
	
	public int size() {
		return this.mobility;
	}

	public String name() {
		return this.name;
	}
	
	public String description() {
		return this.description;
	}
	
	public void use() {	// uses the artifact
		// in case of keys, this gets current place from game class, then passes artifact to usekey method of current place
		// .getCurerntPlace().useKey(this);
		
	
	
	}
	
	public int getKeyPattern() {
		return this.keyPattern;
	
	}

	public void print() {	// used for debugging, prints out full details
	 	System.out.println("Artifact name:\t" + this.name());
	 	System.out.println("Artifact description:\t" + this.description());
	 	System.out.println("Artifact value:\t" + this.value());
	 	System.out.println("Artifact mobility:\t" + this.size());
	 	//System.out.println("Artifact keyPattern:\t" + artifact.keyPattern);
	
	}
















}
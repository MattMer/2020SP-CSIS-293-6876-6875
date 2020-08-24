// File: Oak.java - a subclass of class Tree.  For initial creation, I copied the contents of class Pine and
// changed najmes,.
// Author: Mike Qualls

package combinedRelationsDemo;

public class Oak extends Tree {
	// declare instance variables - none needed
	
	// methods
	public Oak () {
		// the superclass constructor must be called the very first thing.
		// If I don't, the compiler will call the no argument/default constructor of the superclass
		super ();
	} 
	public Oak (int height, int age) {
		// I must say I want to call the superclass constructor expecting two argument values
		super (height, age);
	}
	
	// sets/gets - none needed
	
	// toString
	public String toString () {
		return (String.format ("Oak %s", super.toString ()));
	}  // end method toString

}  // end class Oak

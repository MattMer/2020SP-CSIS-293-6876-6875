// File: Pine.java - define what is meant by 'Pine' tree
// A type of Tree, it inherits from Tree but overrides method growHigher
// Author: Mike Qualls

package combinedRelationsDemo;

public class Pine extends Tree {
	// declare instance variables - none needed
	
	// methods
	public Pine () {
		// the superclass constructor must be called the very first thing.
		// If I don't, the compiler will call the no argument/default constructor of the superclass
		super ();
	} 
	public Pine (int height, int age) {
		// I must say I want to call the superclass constructor expecting two argument values
		super (height, age);
	}
	
	// sets/gets - none needed
	
	// override the growHigher method, since Pine trees grow faster than Oaks
	public void growHigher () {
		setHeight (getHeight () + 5);
	}  // end method growHighht
	
	// toString
	public String toString () {
		return (String.format ("Pine %s", super.toString ()));
	}  // end method toString

}  // end class Pine

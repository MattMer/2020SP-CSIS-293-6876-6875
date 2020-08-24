// File:  Garden.java - a class used to model a garden with one plant in it
// A Tree.  Depending on the garden (instantiated in the test driver - MyBackyard
// or MyFrontYard) it will contain either a Pine tree or an Oak tree.
// This class is a 'has-a' class composed of a Tree reference that can
// refer to any subclass object of Tree.  This class defines a 'growHigher' method
// called from the test driver.  It then polymorphically calls the right method
// of the subclass, either Pine or Oak
// Author:  Mike Qualls

package combinedRelationsDemo;

public class Garden {
	// declare instance variables/references
	String name;
	Tree tree1;
	
	// methods, constructor first
	public Garden (String name, Tree tree1) {
		this.name = name;
		this.tree1 = tree1;
	}
	
	// sets/gets
	public void setName (String name) {
		this.name = name;
	}
	public void setTree (Tree tree1) {
		this.tree1 = tree1;
	}
	
	// the overridden 'growHigher' method that polymorphically calls the
	// subclass method using the superclass reference.
	public void growHigher () {
		tree1.growHigher ();
	} // end method growHigher
	
	// a toString method
	public String toString () {
		return String.format ("\tA Garden with a %s: %s", tree1, name);
	}  // end method toString

}  // end class Garden

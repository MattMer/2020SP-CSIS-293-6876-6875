// File: Tree.java - a superclass of a small demonstration hierarchy
// Author: Mike Qualls

package combinedRelationsDemo;

public class Tree {
	// declare instance variables
	private int height;
	private int age;
	
	// methods next, starting with constructors
	Tree () {
		setHeight (1);
		setAge (1);
	}
	Tree (int height, int age) {
		setHeight (height);
		setAge (age);
	}
	
	// the sets and gets
	public void setHeight (int height) {
		this.height = height;
	}
	public void setAge (int age) {
		this.age = age;
	}
	public int getHeight () {
		return height;
	}
	public int getAge () {
		return age;
	}

	// define growHigher and growOlder.  growHigher will be used by class Oak but overridden by class Pine
	public void growHigher () {
		// simply change the height by adding 1
		height++;
	}  // end method growHigher
	public void growOlder () {
		// i've changed the name of this, but the intent is to change the age
		age++;
	}  // end method growOlder
	
	// define the toString method
	public String toString () {
		return String.format ("Tree: height = %d, age = %d", getHeight (), getAge ());	
	}  // end method toString
	
}  // end class Tree


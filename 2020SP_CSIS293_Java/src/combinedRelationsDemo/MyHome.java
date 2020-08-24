// File: MyHome.java - the test driver to demonstrate combined relations.
// It defines both a front yard and a backyard, each with a garden.  But,
// the gardens have different plants, either a pine or an oak.
// Composition and Inheritance
// Author: Mike Qualls

package combinedRelationsDemo;

public class MyHome {

	public static void main(String[] args) {
		//  declare local variables/references.  In this case, a Tree
		// superclass reference
		Garden myFrontYard;
		Garden myBackYard;
		Pine pine1;
		Oak oak1;
		
		// create the Pine and Oak trees ready in planting buckets
		pine1 = new Pine (2, 10);
		oak1 = new Oak ();
		
		// initially, plant the Pine and Oak
		myFrontYard = new Garden ("Front", pine1);
		myBackYard = new Garden ("Back", oak1);
		
		// print the gardens
		System.out.println ("My Gardens Initially");
		System.out.printf ("\t\t%s\n", myFrontYard);
		System.out.printf ("\t\t%s\n", myBackYard);
		
		// now, replant the gardens and 'grow' the trees
		myFrontYard.setTree (oak1);
		myFrontYard.tree1.growHigher ();
		myBackYard.setTree (pine1);
		myBackYard.tree1.growHigher ();
		
		// print the gardens again
		System.out.println ("\n\nMy Gardens After Gardening - new trees grown higher");
		System.out.printf ("\t\t%s\n", myFrontYard);
		System.out.printf ("\t\t%s\n", myBackYard);
		
	}  // end method main

}  // end class MyBackyard

package inheritanceDemo;

public class Forest {

	public static void main(String[] args) {
		// declare local variables - a Pine
		Pine pine1, pine2;
		
		// create the objects
		pine1 = new Pine ();
		pine2 = new Pine (10, 3);
		
		// simply print the objects for now - depending on use of toString.  What's true in the statements I write is that when
		// I print an object, the compiler automatically calls a toString method for that object.  Either the one I define or the
		// one defined in class Object
		System.out.printf ("%s\n", pine1);
		System.out.printf ("%s\n", pine2);
		
	}  // end method main

}  // end class Forest

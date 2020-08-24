package inheritanceDemo;

public class Pine extends Tree {
	// declare instance variables - none needed
	
	// methods
	public Pine () {
		super ();
	} 
	public Pine (int height, int age) {
		super (height, age);
	}
	
	// sets/gets - none needed
	
	// toString
	public String toString () {
		return (String.format ("Pine %s", super.toString ()));
	}

}

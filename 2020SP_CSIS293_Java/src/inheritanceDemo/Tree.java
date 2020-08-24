package inheritanceDemo;

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

	// define grow and older here
	
	// define the toString method
	public String toString () {
		return String.format ("Tree: height = %d, age = %d", getHeight (), getAge ());	
	}  // end method toString
	
}

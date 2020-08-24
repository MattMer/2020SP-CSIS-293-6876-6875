package compositionDemo;

public class Projector {
	// declare instance variables
	private String model;
	private String resolution;
	
	// methods, constructor
	public Projector () {
		this.model = "3M";
		this.resolution = "1920x1080";
		
		// say I'm here
		System.out.println ("\tIn the Projector constructor");
	}  // end constructor

}  // end class Projector
 
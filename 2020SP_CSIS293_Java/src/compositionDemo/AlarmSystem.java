package compositionDemo;

public class AlarmSystem {
	// declare instance variables
	private String make;
	private String model;
	private String sensing;
	
	// methods
	public AlarmSystem () {
		this.make = "Seeing Eye";
		this.model = "Simple";
		this.sensing = "Infrared";
		
		// say I'm here
		System.out.println ("\tIn the AlarmSystem constructor");
	}  // end no argument constructor

}  // end class AlarmSystem

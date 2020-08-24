package compositionDemo;

public class Classroom {
	// declare instance variables - in this case, the 'contained' class object references
	private Projector show;
	private AlarmSystem protect;
	
	// a no argument constructor that constructs the contained objects.  This is slightly different than the
	// textbook's creation of Date/Employee/EmployeeTest.  There, the test driver was tightly bound to the
	// Employee class because it had to know how to create Date objects.  In this example, that's no
	// longer true.  It's the Classroom object itself that knows how to create contained objects.
	// A constructor that does so.
	public Classroom () {
		// say I'm here
		System.out.println ("In the Classroom constructor");
		
		// instantiate the contained objects
		this.show = new Projector ();
		this.protect = new AlarmSystem ();
		
	}    // end no-argument constructor	

}  // end class Classroom

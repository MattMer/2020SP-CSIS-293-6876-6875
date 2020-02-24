package lab3;

public class Employee {
	private String fName, lName;
	private double monthlySalary;
	
	public Employee(String fName, String lName, double monthlySalary) {
		this.fName = fName;
		this.lName = lName;
		if (monthlySalary > 0.0) {
			this.monthlySalary = monthlySalary;
		}
	}
	
	public String getfName() {
		return fName;
	}
	
	public void setfName(String fName) {
		this.fName = fName;
	}
	
	public String getlName() {
		return lName;
	}
	
	public void setlName(String lName) {
		this.lName = lName;
	}
	
	public double getMonthlySalary() {
		return monthlySalary;
	}
	
	public void setMonthlySalary(double monthlySalary) {
		if (monthlySalary > 0.0) {
			this.monthlySalary = monthlySalary;
		}
	}
	public double yearlySalary() {
		return monthlySalary*12;
	}
}

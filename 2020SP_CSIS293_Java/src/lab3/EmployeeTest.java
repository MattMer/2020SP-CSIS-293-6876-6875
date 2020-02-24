package lab3;

public class EmployeeTest {
	
	public static void main(String[] args) {
		Employee testEmployeeOne = new Employee("Matt", "Mershon", 10000);
		Employee testEmployeeTwo = new Employee("John", "Doe", 2000);
		
		System.out.printf("%s yearly salary: $%.2f%n", testEmployeeOne.getlName(), testEmployeeOne.yearlySalary());
		System.out.printf("%s yearly salary: $%.2f%n", testEmployeeTwo.getlName(), testEmployeeTwo.yearlySalary());
		
		testEmployeeOne.setMonthlySalary((testEmployeeOne.getMonthlySalary())*1.1);
		testEmployeeTwo.setMonthlySalary((testEmployeeTwo.getMonthlySalary())*1.1);
		
		System.out.printf("%s yearly salary after raise: $%.2f%n", testEmployeeOne.getlName(), testEmployeeOne.yearlySalary());
		System.out.printf("%s yearly salary after raise: $%.2f%n", testEmployeeTwo.getlName(), testEmployeeTwo.yearlySalary());
	}

}

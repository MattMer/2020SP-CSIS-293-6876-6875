package project2;

public class Employee {
	//Variable declaration
	String firstName;
	String lastName;
	int socialSecurityNumber;
	CompensationModel compensationModel;

		public Employee() {
			super();
			}

		public Employee(String firstName, String lastName, int socialSecurityNumber, CompensationModel compensationModel) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.socialSecurityNumber = socialSecurityNumber;
			this.compensationModel = compensationModel;
		}

		public void setCompensationModel(CompensationModel compensationModel) {
			this.compensationModel = compensationModel;
		}
		
		//Get-Set
		public String getFirstName() {
			return firstName;
			}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
			}

		//Get-Set
		public String getLastName() {
			return lastName;
			}
		public void setLastName(String lastName) {
			this.lastName = lastName;
			}

		//Get-Set
		public int getSSN() {
			return socialSecurityNumber;
			}
		public void setSSN(int socialSecurityNumber){
			this.socialSecurityNumber = socialSecurityNumber;
			}

		public double earnings() {
			return compensationModel.earnings();
		}
		
		
		@Override
		public String toString() {
		System.out.printf("Employee name = %s %s%n", firstName, lastName);
		System.out.printf(compensationModel.toString());
		System.out.printf("Earnings = $%.2f\n", earnings());
		return "%n";
		}
}

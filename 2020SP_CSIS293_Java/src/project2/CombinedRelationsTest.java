package project2;

public class CombinedRelationsTest {
	
	public static void main(String[] args){
		Employee employeeOne;
		Employee employeeTwo;
		
		CommissionCompensationModel commission1 = new CommissionCompensationModel (1000, .12);
		BasePlusCommissionCompensationModel basePlusCommission1 = new BasePlusCommissionCompensationModel(600, .08, 500);
		
		employeeOne = new Employee("Matthew", "Mershon", 123456789, commission1);
		employeeTwo = new Employee("Mattilda", "Mushroom", 987654321, basePlusCommission1);
		
		System.out.printf(employeeOne.toString());
		System.out.printf(employeeTwo.toString());
		
		
		BasePlusCommissionCompensationModel basePlusCommission2 = new BasePlusCommissionCompensationModel(350, .12, 300);
		CommissionCompensationModel commission2 = new CommissionCompensationModel (600, .08);
		
		employeeOne.setCompensationModel(basePlusCommission2);
		employeeTwo.setCompensationModel(commission2);
		
		System.out.printf(employeeOne.toString());
		System.out.printf(employeeTwo.toString());

	}
}

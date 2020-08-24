package project2;

public class BasePlusCommissionCompensationModel extends CompensationModel {
	private double commissionRate, baseSalary, earnings;
	
	public BasePlusCommissionCompensationModel() {
		super();
	}
	
	public BasePlusCommissionCompensationModel(double grossSales, double commissionRate, double baseSalary) {
		super(grossSales);
		if (commissionRate <= 0.0 || commissionRate >= 1.0) throw new IllegalArgumentException( "Commission rate must positive and under 1.");
		this.commissionRate = commissionRate;
		this.baseSalary = baseSalary;
		}

	//GET-SET commission rate
	public double getCommissionRate() {
		return commissionRate;
		}
	public void setCommissionRate(double commissionRate) {
		if (commissionRate <= 0.0 || commissionRate >= 1.0) throw new IllegalArgumentException( "Commission rate must positive and under 1.");
		this.commissionRate = commissionRate;
	}
	
	//GET-SET commission rate
	public double getBaseSalary() {
		return baseSalary;
		}
	public void setBaseSalary(int baseSalary) {
		if (baseSalary <= 0.0) throw new IllegalArgumentException( "Salary must be positive.");
		this.baseSalary = baseSalary;
	}
	
	@Override
	public double earnings() {
		earnings = (this.getCommissionRate() * super.getGrossSales() + baseSalary);
		return earnings;
	}
	
	@Override
	public String toString() {
		System.out.println("Compensation Model is base plus commission.");
		System.out.println("Gross Sales = "+ super.getGrossSales());
		System.out.println("Commission Rate = "+commissionRate);
		System.out.println("Base Rate = "+baseSalary);
		return "";

	}
}

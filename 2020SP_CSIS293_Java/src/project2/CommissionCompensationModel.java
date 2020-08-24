package project2;

public class CommissionCompensationModel extends CompensationModel {
	private double commissionRate;

	public CommissionCompensationModel() {
		super();
		}

	public CommissionCompensationModel(double grossSales, double commissionRate) {
		super(grossSales);
		if (commissionRate <= 0.0 || commissionRate >= 1.0) throw new IllegalArgumentException( "Commission rate must be > 0.0 and < 1.0");
		this.commissionRate = commissionRate;
		}


	//GET-SET commission rate
	public double getCommissionRate() {
		return commissionRate;
		}
	public void setCommissionRate(double commissionRate) {
		if (commissionRate <= 0.0 || commissionRate >= 1.0) throw new IllegalArgumentException( "Commission rate must be > 0.0 and < 1.0");
		this.commissionRate = commissionRate;
	}
	
	@Override
	public double earnings() {
		return this.getCommissionRate() * super.getGrossSales();
	}

	@Override
	public String toString() {
		System.out.println("Compensation model is commission.");
		System.out.println("GrossSales = "+ super.getGrossSales());
		System.out.println("CommissionRate = "+commissionRate);
		return "";
	}
}

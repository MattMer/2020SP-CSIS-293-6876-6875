package project2;

public class CompensationModel {
	private double grossSales; 
	
	CompensationModel() {
		setGrossSales(0);
	}
	
	CompensationModel(double grossSales) {
		if (grossSales < 0.0) throw new IllegalArgumentException("Gross sales must be positive.");
		this.grossSales = grossSales;
		}

	public double getGrossSales() {
		return grossSales;
		}

	public void setGrossSales(double grossSales) {
		if (grossSales < 0.0) throw new IllegalArgumentException("Gross sales must be positive.");
		this.grossSales = grossSales;
		}
	
	public double earnings() {
		return 0;
	}
	
}

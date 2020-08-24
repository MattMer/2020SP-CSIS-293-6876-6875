package project1;
public class Project1 {
	// member variables
private double[][] sales;
private int employeeID;
private int productID;
private double valueOfSales;

//generic get-set methods
public double[][] getSales() {
	return sales;
	}
public void setSales(double[][] sales) {
	this.sales = sales;
	}
public int getProductID() {
	return productID;
	}
public void setProductID(int productID) {
	this.productID = productID;
	}
public int getEmployeeID() {
	return employeeID;
	}
public void setEmployeeID(int EmployeeID) {
	this.employeeID = EmployeeID;
	}
public double getValueOfSales() {
	return valueOfSales;
	}
public void setValueOfSales(double valueOfSales) {
	this.valueOfSales = valueOfSales;
	}
public void setElements(int i, int j, double valueOfSales) { //Adds value to employee/product index
	this.sales[i-1][j-1] += valueOfSales;
	}

public void total(double sales[][]) { //Calculates totals and displays the Array in a formatted grid
    
	double totalPerProductSales, finalSales=0;     
	double[] productSales = new double[sales[0].length-1];
	final String FORMAT = "-------%s ";
	System.out.println("|Sales | \t\tProducts \t\t\t |");
	for (int i = 0; i<= sales[0].length; i++) System.out.printf(FORMAT,"+");
	System.out.println("");
	System.out.print("|Person|");
	for (int i = 1; i< sales[0].length; i++) System.out.printf("%8d|",i);
	System.out.print(" Total |");
	System.out.println("");
	for (int i = 0; i< sales[0].length+1; i++) System.out.printf(FORMAT,"+");
	System.out.println("");
	for (int i = 0; i < sales.length-1; i++) {
		totalPerProductSales = 0.0;
		System.out.printf("| %4d |", i+1);
		for (int j = 0; j < sales[0].length-1; j++) {
			totalPerProductSales += sales[i][j];
			finalSales += sales[i][j];
			productSales[j] += sales[i][j];
			System.out.printf("%8.2f|", sales[i][j]);
			}
		System.out.printf("%8.2f|\n", totalPerProductSales);
		}
	for (int i = 0; i< sales[0].length+1; i++) System.out.printf(FORMAT,"+");
	System.out.println("");
	System.out.print("| Total|");
	for (double s : productSales) System.out.printf("%8.2f|", s);
	System.out.printf("%8.2f|\n", finalSales);
	System.out.println("");
	for (int i = 0; i< sales[0].length+1; i++) System.out.printf(FORMAT,"+");
	System.out.println("");
	}
}
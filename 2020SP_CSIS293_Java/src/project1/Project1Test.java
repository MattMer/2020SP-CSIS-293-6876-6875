package project1;
import java.util.Scanner;

public class Project1Test {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Project1 comp = new Project1();
		Scanner in = new Scanner(System.in);
		comp.setSales(new double[5][6]);
		while (true) {
				System.out.println("Enter the EmployeeID, or 0 to exit:");
				comp.setEmployeeID(in.nextInt());
				if (comp.getEmployeeID() == 0) break;
				System.out.println("Enter the ProductID:");
				comp.setProductID(in.nextInt());
				System.out.println("Enter the Sales total:");
				comp.setValueOfSales(in.nextDouble());
				comp.setElements(comp.getEmployeeID(), comp.getProductID(), comp.getValueOfSales());

			}
		comp.total(comp.getSales());
		}
	}
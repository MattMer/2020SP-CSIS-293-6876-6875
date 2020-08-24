package lab5;

import java.util.Scanner;

public class Parking {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double parkingCharge, runningParkingCharge = 0, hours;
		int cars;
		
		System.out.print("Enter number of cars that parked yesterday:");
		cars = input.nextInt();
		
		for(int count=1; count<=cars; count++) {
			System.out.printf("Enter hours for car %d\n", count);
			hours = input.nextDouble();
			parkingCharge = calculateCharges(hours);
			runningParkingCharge += parkingCharge;
			System.out.printf ("Charges for this customer = $%.2f\n", parkingCharge);
			System.out.printf ("Running total = $%.2f\n", runningParkingCharge);
		}
		
		

	}
	public static double calculateCharges(double numHours) {
		if (numHours%1>0) { //Checks if the hours are not an integer.
			numHours=Math.ceil(numHours); //Rounds up as any partial hour is charged full price.
		}
		double fee = 2 + 0.5 * (numHours - 3);
		return Math.max(2, Math.min(10, fee)); //Doesn't charge over $10.
	}

}

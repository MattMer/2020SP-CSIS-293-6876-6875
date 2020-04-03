package lab5;

import java.util.Scanner;

public class Parking {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double parkingCharge, runningParkingCharge, hours;
		int cars;
		
		System.out.print("Enter number of cars that parked yesterday:");
		cars = input.nextInt();
		
		for(int count=1; count<=cars; count++) {
			System.out.printf("Enter hours for car %f", count);
			hours = input.nextDouble();
		}

	

	}
	public static double calculateCharges (double numHours) {
		double fee = 2 + 0.5 * (numHours - 3);
		return Math.max(2, Math.min(10, fee));
	}

}

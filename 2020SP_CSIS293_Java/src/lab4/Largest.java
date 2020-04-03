package lab4;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int counter = 0, counterMax = 10, largest=0; 
		
		while (counter < counterMax) {
			System.out.printf("Enter number %d of %d:", (counter+1), counterMax);
			int number = input.nextInt();
			if (number > largest) {
				largest = number;
			}
			counter++;
		}
		System.out.printf("Largest number: %d", largest);

	}

}

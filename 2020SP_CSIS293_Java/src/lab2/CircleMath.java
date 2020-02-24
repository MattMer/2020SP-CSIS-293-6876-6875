package lab2;

import java.util.Scanner;

public class CircleMath {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radius of a circle: ");
		int radius = input.nextInt();
		System.out.printf("Diameter: %d%n", radius*2);
		System.out.printf("Circumference: %f%n", radius*2*Math.PI);
		System.out.printf("Area: %f%n", Math.pow(radius, 2)*Math.PI); //Utilizing Math.pow to express intent of exponent operation
		}

}

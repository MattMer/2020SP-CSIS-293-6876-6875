package lab6;

public class ComplexTest {
	public static void main(String args[]) {
		Complex num1 = new Complex (5.0, 11.0);
		Complex num2 = new Complex (4.0, 5.0);
		num1.add(num2);
		System.out.printf ("%s\n", num1);
	}
}

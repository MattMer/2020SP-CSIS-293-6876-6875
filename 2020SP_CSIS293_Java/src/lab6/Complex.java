package lab6;

public class Complex {
	private double realPart, imaginaryPart;
	
	public Complex() {
		this(0.0,0.0);
	}
	
	public Complex(double realPart, double imaginaryPart) {
		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;
	}
	
	public Complex add(Complex other) {
		this.realPart += other.realPart;
		this.imaginaryPart += other.imaginaryPart;
		return this;
	}
	
	public Complex subtract(Complex other) {
		this.realPart -= other.realPart;
		this.imaginaryPart -= other.imaginaryPart;
		return this;
	}
	
	public String toString() {
		return String.format("Real: %.2f, Imaginary: %.2f", realPart, imaginaryPart);
	}

}

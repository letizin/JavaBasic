package hw250408.program_6;

public class Complex {
	private double a;
	private double b = 0.0;
	
	public Complex(double a) {
		this.a = a;
	}
	public Complex(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public void print() {
		System.out.println(a + " + " + b+"i");
	}
}

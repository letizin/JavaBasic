package hw250408.program_1;

public class Triangle {
	double he;
	double ad;
	public Triangle(double ad, double he) {
		this.ad = ad;
		this.he = he;
	}
	
	public double findArea() {
		return ad * he / 2;
	}
}

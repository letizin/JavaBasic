package hw250408.program_2;

public class Triangle {
	double he;
	double ad;
	double avg;
	public Triangle(double ad, double he) {
		this.ad = ad;
		this.he = he;
		this.avg = ad * he / 2;
	}
	
	public double findArea() {
		return ad * he / 2;
	}
	
	public boolean isSameArea(Triangle t) {
		if(avg == t.findArea()) {
			return true;
		}else {
			return false;
		}
	}
}

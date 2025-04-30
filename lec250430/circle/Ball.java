package lec250430.circle;

public class Ball extends CircleType{

	public Ball(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return 4 * PI * radius;
	}
		
}

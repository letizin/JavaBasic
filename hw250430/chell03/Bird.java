package hw250430.chell03;

public class Bird extends Countable {

	public Bird(String name, int num) {
		super(name, num);
		// TODO Auto-generated constructor stub
	}
	
	public void fly() {
		System.out.println(num + "마리 " + name + "가 날아간다");
	}
}

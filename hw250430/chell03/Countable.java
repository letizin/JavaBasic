package hw250430.chell03;

public abstract class Countable {
	protected String name;
	protected int num;
	
	public Countable(String name, int num) {
		this.name = name;
		this.num = num;
	}
	
	void count() {
		System.out.println(name + "가 " + num +"마리 있다.");
	}
}

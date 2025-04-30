package hw250430.program1;

public class Concrete extends Abstract{
	private int j;
	
	public Concrete(int i, int j) {
		this.i = i;
		this.j = j;
	}
	
	public void show() {
		System.out.println("i : " + i + ", j : " + j);
	}
}

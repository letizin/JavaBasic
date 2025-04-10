package hw250408.chap4_1;

public class Printer {
	private int numOfPaper = 0;
	
	public Printer(int amount) {
		this.numOfPaper = amount;
	}
	
	public void print(int amount) {
		this.numOfPaper -= amount;
	}
	
	public int getprint() {
		return numOfPaper;
	}
}

package hw250408.chap4_2;

public class Printer {
	private int numOfPaper = 0;
	
	public Printer(int amount) {
		this.numOfPaper = amount;
	}
	
	public void print(int amount) {
		if(numOfPaper < 0) {
			System.out.println("용지가 없습니다");
		}else if(numOfPaper < amount) {
			System.out.println("모두 출력하려면 용지가 " + (amount - numOfPaper) + "매 부족합니다. " + numOfPaper + "장만 출력합니다");
			this.numOfPaper -= amount;
		}else {
			this.numOfPaper -= amount;
			System.out.println(amount + "장 출력했습니다. 현재 "+ numOfPaper + "장 남아 있습니다.");
		}
	}
	
	public int getprint() {
		return numOfPaper;
	}
}

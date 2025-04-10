package hw250408.chap4_3;

public class Printer {
	private int numOfPaper;
	private boolean duplex;
	
	public Printer(int amount, boolean duplex) {
		this.numOfPaper = amount;
		this.duplex = duplex;
	}
	
	public void print(int amount) {
		if(!duplex) {
			printSout(amount);
		}else {
			double duamount = (double)amount/2;
			printSout(duamount);
			
		}
	}
	
	public void printSout(double duamount) {
		if(numOfPaper < 0) {
			System.out.println("용지가 없습니다");
		}else if(numOfPaper < duamount) {
			System.out.println("양면으로 모두 출력하려면 용지가 " + (duamount - numOfPaper) + "매 부족합니다. " + numOfPaper + "장만 출력합니다");
			numOfPaper -= duamount;
		}else {
			numOfPaper -= duamount;
			System.out.println("양면으로 "+((int)duamount+1) + "장 출력했습니다. 현재 "+ numOfPaper + "장 남아 있습니다.");
		}
	}
	
	public void printSout(int amount) {
		if(numOfPaper < 0) {
			System.out.println("용지가 없습니다");
		}else if(numOfPaper < amount) {
			System.out.println("단면으로 모두 출력하려면 용지가 " + (amount - numOfPaper) + "매 부족합니다. " + numOfPaper + "장만 출력합니다");
			this.numOfPaper -= amount;
		}else {
			this.numOfPaper -= amount;
			System.out.println(amount + "장 출력했습니다. 현재 "+ numOfPaper + "장 남아 있습니다.");
		}
	}
	
	public boolean getDuplex() {
		return duplex;
	}
	
	public void setDuplex(boolean duplex) {
		this.duplex = duplex;
	}
}

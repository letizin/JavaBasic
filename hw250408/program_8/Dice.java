package hw250408.program_8;

public class Dice {
	private int roll;
	public Dice() {
		
	}
	
	public int roll() {
		return roll = (int)(Math.random() * 6) + 1 ;
	}
	
}

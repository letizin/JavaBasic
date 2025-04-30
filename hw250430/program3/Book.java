package hw250430.program3;

public class Book {
	private int price;
	
	public Book(int price) {
		this.price = price;
	}
	
	public void BookPrice() {
		System.out.println("Book [price = " + price + "]");
	}
	
	public int setPrice() {
		return price;
	}
}

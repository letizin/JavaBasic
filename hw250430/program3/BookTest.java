package hw250430.program3;

import java.util.Arrays;

public class BookTest {
	public static void main(String[] args) {
		Book[] b = {new Book(15000), new Book(50000), new Book(20000)};
		int[] setp = new int[b.length];
		System.out.println("정렬 전");
		
		int count = 0;
		
		for(Book a : b) {
			a.BookPrice();
			setp[count++] = a.setPrice();
		}
		
		Arrays.sort(setp);
		
		System.out.println("정렬 후");
		
		for(int i=0; i<b.length; i++) {
			System.out.println("Book [price = " + setp[i] + "]");
		}
	}
}

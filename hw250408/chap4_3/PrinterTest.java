package hw250408.chap4_3;

public class PrinterTest {
	public static void main(String[] args) {
		Printer pr = new Printer(20, true);
		pr.print(25);
		pr.setDuplex(false);
		pr.print(10);
	}
}

package hw250408.program_5;

public class LineTest {
	public static void main(String[] args) {
		Line a = new Line(1);
		Line b = new Line(1);
		
		System.out.println(a.isSameLine(b));
		System.out.println(a == b);
	}
}

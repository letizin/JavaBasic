package hw250430.chell01;

public class CountableTest {
	public static void main(String[] args) {
		Countable[] m = {new Bird("뻐구기"), new Bird("독수리"), new Tree("사과나무"), new Tree("밤나무")};
		
		for(Countable e : m) {
			e.count();
		}
	}
}

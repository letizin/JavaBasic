package hw250430.chell03;

public class CountableTest {
	public static void main(String[] args) {
		Countable[] m = { new Bird("뻐꾸기", 5), new Bird("독수리", 2), new Tree("사과나무", 10), new Tree("밤나무", 7) };
		
		for(Countable a : m) {
			a.count();
		}
		
		for(Countable b : m) {
			if(b instanceof Bird) {
				((Bird) b).fly();
			}else {
				((Tree)b).ripen();
			}
		}
	}
}

package lec250430.countable;

public class CountTest {
	public static void main(String[] args) {
		Countable[] c = {new Bird("뻐구기", 5), new Bird("독수리", 2), new Tree("사과나무", 10), new Tree("밤나무", 7)};
		
		for(Countable m : c) {
			m.count();
		}
		
		for(Countable m : c) {
			if(m instanceof Bird) {
				((Bird)m).fiy();
			}else {
				((Tree)m).ripen();
			}
		}
	}
}

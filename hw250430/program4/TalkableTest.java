package hw250430.program4;

public class TalkableTest {
	public static void main(String[] args) {
		speak(new Korean());
		speak(new American());
	}
	
	public static void speak(Talkable t) {
		t.talk();
	}
}

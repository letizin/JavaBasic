package hw250430.program5;

public class ControllerTest {
	public static void main(String[] args) {
		Controller[] c = {new TV(false), new Radio(true)};
		
		for(Controller a : c) {
			a.show();
		}
	}
}

package hw250430.program5;

public abstract class Controller {
	protected boolean power;
	
	void show() {
		if(power == true) {
			System.out.println(getName() + "가 켜져있습니다");
		}else {
			System.out.println(getName() + "가 꺼져있습니다");
		}
	}
	
	abstract String getName();
	
	
}

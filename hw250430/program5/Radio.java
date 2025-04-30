package hw250430.program5;

public class Radio extends Controller{
	
	public Radio(boolean power) {
		this.power = power;
	}
	
	@Override
	String getName() {
		return "Radio";
	}
}

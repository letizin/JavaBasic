package hw250408.program_5;

public class Line {
	
	static int set;
	
	public Line(int set) {
		this.set = set;
	}
	
	public boolean isSameLine(Line l) {
		if(l.set == this.set) {
			return true;
		}else {
			return false;
		}
	}
}

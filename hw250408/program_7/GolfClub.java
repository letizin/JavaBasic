package hw250408.program_7;

public class GolfClub {
	private int iron = 7;
	
	private String name = "없음";
	
	public GolfClub() {
		
	}
	
	public GolfClub(int t) {
		this.iron = t;
	}
	
	public GolfClub(String s) {
		this.name = s;
	}
	
	public void print() {
		if(name.equals("없음")) {
			System.out.println(iron +"번 아이언입니다");
		}else {
			System.out.println(name + "입니다");
		}
	}
}

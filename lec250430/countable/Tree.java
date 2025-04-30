package lec250430.countable;

public class Tree implements Countable{
	
	private String name;
	private int num;
	
	public Tree(String name, int num) {
		this.name = name;
		this.num = num;
	}
	
	public void ripen() {
		System.out.println(num + "그루 " + name + "에 열매가 잘 익었다.");
	}
	
	public void count() {
		System.out.println(name + "가 " + num + "그루 있다");
	}
}

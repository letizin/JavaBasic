package program;

import java.util.*;

public class Pr02 {
	public static void main(String[] args) {
		Set<Person> set = new HashSet<>();
		
		set.add(new Person("김열공", 20));
		set.add(new Person("최고봉", 56));
		set.add(new Person("우등생", 16));
		set.add(new Person("나자바", 35));
		
		String setT = set.toString();
		
		for(Person data : set) {
			System.out.println(data.name + " : " + data.age);
		}
		
		System.out.println(set);
		
		System.out.println();
	}
}

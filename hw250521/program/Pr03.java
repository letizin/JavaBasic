package program;

import java.util.*;

public class Pr03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("김열공", 80);
		map.put("최고봉", 90);
		map.put("우등생", 95);
		map.put("나자바", 88);
		
		System.out.print("이름을 입력하세요 : ");
		String setname = sc.next();
		
		if(map.containsKey(setname)) {
			int setage = map.get(setname);
			System.out.println(setage);
		}
	}
}

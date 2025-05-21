package chell01;

import java.util.ArrayList;
import java.util.List;

public class Ch01 {
	public static void main(String[] args) {
		String[] date = {"서울","워싱턴","베이징","파리","마드리드"};
		List<String> capitals = new ArrayList<String>();
		
		for(String dateSet : date) {
			capitals.add(dateSet);
		}
		
		for(String set : capitals) {
			System.out.print(set + " ");
		}

		System.out.println();
		capitals.add("런던");
		
		for(String set : capitals) {
			System.out.print(set + " ");
		}
		
		System.out.println();
		for(String set : capitals) {
			if(set.length() < 3) {
				System.out.print(set + " ");
			}
		}
	}
}

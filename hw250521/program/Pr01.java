package program;

import java.util.ArrayList;
import java.util.List;

public class Pr01 {
	public static void main(String[] args) {
		String[] date = {"갈매기","나비","다람쥐","라마"};
		List<String> animal = new ArrayList<String>();
		
		for(String dateSet : date) {
			animal.add(dateSet);
		}
		
		for(String set : animal) {
			if(set.length() == 2) {
				System.out.print(set + " ");
			}
		}
	}
}

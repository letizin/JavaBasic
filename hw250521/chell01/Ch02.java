package chell01;

import java.util.*;

public class Ch02 {
	public static void main(String[] args) {
		Map<String, String> setData = new HashMap<>();
		
		setData.put("head", "대가빠리");
		setData.put("teacher", "쌤");
		setData.put("cat", "꼬네이");
		setData.put("aunt", "아지매");
		setData.put("noodle", "국시");
		setData.put("child", "얼라");
		
		for(String set : setData.keySet()) {
	         System.out.printf("%s=%s", set, setData.get(set));
	         System.out.print(" ");
	    }
	}
}

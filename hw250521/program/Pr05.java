package program;

import java.util.*;

public class Pr05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> scoreList = new ArrayList<Integer>();
		int setVale = 1;
		int maxV = 0;
		String Vset;
		do{
			System.out.print("점수를 입력하세요 : ");
			setVale = sc.nextInt();
			if(setVale > -1) {
				scoreList.add(setVale);
				if(maxV < setVale) {
					maxV = setVale;
				}
			}
		}while(setVale != -1);
		
		if(scoreList.size() > 0) {
			System.out.println("전체 학생은 " + scoreList.size() + "명이다.");

			System.out.print("학생들의 성적 : ");
			for(int set : scoreList) {
				System.out.print(set + " ");
			}
			
			System.out.println();
			
			for(int i=0; i<scoreList.size(); i++) {
				if(maxV-10 < scoreList.get(i)) {
					Vset = "A";
				}else if(maxV-20 < scoreList.get(i)) {
					Vset = "B";
				}else {
					Vset = "C";
				}
				System.out.println(i + "번 학생의 성적은" + scoreList.get(i) + "점이며 등급은 " + Vset +"이다");
			}
		}else {
			System.out.println("없어!!!!");
		}
	}
}

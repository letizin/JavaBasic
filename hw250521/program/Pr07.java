package program;

import java.util.*;

public class Pr07 {
    public static void main(String[] args) {
        String[] s1 = {"a", "b", "a", "b", "c"};
        String[] s2 = {"c"};

        // 배열을 List로 변환한 후 HashSet 생성
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();
        
        Collections.addAll(set1, s1);
        Collections.addAll(set2, s2);

        // 2개의 HashSet 객체를 출력
        System.out.println("set1: " + set1);
        System.out.println("set2: " + set2);

        // 2개의 HashSet 객체가 동일한지 비교한 값을 출력
        System.out.println("set1과 set2가 같다 : " + set1.equals(set2));

        // set1이 set2의 원소를 모두 포함하는지 출력
        System.out.println("set1이 set2의 모든 원소를 포함단 " + set1.containsAll(set2));

        // 합집합
        HashSet<String> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("합집합: " + union);

        // 교집합
        HashSet<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("교집합: " + intersection);
    }
}
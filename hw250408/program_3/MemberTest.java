package hw250408.program_3;

import java.util.Scanner;

public class MemberTest {
	public static void main(String[] args) {
		Member mb = new Member();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		mb.setName(name);

		System.out.print("아이디를 입력하세요 : ");
		String id = sc.next();
		mb.setId(id);

		System.out.print("암호를 입력하세요 : ");
		String pass = sc.next();
		mb.setPass(pass);

		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		mb.setAge(age);
		
		System.out.println(mb.toString());
	}
}

package if_else;

import java.util.Scanner;

public class TestClass03 {
	public static void main(String[] args) {
		String s1, s2;
		Scanner input = new Scanner(System.in);
		
		System.out.println("첫 번째 문자열");
		s1 = input.next();
		System.out.println("두 번째 문자열");
		s2 = input.next();
		
		System.out.println(s2.equals(s1));
		if(s1.equals(s2)) {
			System.out.println("s1과 s2는 같다");
		}else {
			System.out.println("s1과s2는 다르다");
		}
		System.out.println("다음 문장들 실행!!!!");
	}
}

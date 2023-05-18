package input;

import java.util.Scanner;

public class practice01 {
	public static void main(String[] args) {
		String name;
		int a, b, c;
		int hap=0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("당신의 이름은 무엇입니까? ");
		name = scan.next();
		System.out.print(name+" 님의 국어 점수: ");
		a = scan.nextInt();
		System.out.print(name+" 님의 영어 점수: ");
		b = scan.nextInt();
		System.out.print(name+" 님의 수학 점수: ");
		c = scan.nextInt();
		
		System.out.println("==================");
		System.out.println("이름: "+name);
		System.out.println("==================");
		System.out.println("국어: "+a);
		System.out.println("영어: "+b);
		System.out.println("수학: "+c);
		System.out.println("==================");
		hap = a+b+c;
		System.out.println("합계: "+hap);
		System.out.println("==================");
		
	}
}

package input;

import java.util.Scanner;

public class homework {
	public static void main(String[] args) {
		String name = null;
		int a, b, c;
		int avg;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("당신은 이 학원 학생이 맞습니까?(y/n) ");
		name = scan.next();
		if(name.equals("n")) {
			System.out.println("당신은 이 학원 학생이 아닙니다!!");
		}
		
		if(name.equals("y")) {
			System.out.print("국어 점수? ");
			a = scan.nextInt();
			System.out.print("수학 점수? ");
			b = scan.nextInt();
			System.out.print("영어 점수? ");
			c = scan.nextInt();
			
			System.out.println("==========점수 계산=========");
			System.out.println("환영합니다!! 점수 계산을 시작하겠습니다.");
			System.out.println("========각 과목 점수=========");
			System.out.println("국어 점수: "+a+"점");
			System.out.println("수학 점수: "+b+"점");
			System.out.println("영어 점수: "+c+"점");
			System.out.println("==========평균 점수=========");
			avg = (a+b+c)/3;
			System.out.println("평균 점수: "+avg+"점");
			
			System.out.println("=========자격 여부==========");
			if(avg <=59) {
				System.out.println("평균 이하....");
			}
			
			if(avg >=60) {
				System.out.println("평균 이상!!!!");
			}
			
		}
	}
}

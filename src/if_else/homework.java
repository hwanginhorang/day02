package if_else;

import java.util.Scanner;

public class homework {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b;
		int num;
		
		System.out.print("입력 받은 수: ");
		a = scan.nextInt();
		System.out.print("입력 받은 수: ");
		b = scan.nextInt();
		
		num = a * b;
		if(num % 2 ==0) {
			System.out.println("두 수를 곱한 값은 짝수입니다");
		}else {
			System.out.println("두 수를 곱한 값은 홀수입니다");
		}
		if(num == 0) {
			System.out.println("잘못입력");
		}else if(num % 2 == 0 && num != 0) {
			System.out.println("2의 배수입니다");
		}else if(num % 3 == 0 && num != 0) {
			System.out.println("3의 배수입니다");
		}else if(num % 5 == 0 && num != 0) {
			System.out.println("5의 배수입니다");
		}else if(num % 7 == 0 && num != 0) {
			System.out.println("7의 배수입니다");
		}else {
			System.out.println("배수 아님");
		}
		
		
		
	}
}

package if_else;

import java.util.Scanner;

public class Practice02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		
		System.out.println("입력 받은 수: ");
		num = scan.nextInt();
		System.out.println("입력 받은 수: ");
		num = scan.nextInt();
		
		
		if(num % 3 == 0 && num % 4 == 0 && num != 0) {
			System.out.println("3, 4의 배수입니다");
		}else if(num % 3 == 0 && num != 0) {
			System.out.println("3의 배수입니다");
		}else if(num % 4 == 0 && num != 0) {
			System.out.println("4의 배수입니다");
		}else if(num % 3 != 0 && num % 4 != 0 && num != 0){
			System.out.println("배수아님");
		}else {
			System.out.println("잘못입력");
		}
	
	}
}

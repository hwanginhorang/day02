package if_else;

import java.util.Scanner;

public class practice {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		
		System.out.println("입력 받은 수: " );
		num = scan.nextInt();
		
		if (num>0 && num<100){
			System.out.println("정상");
		}else {
			System.out.println("비정상");
		}
	}
}

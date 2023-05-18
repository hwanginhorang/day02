package operator;

import java.util.Scanner;

public class TestClass02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("수 입력");
		num = input.nextInt();
		/*String s = (num%2 == 0)?"짝수":"홀수";
		System.out.println(num+"는 "+s);*/
		// 입력한 수가 3의 배수인지 구분하시오
		String h = (num%3 == 0)?"3의 배수":"3의배수아님";
		System.out.print(num+"는"+h);
		
	}
}

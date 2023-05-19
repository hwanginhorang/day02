package homework;

import java.util.Scanner;

public class Dogon {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int age;
		
		System.out.println("나이를 입력하시오: ");
		age = scan.nextInt();
		
		if(age >= 20) {
			if(age>=20 && age<=39) {
				System.out.println("청년입니다");
			}else if(age>=39) {
				System.out.println("중장년입니다");
			}
		}
		
		if(age<=19) {
			if(age>=14 && age<=19) {
				System.out.println("청소년입니다");
			}else if(age<14) {
				System.out.println("어린이입니다");
			}
		}
	}
}

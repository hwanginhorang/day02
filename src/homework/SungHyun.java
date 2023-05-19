package homework;

import java.util.Scanner;

public class SungHyun {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h, m, t;
		
		System.out.println("몇시인지 입력하시오: ");
		h = scan.nextInt();
		System.out.println("몇분인지 입력하시오: ");
		m = scan.nextInt();
		
		if(h==0) {
			h=23;
			m=60+(-45+m);
		}else {
			t = ((h*60) + m)-45;
			h = t/60;
			m = t%60;
		}
		System.out.println(h+"시"+m+"분");
		
		
	}
}

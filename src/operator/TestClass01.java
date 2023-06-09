package operator;

public class TestClass01 {
	public static void main(String[] args) {
		/*
		 +, -, *, /, %
		 /: 정수 / 정수 = 정수
		 /: 정수 / 실수 = 실수(연산 중 하나라도 실수가 있다면 결과는 실수)
		 %(mod) : 정수 % 정수 = 나머지 값
		 어떤수가 짝수, 홀수, 배수
		 */
		int n1=9, n2=2;
		System.out.println(n1 + n2);
		System.out.println(n1 - n2);
		System.out.println(n1 * n2);
		System.out.println(n1 / n2);
		System.out.println(n1 / (float)n2);
		System.out.println(n1 % n2);
		/*
		 * 복합대입연산자
		   n1 = 5;
		   n1 +=10; // n1 = n1 + 10;
		 */
		n1 = n2 = 5;
		System.out.println("=============================");
		n1+=1;
		System.out.println(n1);
		n1-=1;
		System.out.println(n1);
		n1*=1;
		System.out.println(n1);
		n1/=1;
		System.out.println(n1);
		n1%=1;
		System.out.println(n1);
		
		/*
		 * 관계연산자
		   결과적으로 true 또는 false를 알려준다
		   n1 = 10, n2 = 5;
		   >, <, >=, <=, ==, !=
		   n1>n2 = true
		   n1<=n2 = false
		 */
		System.out.println("============================");
		n1 = 10; n2 = 5;
		System.out.println(n1 > n2);//t
		System.out.println(n1 == n2);//f
		System.out.println(n1 == 10);//t
		System.out.println(n1 != n2);//t
		System.out.println(n1 != 10);//f
		
		/*
		 * 논리연산자
		   ||(or) : 식 중 하나라도 true(참)이면 결과는 true(참)이다
		   &&(and) : 모두가 참일 때 결과는 참이다
		             하나라도 거짓이면 결과는 거짓
		   !(not) : 결과는 반전시켜준다
		            !true => false, !false => true
		 */
		
		System.out.println("==========논리연산자=========");
		System.out.println("-- or --");
		System.out.println(true||true);
		System.out.println(true||false);
		System.out.println(false||false);
		System.out.println("-- and --");
		System.out.println(true&&true);
		System.out.println(true&&false);
		System.out.println(false&&false);
		System.out.println("-- not --");
		System.out.println(!true);//f
		System.out.println(!(10 < 5));//t
		
		/*
		 * 증감연산자
		   결과적으로 자기자신을 1증가 또는 감소
		   n1 = 10;
		   n1++; => n1 = n1 + 1;
		   ++n1; => n1 = n1 + 1;
		   --n1; => n1 = n1 - 1;
		   n1--; => n1 = n1 - 1;
		 */
		
		System.out.println("=== 증감 연산자 ===");
		n1 = 10;
		n2 = n1++;
		System.out.println(n1);
		System.out.println(n2);
		
		n1 = 10;
		n2 = ++n1;
		System.out.println(n1);
		System.out.println(n2);
		
	}
}

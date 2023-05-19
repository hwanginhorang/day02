package if_else;

public class TestClass02 {
	public static void main(String[] args) {
		int num = 50;
		if(num > 0 && num < 100) {
			System.out.println("0보다크다");
			if(num < 100) {
				System.out.println("0보다크고 100보다작다");
			}else {
				System.out.println("0보다크고 100보다크고");
			}
		}else {
			System.out.println("0보다작다");
		}
	}
}

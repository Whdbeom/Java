package failed;

import java.util.Scanner;

public class A10952 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		
		while(sc.hasNextInt()) {
			// scanner를 통해 정수를 입력받는 경우 true
			// 정수가 아닌 수를 입력받는 경우 false를 반환하는 메서드
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(a+b);

			}
		
	}

}

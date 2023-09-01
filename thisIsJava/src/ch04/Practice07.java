package ch04;

import java.util.Scanner;

public class Practice07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = 0; 
		int b = 0; 
		int c = 0;
		while(true) {
			System.out.println("-------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4.종료");
			System.out.println("-------------------------------------");
			int num = sc.nextInt();
			System.out.println("선택> " + num );
			if(num == 1) {
				System.out.print(" 예금 하실 금액은? : ");
				int num2 = sc.nextInt();
				a += num2;
				System.out.println("예금액>" + num2 );
			} else if(num == 2) {
				System.out.print(" 출금 하실 금액은? : ");
				int num2 = sc.nextInt();
				a -= num2;
				System.out.println("출금액>" + num2);
			} else if(num == 3) {
				System.out.println("잔고>" + a);
			} else if(num == 4) {
					System.out.println("프로그램 종료");
						break;
			}
			
			
		}

	}

}

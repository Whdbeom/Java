package jbjb.account;

import java.util.Scanner;

public class Main {
	
/*
문제 7 - 위에서 구현된 클래스 Account에서 다음 기능을 추가하여 작성하시오.
· 메소드 deposit()의 헤드는 다음과 같으며 인자인 금액을 저축하는 메소드
	public long deposit(long amount)
· 메소드 withdraw()의 헤드는 다음과 같으며 인자인 금액을 인출하는 메소드
	public long withdraw(long amount)
· Account 클래스의 main() 메소드에서 Account 객체를 생성하여 
	적당한 저축과 인출을 수행한 후 잔금을 출력

 */

	public static void main(String[] args) {
	
		Account account = new Account();
		Scanner sc = new Scanner(System.in);
		boolean exit = true;
	
		while(exit) {
			System.out.println("1.입금 2.출금 3.잔고 4. 종료");
			int select = sc.nextInt();
			switch(select) {
			case 1 :
				System.out.println("얼마 입금 ? ");
				account.deposit(sc.nextInt()); break;
			case 2 : 
				System.out.println("얼마 출금 ? "); 
				account.withdraw(sc.nextInt()); break;
			case 3 :
				System.out.println("잔고 > " + account.getBalance());  break;
			case 4 : 
				System.out.println("종료할게"); exit = false;
			}
		}
	}
}

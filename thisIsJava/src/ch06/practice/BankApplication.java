package ch06.practice;

import java.util.Scanner;

public class BankApplication {


	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		

		BankMenu bankMenu = new BankMenu();
		
		boolean tr = true;
		
		while(tr) {
		System.out.println("-----------------------------------------------");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
		System.out.println("-----------------------------------------------");
		System.out.print("선택 > ");
		int select = sc.nextInt();
		
			switch(select) {
			case 1: bankMenu.makeAccount(); break;
			case 2: bankMenu.accountList(); break;
			case 3: bankMenu.deposit(); break;
			case 4: bankMenu.withdraw(); break;
			case 5: System.out.println("프로그램 종료"); tr = false;
			}
		}
		
	}

}

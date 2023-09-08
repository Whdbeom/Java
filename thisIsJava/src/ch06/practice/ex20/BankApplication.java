package ch06.practice.ex20;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Account acc = new Account();
		boolean run = true;
		while(run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-----------------------------------------------");
			System.out.print("선택 > ");
			int selectNum = sc.nextInt();
			
			switch(selectNum) {
				case 1 : acc.makeAccount(); break;
				case 2 : acc.accountList(); break;
				case 3 : acc.deposit(); break;
				case 4 : acc.withdraw(); break;
				case 5 :  
						System.out.println("프로그램 종료");
							run = false;
			}
		}	
	
	}

}

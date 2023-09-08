package ch06.practice.ex20;

import java.util.Scanner;

import ch06.practice.answer.Account;

public class BankManager {

	Scanner sc = new Scanner(System.in);
	Account account = new Account();
	int select;
	
	public void start() {
		System.out.println("-----------------------------------------------");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 5.종료");
		System.out.println("-----------------------------------------------");
		System.out.print("선택 > ");
		select = sc.nextInt();
	}
	
	public void makeAccount() {
		System.out.println("--------------");
		System.out.println("계좌 생성");
		System.out.println("--------------");
		System.out.print("계좌 번호 : ");
		String acc = sc.next();
		System.out.print("계좌주 : ");
		String accName = sc.next();
		System.out.println("결과 : 계좌가 생성되었습니다.");
	}
}

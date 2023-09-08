package ch06.practice;

import java.util.Scanner;

public class BankMenu {
	Scanner sc = new Scanner(System.in);
	private static BankAccount[] accountArray = new BankAccount[100];

	public void makeAccount() {
		System.out.println("----------");
		System.out.println("계좌생성");
		System.out.println("----------");
		System.out.print("계좌 번호 : ");
		String account = sc.next();
		System.out.print("계좌주 : ");
		String name = sc.next();
		System.out.print("초기입금액 : ");
		int balance = sc.nextInt();
		
		BankAccount newAccount = new BankAccount(account, name, balance);
		for( int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
		}

	}

	public void accountList() {
		System.out.println("----------");
		System.out.println("계좌목록");
		System.out.println("----------");
			for(int i = 0; i < accountArray.length; i++) {
				BankAccount account = accountArray[i];
				if(account != null) {
				System.out.println(account.getAccount() +"     "+ account.getName() +"     "+ account.getBalance());
				} else {
					break;
			}
		}
	}
	
	
	public void deposit() {
		System.out.println("----------");
		System.out.println("예금");
		System.out.println("----------");
		System.out.print("계좌번호 : ");
		String acc = sc.next();
		System.out.print("예금액  : ");
		int deposit = sc.nextInt();
		BankAccount account = findAccount(acc);
		if (account == null) {
			System.out.println("결과: 계좌가 없습니다.");
			return;
		}
		account.setDeposit(deposit);
	}
	
	public void withdraw() {
		System.out.println("----------");
		System.out.println("출금");
		System.out.println("----------");
		System.out.print("계좌번호 : ");
		String acc = sc.next();
		System.out.print("출금액  : ");
		int withdraw = sc.nextInt();
		BankAccount account = findAccount(acc);
		if(account == null) {
			System.out.println("결과: 계좌가 없습니다");
			return;
		}
		account.setWithdraw(withdraw);	
	}
	
	public BankAccount findAccount(String acc) {
		BankAccount account = null;
		for(int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] != null) {
				String dbAcc = accountArray[i].getAccount();
				if(dbAcc.equals(acc)){
					account = accountArray[i];
					break;
				}
			}
		}
		return account;
	}
	
}

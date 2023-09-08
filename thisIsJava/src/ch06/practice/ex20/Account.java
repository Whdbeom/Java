package ch06.practice.ex20;

import java.util.Scanner;

public class Account {
	
	public Account() {
		
	}
	
	public Account(String account, String owner, int balance ) {
		this.account = account;
		this.owner = owner;
		this.balance = balance;		
	}
	Account[] accArray = new Account[100];
	public static final Scanner sc = new Scanner(System.in);
	
	
	private String account;
	private String owner;
	private int balance;
	private int deposit;
	private int withdraw;
	private int selectNum;
	private boolean exit = true;
//	public static String userInput = scanUserInput();
	
	
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getDeposit() {
		return deposit;
	}
	public boolean isExit() {
		return exit;
	}
	public void setExit(boolean exit) {
		this.exit = exit;
	}

	public void setDeposit(int deposit) {
		if(deposit < 0) {
			System.out.println("음수 안돼");
		} else {
		this.balance += deposit;
		}
	}

	public int getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(int withdraw) {
		if(withdraw < this.balance) {
			this.balance -= withdraw;
		} else if(withdraw < 0){
			System.out.println("음수 안돼");
		} else {
			System.out.println("결과 : 잔고가 부족합니다");
		}
	}

//	public void start() {
//		System.out.println("-----------------------------------------------");
//		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
//		System.out.println("-----------------------------------------------");
//		System.out.print("선택 > ");
//		this.selectNum = sc.nextInt();
//	}
	
	
	
	public void makeAccount() {
		System.out.println("--------------");
		System.out.println("계좌 생성");
		System.out.println("--------------");
		System.out.print("계좌 번호 : ");
		String acc = sc.next();
		System.out.print("계좌주 : ");
		String name = sc.next();
		System.out.print("초기입금액 : ");
		int balance = sc.nextInt();
		
//		Account newAccount = new Account(acc, name, balance);
//		for(int i = 0; i < accArray.length; i++) {
//			if(accArray[i].getAccount().equals(acc)) {
//				System.out.println("중복된 계좌번호");	
//			}
//		}
		
		for(int i = 0; i < accArray.length; i++) {
			if(accArray[i] == null) {
				accArray[i] = new Account(acc, name, balance);
				System.out.println("결과 : 계좌가 생성되었습니다.");				
					break;
			}
			if(accArray[i].getAccount().equals(acc)) {
				System.out.println("===============");
				System.out.println("중복된 계좌번호입니다.");	
				System.out.println("===============");
					break;
			}
		}
		
	}
	
	
	public void accountList() {
		System.out.println("--------------");
		System.out.println("계좌 목록");
		System.out.println("--------------");
		for(int i = 0; i < accArray.length; i++) {
			if(accArray[i] != null) {
				System.out.println(accArray[i].getAccount() + "     " + accArray[i].getOwner() + "     " + accArray[i].balance);
			}
		}
	}
	
	public void deposit() {
		System.out.println("--------------");
		System.out.println("예금");
		System.out.println("--------------");
		System.out.print("계좌번호 : ");
		String acc = sc.next();
		System.out.print("예금액 : ");
		int deposit = sc.nextInt();
		Account account = findAccount(acc);
		if(account == null) {
			System.out.println("결과 : 존재하지 않는 계좌입니다");
			return;
		}
		account.setBalance(account.getBalance() + deposit);
		System.out.println("결과 : 예금 완료");
	}
	
	
	public void withdraw() {
		System.out.println("--------------");
		System.out.println("출금");
		System.out.println("--------------");
		System.out.print("계좌번호 : ");
		String acc = sc.next();
		System.out.print("출금액 : ");
		int withdraw = sc.nextInt();
		Account account = findAccount(acc);
		if(account == null) {
			System.out.println("존재하지 않는 계좌입니다");
			return;
		}
		account.setBalance(account.getBalance() - withdraw);
		System.out.println("결과 : 출금 완료");
	}
	
	public Account findAccount(String account) {
		Account acc = null;
		for(int i = 0; i < accArray.length; i++) {
			if(accArray[i] != null) {
				String dbAcc = accArray[i].getAccount();
			if (dbAcc.equals(account)) {
				acc = accArray[i];
				break;
			}
			}	
		}
		return acc;
	}
		
	
	
	public static String scanUserInput() {
		String x = sc.next();
		return x;
	}
}

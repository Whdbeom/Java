package ch06.practice;


public class BankAccount {

	private String account;
	private String name;
	private int deposit;
	private int withdraw;
	private int balance;
	
	public BankAccount(String account, String name, int balance) {
		this.account = account;
		this.name = name;
		this.balance = balance;
	}
	
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDeposit() {
		return deposit;
	}
	public void setDeposit(int deposit) {
		if(deposit >= 0) {
		this.balance += deposit;
		this.deposit = deposit;
		System.out.println("결과: 예금이 완료되었습니다.");
		} else { 
			System.out.println("음수 안돼요");
		}
	}
	public int getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(int withdraw) {
		if(withdraw >= 0) {
		this.balance -= withdraw;
		this.withdraw = withdraw;
		System.out.println("결과: 출금이 완료되었습니다.");
		} else {
			System.out.println("음수는 안돼요");
		}
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	

	
	
}

package ch06.practice;

public class Account {
	
	private int balance;
	private final int MAX = 1000000;
	private final int MIN = 0;
	
	
	public int getBalance() {
		return balance;
	}

	public int setBalance(int balance) {
		if(balance >= MIN && balance <= MAX) {
			this.balance += balance;
		}
		return balance;
	}
	


}

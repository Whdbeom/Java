package jbjb.account;

public class Account {

	/*
문제 6 -   다음을 만족하는 클래스 Account를 작성하시오.
· 다음의 2 개의 필드를 선언
private String owner;
private long balance;
· 위 모든 필드에 대한 getter와 setter의 구현
· 위 모든 필드를 사용하는 가능한 모든 생성자의 구현
	 */
	
	private String owner;
	private int balance;
	private int amount;
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	public void deposit(int amount) {
		this.balance += amount;
		
	}
/*	
문제 8 - 위에서 구현된 메소드 withdraw()를 다음 조건에 맞게 다시 작성하시오.
· 인출 상한 금액은 잔액까지로 하며, 이 경우 이러한 상황을 출력
· 클래스 AccountTest의 main() 메소드에서 
	인출 상한 이상의 금액을 인출하려는 메소드를 호출하여 출력
 */
	public void withdraw(int amount) {
		if(amount > this.balance) {
			System.out.println("잔액이 부족해요,,,,");
		} else {
			this.balance -= amount;
		}
	
	}
	
}

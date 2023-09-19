package data;

public class User {

	
	private String accountNum;
	private String accountName;
	private String accountPwd;
	private int account;
	private int money;
	
	public User(String accountNum, String accountName, String accountPwd, int account, int money) {
		this.accountNum = accountNum;
		this.accountName = accountName;
		this.accountPwd = accountPwd;
		this.account = account;
		this.money = money;

	}
	
	
	
	public int getAccount() {
		return account;
	}
	public void setAccount(int account) {
		this.account = account;
	}
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public String getAccountPwd() {
		return accountPwd;
	}
	public void setAccountPwd(String accountPwd) {
		this.accountPwd = accountPwd;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountPass() {
		return accountPwd;
	}
	public void setAccountPass(String accountPwd) {
		this.accountPwd = accountPwd;
	}
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	@Override
	public String toString() {
		return "은행 [  고객명 : " + accountName + "   | 비밀번호 : " + accountPwd+"  \n";
	}
	
	@Override
	public int hashCode() {
		
		return super.hashCode();
	}
	
	
}

package account;

public class Account {
	
	 private int adhaarNo,accountNo,balance;
	 private String accountTyape,accountNmae;
	
	  
	public Account(int adhaarNo, int accountNo, int balance, String accountTyape, String accountNmae) {
		super();
		this.adhaarNo = adhaarNo;
		this.accountNo = accountNo;
		this.balance = balance;
		this.accountTyape = accountTyape;
		this.accountNmae = accountNmae;
	}
	public int getAdhaarNo() {
		return adhaarNo;
	}
	public void setAdhaarNo(int adhaarNo) {
		this.adhaarNo = adhaarNo;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getAccountTyape() {
		return accountTyape;
	}
	public void setAccountTyape(String accountTyape) {
		this.accountTyape = accountTyape;
	}
	public String getAccountNmae() {
		return accountNmae;
	}
	public void setAccountNmae(String accountNmae) {
		this.accountNmae = accountNmae;
	}
	@Override
	public String toString() {
		return "Account [adhaarNo=" + adhaarNo + ", accountNo=" + accountNo + ", balance=" + balance + ", accountTyape="
				+ accountTyape + ", accountNmae=" + accountNmae + "]";
	}
	 

}

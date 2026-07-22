package orientacaoObjetos.entities;

public class BankAccount {
	 
	private int accountNumber;
	private String accountName;
	private double balance;
	
	public BankAccount() {
		
	}
	
	public BankAccount(int accountNumber, String accountName, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		deposit(initialDeposit);
	}
	
	public BankAccount(int accountNumber, String accountName) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= (amount + 5.00);
	}
	public String toString() {
		return "Account:"
				+ accountNumber
				+ ", Holder: "
				+ accountName
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
}

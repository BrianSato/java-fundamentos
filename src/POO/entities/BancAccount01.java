package POO.entities;

import POO.exceptions.BancAccount01Exception;

public class BancAccount01 {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public BancAccount01() {
		super();
	}

	public BancAccount01(Integer number, String holder, Double balance, Double withdrawLimit) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	public void validateWithdraw(double amount) {
		if(getWithdrawLimit() < amount) {
			throw new BancAccount01Exception("The amount exceeds withdraw limit");
		}
		if(getBalance() < amount) {
			throw new BancAccount01Exception("Not enough balance");
		}
	}
}

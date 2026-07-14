package com.kodewala.bank.account;

public class Account {

	private String accountNumber;
	private String holderName;
	private int balance;
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void printAccountDetails()
	{
		System.out.println("Account holder name : " + holderName + ", acc. no. : " + accountNumber + ", balance : " +balance);
	}
	
	public void deposit(int amt)
	{
		setBalance(balance + amt);
		System.out.println("new balance is : " +this.balance);
	}
	
	public void withdraw(int amt)
	{
		if(amt <= this.balance)
		{
			this.balance-= amt;
			System.out.println("new balance is : " +this.balance);
		}
		else
		{
			System.out.println("insufficient balance");
		}
	}
}

package com.anz.wholesale.bean;

public class AccountList {
	private int accountNumber;
	private String accountName;
	private String accountType;
	private String BalanceDate;
	private String Currency;
	private double balanceAmount;
	
	public AccountList(int accountNumber, String accountName, String accountType, String balanceDate, String currency,
			double balanceAmount) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.accountType = accountType;
		BalanceDate = balanceDate;
		Currency = currency;
		this.balanceAmount = balanceAmount;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getBalanceDate() {
		return BalanceDate;
	}
	public void setBalanceDate(String balanceDate) {
		BalanceDate = balanceDate;
	}
	public String getCurrency() {
		return Currency;
	}
	public void setCurrency(String currency) {
		Currency = currency;
	}
	public double getBalanceAmount() {
		return balanceAmount;
	}
	public void setBalanceAmount(double balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountName=" + accountName + ", accountType="
				+ accountType + ", BalanceDate=" + BalanceDate + ", Currency=" + Currency + ", balanceAmount="
				+ balanceAmount + "]";
	}
	
}

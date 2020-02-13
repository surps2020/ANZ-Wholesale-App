package com.anz.wholesale.bean;

public class AccountTranscation {

	private String accountNumber;
	private String accountName;
	private String valueDate;
	private String currency;
	private double debitAmount;
	private double creditAmount;
	private String CardType;
	private String TranscationNarrative;
	

	public AccountTranscation() {
		// TODO Auto-generated constructor stub
	}

	public AccountTranscation(String accountNumber, String accountName, String valueDate, String currency, double debitAmount,
			double creditAmount, String cardType, String transcationNarrative) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.valueDate = valueDate;
		this.currency = currency;
		this.debitAmount = debitAmount;
		this.creditAmount = creditAmount;
		CardType = cardType;
		TranscationNarrative = transcationNarrative;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getValueDate() {
		return valueDate;
	}
	public void setValueDate(String valueDate) {
		this.valueDate = valueDate;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public double getDebitAmount() {
		return debitAmount;
	}
	public void setDebitAmount(double debitAmount) {
		this.debitAmount = debitAmount;
	}
	public double getCreditAmount() {
		return creditAmount;
	}
	public void setCreditAmount(double creditAmount) {
		this.creditAmount = creditAmount;
	}
	public String getCardType() {
		return CardType;
	}
	public void setCardType(String cardType) {
		CardType = cardType;
	}
	public String getTranscationNarrative() {
		return TranscationNarrative;
	}
	public void setTranscationNarrative(String transcationNarrative) {
		TranscationNarrative = transcationNarrative;
	}	
	
}

package com.cognizant.ProcessPensionMicroservice.model;

public class BankDetails {
	private String bankName;
	private String accountNumber;
	private String bankType;
	public String getBankName() {
		return bankName;
	}
	public BankDetails() {
	}
	public BankDetails(String bankName, String accountNumber, String bankType) {
		this.bankName = bankName;
		this.accountNumber = accountNumber;
		this.bankType = bankType;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getBankType() {
		return bankType;
	}
	public void setBankType(String bankType) {
		this.bankType = bankType;
	}
	@Override
	public String toString() {
		return "BankDetail [bankName=" + bankName + ", accountNumber=" + accountNumber + ", bankType=" + bankType + "]";
	}
	
	
}

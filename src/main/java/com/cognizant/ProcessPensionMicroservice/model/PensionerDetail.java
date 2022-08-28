package com.cognizant.ProcessPensionMicroservice.model;

public class PensionerDetail {
	private String aadhaarNumber;
	private String name;
	private String DOB;
	private String panNumber;
	private double salary;
	private double allowance;
	private String pensionType;
	private BankDetails bankDetails;
	public PensionerDetail() {
	}
	
	
	
	public PensionerDetail(String aadhaarNumber, String name, String dOB, String panNumber, double salary,
			double allowance, String pensionType, BankDetails bankDetails) {
		super();
		this.aadhaarNumber = aadhaarNumber;
		this.name = name;
		DOB = dOB;
		this.panNumber = panNumber;
		this.salary = salary;
		this.allowance = allowance;
		this.pensionType = pensionType;
		this.bankDetails = bankDetails;
	}



	public String getAadhaarNumber() {
		return aadhaarNumber;
	}



	public void setAadhaarNumber(String aadhaarNumber) {
		this.aadhaarNumber = aadhaarNumber;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDOB() {
		return DOB;
	}



	public void setDOB(String dOB) {
		DOB = dOB;
	}



	public String getPanNumber() {
		return panNumber;
	}



	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	public double getAllowance() {
		return allowance;
	}



	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}



	public String getPensionType() {
		return pensionType;
	}



	public void setPensionType(String pensionType) {
		this.pensionType = pensionType;
	}



	public BankDetails getBankDetails() {
		return bankDetails;
	}



	public void setBankDetails(BankDetails bankDetails) {
		this.bankDetails = bankDetails;
	}



	@Override
	public String toString() {
		return "PensionerDetail [aadhaarNumber=" + aadhaarNumber + ", name=" + name + ", DOB=" + DOB + ", panNumber="
				+ panNumber + ", salary=" + salary + ", allowance=" + allowance + ", pensionType=" + pensionType
				+ ", bankDetail=" + bankDetails + "]";
	}
	
	
	
}

package com.cognizant.ProcessPensionMicroservice.model;

public class ProcessPensionInput {
	private String aadhaarNumber;

	public ProcessPensionInput() {
	}

	public ProcessPensionInput(String aadhaarNumber) {
		this.aadhaarNumber = aadhaarNumber;
	}

	public String getAadhaarNumber() {
		return aadhaarNumber;
	}

	public void setAadharNumber(String aadhaarNumber) {
		this.aadhaarNumber = aadhaarNumber;
	}

	
}

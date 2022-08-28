package com.cognizant.ProcessPensionMicroservice.model;

public class ProcessPensionResponse {
	private int processPensionStatusCode;

	public ProcessPensionResponse(int processPensionStatusCode) {
		this.processPensionStatusCode = processPensionStatusCode;
	}

	public ProcessPensionResponse() {
		super();
	}

	public int getProcessPensionStatusCode() {
		return processPensionStatusCode;
	}

	public void setProcessPensionStatusCode(int processPensionStatusCode) {
		this.processPensionStatusCode = processPensionStatusCode;
	}
	
}

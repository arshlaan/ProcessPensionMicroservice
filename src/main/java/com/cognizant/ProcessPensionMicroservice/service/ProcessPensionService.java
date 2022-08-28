package com.cognizant.ProcessPensionMicroservice.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ProcessPensionMicroservice.model.PensionDetail;
import com.cognizant.ProcessPensionMicroservice.model.PensionerDetail;
import com.cognizant.ProcessPensionMicroservice.model.ProcessPensionInput;
import com.cognizant.ProcessPensionMicroservice.model.ProcessPensionResponse;
import com.cognizant.ProcessPensionMicroservice.repository.ProcessPensionRepository;

@Service
public class ProcessPensionService {
	private static final Logger LOGGER = LoggerFactory.getLogger(ProcessPensionService.class);
	private ProcessPensionRepository processPensionRepository;

	@Autowired
	public ProcessPensionService(ProcessPensionRepository processPensionRepository) {
		this.processPensionRepository = processPensionRepository;

	}

	public PensionDetail getPensionDetail(PensionerDetail pensionerDetail, ProcessPensionInput processPensionInput) {
		System.out.println(pensionerDetail.toString());
		System.out.println(pensionerDetail.getBankDetails().toString());
		double pensionAmount = 0;
		double bankServiceCharge=0;
		ProcessPensionResponse processPensionResponse = new ProcessPensionResponse();

		if (pensionerDetail.getPensionType().equalsIgnoreCase("self")) {
			pensionAmount = (0.8 * pensionerDetail.getSalary() + pensionerDetail.getAllowance());
		} else if (pensionerDetail.getPensionType().equalsIgnoreCase("family")) {
			pensionAmount = (0.5 * pensionerDetail.getSalary() + pensionerDetail.getAllowance());
		}

		if (pensionerDetail.getBankDetails().getBankType().equalsIgnoreCase("private")) {
			bankServiceCharge = 550;
			processPensionResponse.setProcessPensionStatusCode(10);
		} else if (pensionerDetail.getBankDetails().getBankType().equalsIgnoreCase("public")) {
			bankServiceCharge = 500;
			processPensionResponse.setProcessPensionStatusCode(10);
		}
		PensionDetail pensionDetail = new PensionDetail(pensionerDetail.getAadhaarNumber(),pensionAmount,bankServiceCharge);

		return pensionDetail;
	}

	public PensionDetail savePensionDetail(PensionDetail pensionDetail) {
		// TODO Auto-generated method stub
		return processPensionRepository.save(pensionDetail);
	}

}

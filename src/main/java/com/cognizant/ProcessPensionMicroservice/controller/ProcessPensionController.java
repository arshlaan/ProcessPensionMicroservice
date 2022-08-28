package com.cognizant.ProcessPensionMicroservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.ProcessPensionMicroservice.authorization.PensionerDetailClient;
import com.cognizant.ProcessPensionMicroservice.exception.ProcessPensionException;
import com.cognizant.ProcessPensionMicroservice.model.PensionDetail;
import com.cognizant.ProcessPensionMicroservice.model.ProcessPensionInput;
import com.cognizant.ProcessPensionMicroservice.service.ProcessPensionService;

@RestController
@CrossOrigin
public class ProcessPensionController {
	private static final Logger LOGGER = LoggerFactory.getLogger(ProcessPensionController.class);
	private PensionerDetailClient pensionerDetailClient;
	private ProcessPensionService processPensionService;

	@Autowired
	public ProcessPensionController(PensionerDetailClient pensionerDetailClient,
			ProcessPensionService processPensionService) {
		this.pensionerDetailClient = pensionerDetailClient;
		this.processPensionService = processPensionService;
	}



	@PostMapping("/processPension")
	public PensionDetail getPensionDetail(@RequestHeader(name = "Authorization") String token,
			@RequestBody ProcessPensionInput processPensionInput) {
		PensionDetail pensionDetail = null;
		System.out.println("Started");
		try {
		
			pensionDetail = processPensionService.getPensionDetail(
					pensionerDetailClient.findByAadhaarNumber(token, processPensionInput.getAadhaarNumber()),
					processPensionInput);
			System.out.println(pensionerDetailClient.findByAadhaarNumber(token, processPensionInput.getAadhaarNumber()).getBankDetails().toString());
			

		} catch (Exception e) {
			System.out.println(e);
			LOGGER.error("Exception in getPensionDetail rest");
			throw new ProcessPensionException("Pensioner Detail not found.");
		}
		
		return processPensionService.savePensionDetail(pensionDetail);

	}

}

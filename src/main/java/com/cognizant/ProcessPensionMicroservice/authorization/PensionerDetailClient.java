package com.cognizant.ProcessPensionMicroservice.authorization;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

import com.cognizant.ProcessPensionMicroservice.model.PensionerDetail;

@FeignClient(name= "PensionerDetailService", url="${PENSIONER_DETAIL_URL:localhost:8100}")
public interface PensionerDetailClient {

	@GetMapping("/pensioner-detail-service/pensionerDetails/{aadhaarNumber}")
	public PensionerDetail findByAadhaarNumber(@RequestHeader("Authorization")String token1 , @PathVariable String aadhaarNumber);
	

}

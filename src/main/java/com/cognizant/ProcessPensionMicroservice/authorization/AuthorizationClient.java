package com.cognizant.ProcessPensionMicroservice.authorization;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name="authorizationService", url = "${AUTHOTIZATION_URL:localhost:8200}")

public interface AuthorizationClient {
	
	@GetMapping("/authorization-service/authorize")
	public Boolean authorization(@RequestHeader("Authorization") String token);
}

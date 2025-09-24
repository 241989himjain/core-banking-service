package com.hmr.infotech.core.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/account")
public class AccountController {
	
	@GetMapping("/details")
	public ResponseEntity<String> getAccountDetails() {
		return new ResponseEntity<String>("API's under development", HttpStatus.OK);
		
	}

}

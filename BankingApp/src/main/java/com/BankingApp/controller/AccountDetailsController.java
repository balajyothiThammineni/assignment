package com.BankingApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BankingApp.model.AccountDetails;
import com.BankingApp.service.AccountDetailsService;

@RestController
public class AccountDetailsController {
	
	@Autowired
	private AccountDetailsService AccountDetailsService;

	
	
	@PostMapping("/details/add") 
	public AccountDetails postAccountDetails(@RequestBody AccountDetails accountDetails) {
		accountDetails = AccountDetailsService.postAccountHolder(accountDetails);
		return accountDetails;
	}
}

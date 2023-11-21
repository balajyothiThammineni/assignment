package com.BankingApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BankingApp.model.Account;
import com.BankingApp.service.AccountService;

@RestController
public class AccountController {
	@Autowired
	private AccountService accountService;
	
	
	
	@PostMapping("/account/add") 
	public Account postAccount(@RequestBody Account account) {
		account = accountService.postAccount(account);
		return account;
	}
	
	

}

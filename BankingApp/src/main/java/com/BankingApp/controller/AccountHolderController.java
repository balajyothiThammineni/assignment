package com.BankingApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BankingApp.model.AccountHolder;
import com.BankingApp.service.AccountHolderService;


@RestController
public class AccountHolderController {
	@Autowired
	private AccountHolderService accountHolderService;
	
	
	@PostMapping("/accountholder/add") 
	public AccountHolder postAccountHolder(@RequestBody AccountHolder accountHolder) {
		accountHolder = accountHolderService.postAccountHolder(accountHolder);
		return accountHolder;
	}

	@GetMapping("/getall")
    public List<AccountHolder> getAllAccountHolder(){
		return accountHolderService.getAll();
	}
	

	

}

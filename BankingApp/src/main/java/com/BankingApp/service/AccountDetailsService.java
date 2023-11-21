package com.BankingApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BankingApp.model.AccountDetails;
import com.BankingApp.repository.AccountDetailsRepository;

@Service
public class AccountDetailsService {
	
	@Autowired
	private AccountDetailsRepository accountDetailsRepository;

	public AccountDetails postAccountHolder(AccountDetails accountDetails) {
		// TODO Auto-generated method stub
		return accountDetailsRepository.save(accountDetails);
	}

}

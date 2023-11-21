package com.BankingApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BankingApp.exception.InvalidIdException;
import com.BankingApp.model.AccountHolder;
import com.BankingApp.repository.AccountHolderRepository;
@Service
public class AccountHolderService {
	
	
     @Autowired
     private AccountHolderRepository accountHolderRepository;

	public AccountHolder postAccountHolder(AccountHolder accountHolder) {
	
		return accountHolderRepository.save(accountHolder);
	}

	

//	public AccountHolder getOne(int id) throws  {
//		Optional<AccountHolder> optional =accountHolderRepository.findById(id)
//				if(!optional.isPresent()){
//					throw new InvalidIdException(" ID Invalid");
//				}
//				return optional.get();
//	}



	public List<AccountHolder> getAll() {
		// TODO Auto-generated method stub
		return accountHolderRepository.findAll();
	}
     
}
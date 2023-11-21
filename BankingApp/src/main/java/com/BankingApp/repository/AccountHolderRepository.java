package com.BankingApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BankingApp.model.AccountHolder;


@Repository
public interface AccountHolderRepository extends JpaRepository<AccountHolder,Integer> {
	

	



}

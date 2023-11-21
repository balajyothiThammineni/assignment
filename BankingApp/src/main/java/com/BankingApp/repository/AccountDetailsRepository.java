package com.BankingApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BankingApp.model.AccountDetails;

@Repository
public interface AccountDetailsRepository extends JpaRepository<AccountDetails,Integer> {

}

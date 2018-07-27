package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.bean.Account;

public interface IWalletDBAccess extends JpaRepository<Account,Integer> {


	@Query(value = "SELECT currUser FROM Account currUser WHERE currUser.accNum=?1")
	Account loginUser(int accNo) ;
	
	
	
	
}

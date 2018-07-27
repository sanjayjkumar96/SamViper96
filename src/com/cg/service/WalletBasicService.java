package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bean.Account;
import com.cg.dao.IWalletDBAccess;
@Service(value="service")
public class WalletBasicService implements IWalletBasicService {
	
	@Autowired(required=true)
	private IWalletDBAccess dao;
	
	public IWalletDBAccess getDao() {
		return dao;
	}


	public void setDao(IWalletDBAccess dao) {
		this.dao = dao;
	}


	@Override
	public Account checkLogin(int accNo) {
		
		return dao.findOne(accNo);
	}

	


	
}




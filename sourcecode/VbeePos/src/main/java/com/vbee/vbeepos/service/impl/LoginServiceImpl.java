package com.vbee.vbeepos.service.impl;

import com.vbee.vbeepos.dao.AccountDAO;
import com.vbee.vbeepos.model.Account;
import com.vbee.vbeepos.service.LoginService;

public class LoginServiceImpl implements LoginService {

	private AccountDAO accountDAO;

	@Override
	public Account login(String email, String password) {
		Account account = null;
		try {
			account = accountDAO.findByUsername(email);
		} catch (Exception e) {
			return null;
		}
		if (!account.getPassword().equals(password)) {
			return null;
		}
		return account;
	}

	public AccountDAO getAccountDAO() {
		return accountDAO;
	}

	public void setAccountDAO(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}

}

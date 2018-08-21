package com.vbee.vbeepos.service.impl;

import java.io.Serializable;
import java.util.List;
import com.vbee.vbeepos.dao.AccountDAO;
import com.vbee.vbeepos.model.Account;
import com.vbee.vbeepos.service.AccountService;

public class AccountServiceImpl implements AccountService {

	private AccountDAO accountDAO;

	@Override
	public Account findById(Serializable id) {
		return accountDAO.findById(id);
	}

	@Override
	public Account saveOrUpdate(Account entity) {
		return accountDAO.saveOrUpdate(entity);
	}

	@Override
	public boolean delete(Account entity) {
		return accountDAO.delete(entity);
	}

	@Override
	public List<Account> loadAll() {
		return accountDAO.loadAll();
	}

	public AccountDAO getAccountDAO() {
		return accountDAO;
	}

	public void setAccountDAO(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}

	@Override
	public int updatePoints(Long adminId) throws Exception {
		Account account = accountDAO.findById(adminId);
		if (account.getRole().equals("admin")) {
			return accountDAO.updatePoints();
		} else {
			throw new Exception("You do not have permission to reset points!");
		}
	}

}

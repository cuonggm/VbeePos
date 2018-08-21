package com.vbee.vbeepos.dao;

import com.vbee.vbeepos.model.Account;

public interface AccountDAO extends BaseDAO<Long, Account> {
	
	Account findByUsername(String email);
	
	int updatePoints();
	
}

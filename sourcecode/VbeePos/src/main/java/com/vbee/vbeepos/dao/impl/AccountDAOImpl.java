package com.vbee.vbeepos.dao.impl;

import org.hibernate.query.Query;
import com.vbee.vbeepos.dao.AccountDAO;
import com.vbee.vbeepos.model.Account;

public class AccountDAOImpl extends GenericDAO<Long, Account> implements AccountDAO {

	@Override
	public Account findByUsername(String email) {
		Query<Account> query = getSession().createQuery("from Account where email = :email", Account.class);
		query.setParameter("email", email);
		return query.getSingleResult();
	}

	@Override
	public int updatePoints() {
		return getSession().createQuery("update Account set points = :points").setParameter("points", Long.valueOf(400))
				.executeUpdate();
	}

	@Override
	public Account addPoints(Long points, Long accountId) {
		Account account = findById(accountId);
		account.setPoints(account.getPoints() + points);
		return account;
	}

}

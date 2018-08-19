package com.vbee.vbeepos.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.vbee.vbeepos.bean.User;
import com.vbee.vbeepos.dao.AccountDAO;
import com.vbee.vbeepos.model.Account;
import com.vbee.vbeepos.service.UserService;
import com.vbee.vbeepos.util.DateTimeUtil;

public class UserServiceImpl implements UserService {

	private AccountDAO accountDAO;

	@Override
	public List<User> loadAll() {

		List<User> userList = new ArrayList<>();

		try {
			List<Account> accountList = accountDAO.loadAll();
			if (accountList != null && accountList.size() > 0) {
				for (Account account : accountList) {
					User user = new User();
					user.setAccountId(account.getId());
					user.setDisplayInfo(account.getProfile().getName() + " | "
							+ DateTimeUtil.format(account.getProfile().getBirthday()) + " | "
							+ account.getProfile().getGender() + " | "
							+ account.getProfile().getDepartment().getName());

					userList.add(user);
				}
			}
			return userList;

		} catch (Exception e) {
			return Collections.emptyList();
		}

	}

	public AccountDAO getAccountDAO() {
		return accountDAO;
	}

	public void setAccountDAO(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}

}

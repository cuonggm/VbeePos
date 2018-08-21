package com.vbee.vbeepos.service;

import com.vbee.vbeepos.model.Account;

public interface AccountService extends BaseService<Long, Account> {

	int updatePoints(Long adminId) throws Exception;

}

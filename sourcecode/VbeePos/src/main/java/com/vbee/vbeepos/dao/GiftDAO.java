package com.vbee.vbeepos.dao;

import java.util.List;

import com.vbee.vbeepos.model.Account;
import com.vbee.vbeepos.model.Gift;

public interface GiftDAO extends BaseDAO<Long, Gift> {
	List<Gift> findBySender(Account sender);
	
	List<Gift> findByReceiver(Account receiver);
}

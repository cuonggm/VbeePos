package com.vbee.vbeepos.dao;

import java.util.List;

import com.vbee.vbeepos.bean.GiftInfo;
import com.vbee.vbeepos.model.Gift;

public interface GiftDAO extends BaseDAO<Long, Gift> {
	List<Gift> findBySender(Long id);
	
	List<Gift> findByReceiver(Long id);
}

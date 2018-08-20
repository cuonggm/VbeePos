package com.vbee.vbeepos.service;

import com.vbee.vbeepos.model.Gift;

public interface GiftService extends BaseService<Long, Gift> {

	Gift createAndSave(Long senderId, Long receiverId, String hashTag, Integer points, String message) throws Exception;

}

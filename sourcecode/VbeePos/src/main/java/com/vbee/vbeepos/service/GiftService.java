package com.vbee.vbeepos.service;

import java.util.List;

import com.vbee.vbeepos.bean.GiftInfo;
import com.vbee.vbeepos.model.Gift;

public interface GiftService extends BaseService<Long, Gift> {

	Gift createAndSave(Long senderId, Long receiverId, String hashTag, Integer points, String message) throws Exception;

	List<GiftInfo> loadAllGiftInfo();

}

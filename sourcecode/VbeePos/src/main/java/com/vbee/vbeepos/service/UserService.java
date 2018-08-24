package com.vbee.vbeepos.service;

import java.util.List;

import com.vbee.vbeepos.bean.GiftInfo;
import com.vbee.vbeepos.bean.User;

public interface UserService {

	List<User> loadAll();

	User findById(Long id);

	List<GiftInfo> loadReceivedGifts(Long id);

	List<GiftInfo> loadSentGifts(Long id);

	List<User> scoredUsers();

}

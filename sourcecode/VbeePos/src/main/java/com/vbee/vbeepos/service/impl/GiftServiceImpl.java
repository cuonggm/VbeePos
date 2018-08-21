package com.vbee.vbeepos.service.impl;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.vbee.vbeepos.dao.AccountDAO;
import com.vbee.vbeepos.dao.GiftDAO;
import com.vbee.vbeepos.dao.HashTagDAO;
import com.vbee.vbeepos.model.Account;
import com.vbee.vbeepos.model.Gift;
import com.vbee.vbeepos.model.HashTag;
import com.vbee.vbeepos.service.GiftService;

public class GiftServiceImpl implements GiftService {

	private GiftDAO giftDAO;
	private HashTagDAO hashTagDAO;
	private AccountDAO accountDAO;

	@Override
	public Gift findById(Serializable id) {
		return giftDAO.findById(id);
	}

	@Override
	public Gift saveOrUpdate(Gift entity) {
		return giftDAO.saveOrUpdate(entity);
	}

	@Override
	public boolean delete(Gift entity) {
		giftDAO.delete(entity);
		return true;
	}

	@Override
	public List<Gift> loadAll() {
		return giftDAO.loadAll();
	}

	@Override
	public Gift createAndSave(Long senderId, Long receiverId, String hashTag, Integer points, String message)
			throws Exception {
		if (senderId == null || receiverId == null || hashTag == null || points == null || message == null
				|| message.isEmpty()) {
			throw new Exception("You must enter all fields");
		}
		if (senderId.longValue() == receiverId.longValue()) {
			throw new Exception("Can not send gift for myself");
		}
		Account sender = accountDAO.findById(senderId);
		if (sender.getPoints() < points) {
			throw new Exception("You do not have enough points to send!");
		}
		Account receiver = accountDAO.findById(receiverId);
		HashTag tag = hashTagDAO.findByTag(hashTag);
		Gift gift = new Gift();
		gift.setSender(sender);
		gift.setReceiver(receiver);
		gift.setHashTag(tag);
		gift.setPoints(points);
		gift.setMessage(message);
		gift.setSentTime(new Date());
		sender.setPoints(sender.getPoints() - points);
		accountDAO.saveOrUpdate(sender);
		return giftDAO.saveOrUpdate(gift);
	}

	public GiftDAO getGiftDAO() {
		return giftDAO;
	}

	public void setGiftDAO(GiftDAO giftDAO) {
		this.giftDAO = giftDAO;
	}

	public HashTagDAO getHashTagDAO() {
		return hashTagDAO;
	}

	public void setHashTagDAO(HashTagDAO hashTagDAO) {
		this.hashTagDAO = hashTagDAO;
	}

	public AccountDAO getAccountDAO() {
		return accountDAO;
	}

	public void setAccountDAO(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}

}

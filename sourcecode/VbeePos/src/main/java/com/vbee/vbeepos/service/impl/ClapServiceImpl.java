package com.vbee.vbeepos.service.impl;

import java.io.Serializable;
import java.util.List;

import com.vbee.vbeepos.dao.AccountDAO;
import com.vbee.vbeepos.dao.ClapDAO;
import com.vbee.vbeepos.dao.GiftDAO;
import com.vbee.vbeepos.model.Account;
import com.vbee.vbeepos.model.Clap;
import com.vbee.vbeepos.model.Gift;
import com.vbee.vbeepos.service.ClapService;

public class ClapServiceImpl implements ClapService {

	private ClapDAO clapDAO;
	private AccountDAO accountDAO;
	private GiftDAO giftDAO;

	@Override
	public Clap findById(Serializable id) {
		return clapDAO.findById(id);
	}

	@Override
	public Clap saveOrUpdate(Clap entity) {
		return clapDAO.saveOrUpdate(entity);
	}

	@Override
	public boolean delete(Clap entity) {
		clapDAO.delete(entity);
		return true;
	}

	@Override
	public List<Clap> loadAll() {
		return clapDAO.loadAll();
	}

	@Override
	public Clap createClap(Long giftId, Long clapperId) throws Exception {
		Gift gift = giftDAO.findById(giftId);
		Account clapper = accountDAO.findById(clapperId);
		if (clapper.getPoints() < 2) {
			throw new Exception("You do not have enough points to clap");
		}
		Clap clap = new Clap();
		clap.setGift(gift);
		clap.setClapper(clapper);
		accountDAO.addPoints(Long.valueOf(-2), clapperId);
		accountDAO.addPoints(Long.valueOf(1), gift.getSender().getId());
		accountDAO.addPoints(Long.valueOf(1), gift.getReceiver().getId());
		return clapDAO.saveOrUpdate(clap);
	}

	@Override
	public List<Clap> clapsOf(Long giftId) {
		return clapDAO.clapsOf(giftId);
	}

	public ClapDAO getClapDAO() {
		return clapDAO;
	}

	public void setClapDAO(ClapDAO clapDAO) {
		this.clapDAO = clapDAO;
	}

	public AccountDAO getAccountDAO() {
		return accountDAO;
	}

	public void setAccountDAO(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}

	public GiftDAO getGiftDAO() {
		return giftDAO;
	}

	public void setGiftDAO(GiftDAO giftDAO) {
		this.giftDAO = giftDAO;
	}

}

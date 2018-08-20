package com.vbee.vbeepos.service.impl;

import java.io.Serializable;
import java.util.List;
import com.vbee.vbeepos.dao.HashTagDAO;
import com.vbee.vbeepos.model.HashTag;
import com.vbee.vbeepos.service.HashTagService;

public class HashTagServiceImpl implements HashTagService {

	private HashTagDAO hashTagDAO;

	@Override
	public HashTag findById(Serializable id) {
		return hashTagDAO.findById(id);
	}

	@Override
	public HashTag saveOrUpdate(HashTag entity) {
		return hashTagDAO.saveOrUpdate(entity);
	}

	@Override
	public boolean delete(HashTag entity) {
		hashTagDAO.delete(entity);
		return true;
	}

	@Override
	public List<HashTag> loadAll() {
		return hashTagDAO.loadAll();
	}

	@Override
	public HashTag findByTag(String tag) {
		return hashTagDAO.findByTag(tag);
	}

	public HashTagDAO getHashTagDAO() {
		return hashTagDAO;
	}

	public void setHashTagDAO(HashTagDAO hashTagDAO) {
		this.hashTagDAO = hashTagDAO;
	}

}

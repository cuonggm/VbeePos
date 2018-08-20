package com.vbee.vbeepos.dao.impl;

import org.hibernate.query.Query;

import com.vbee.vbeepos.dao.HashTagDAO;
import com.vbee.vbeepos.model.HashTag;

public class HashTagDAOImpl extends GenericDAO<Long, HashTag> implements HashTagDAO {

	@Override
	public HashTag findByTag(String tag) {
		Query<HashTag> query = getSession().createQuery("from HashTag where tag = :tag", HashTag.class);
		query.setParameter("tag", tag);
		return query.getSingleResult();
	}

}

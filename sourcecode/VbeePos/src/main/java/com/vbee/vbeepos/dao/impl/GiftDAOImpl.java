package com.vbee.vbeepos.dao.impl;

import java.util.List;

import org.hibernate.query.Query;

import com.vbee.vbeepos.dao.GiftDAO;
import com.vbee.vbeepos.model.Gift;

public class GiftDAOImpl extends GenericDAO<Long, Gift> implements GiftDAO {

	@Override
	public List<Gift> findBySender(Long id) {
		Query<Gift> query = getSession().createQuery("select g from Gift as g"
				+ " inner join g.sender as sender"
				+ " where sender.id = :id"
				+ " order by g.sentTime DESC", Gift.class);
		query.setParameter("id", id);
		return query.getResultList();
	}
	
	@Override
	public List<Gift> findByReceiver(Long id) {
		Query<Gift> query = getSession().createQuery("select g from Gift as g"
				+ " inner join g.receiver as receiver"
				+ " where receiver.id = :id"
				+ " order by g.sentTime DESC", Gift.class);
		query.setParameter("id", id);
		return query.getResultList();
	}

	@Override
	public List<Gift> loadAll() {
		Query<Gift> query = getSession().createQuery("from Gift g order by g.sentTime DESC", Gift.class);
		return query.getResultList();
	}
	
	
}

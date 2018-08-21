package com.vbee.vbeepos.dao.impl;

import java.util.List;
import com.vbee.vbeepos.dao.ClapDAO;
import com.vbee.vbeepos.model.Clap;

public class ClapDAOImpl extends GenericDAO<Long, Clap> implements ClapDAO {

	@Override
	public List<Clap> clapsOf(Long giftId) {
		return getSession().createQuery("from Clap where gift.id = :giftId", Clap.class).setParameter("giftId", giftId)
				.getResultList();
	}

}

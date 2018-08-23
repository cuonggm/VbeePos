package com.vbee.vbeepos.dao.impl;

import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.query.Query;
import com.vbee.vbeepos.dao.GiftDAO;
import com.vbee.vbeepos.model.Account;
import com.vbee.vbeepos.model.Gift;

public class GiftDAOImpl extends GenericDAO<Long, Gift> implements GiftDAO {

	@Override
	public List<Gift> findBySender(Account sender) {
		CriteriaBuilder criteriaBuilder = getSession().getCriteriaBuilder();

		CriteriaQuery<Gift> criteriaQuery = criteriaBuilder.createQuery(Gift.class);
		Root<Gift> giftRoot = criteriaQuery.from(Gift.class);
		criteriaQuery.select(giftRoot);
		criteriaQuery.where(criteriaBuilder.equal(giftRoot.get("sender"), sender));

		criteriaQuery.orderBy(criteriaBuilder.desc(giftRoot.get("sentTime")));

		Query<Gift> query = getSession().createQuery(criteriaQuery);
		return query.getResultList();
	}

	@Override
	public List<Gift> findByReceiver(Account receiver) {
		CriteriaBuilder criteriaBuilder = getSession().getCriteriaBuilder();

		CriteriaQuery<Gift> criteriaQuery = criteriaBuilder.createQuery(Gift.class);
		Root<Gift> giftRoot = criteriaQuery.from(Gift.class);
		criteriaQuery.select(giftRoot);
		criteriaQuery.where(criteriaBuilder.equal(giftRoot.get("receiver"), receiver));

		criteriaQuery.orderBy(criteriaBuilder.desc(giftRoot.get("sentTime")));

		Query<Gift> query = getSession().createQuery(criteriaQuery);
		return query.getResultList();
	}

	@Override
	public List<Gift> loadAll() {
		CriteriaBuilder criteriaBuilder = getSession().getCriteriaBuilder();

		CriteriaQuery<Gift> criteriaQuery = criteriaBuilder.createQuery(Gift.class);
		Root<Gift> giftRoot = criteriaQuery.from(Gift.class);
		criteriaQuery.select(giftRoot);
		criteriaQuery.orderBy(criteriaBuilder.desc(giftRoot.get("sentTime")));

		Query<Gift> query = getSession().createQuery(criteriaQuery);

		return query.getResultList();
	}

	@Override
	public List<Gift> loadGiftInfo(int pageSize, int page) {
		List<Gift> allGifts = loadAll();
		int fromIndex = pageSize * (page - 1);
		int toIndex = pageSize * page - 1;
		if (toIndex > allGifts.size()) {
			toIndex = allGifts.size();
		}
		return allGifts.subList(fromIndex, toIndex);
	}

}

package com.vbee.vbeepos.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public abstract class GenericDAO<PK extends Serializable, T> {

	private SessionFactory sessionFactory;
	private Class<T> persistenceClass;

	public GenericDAO() {

	}

	public T findById(Serializable id) {
		T entity = getSession().find(getPersistenceClass(), id);
		return entity;
	}

	public T saveOrUpdate(T entity) {
		getSession().saveOrUpdate(entity);
		return entity;
	}

	public List<T> loadAll() {
		CriteriaBuilder builder = getSessionFactory().getCriteriaBuilder();

		CriteriaQuery<T> criteria = builder.createQuery(getPersistenceClass());
		Root<T> root = criteria.from(getPersistenceClass());
		criteria.select(root);

		List<T> entities = getSession().createQuery(criteria).getResultList();
		return entities;
	}

	public boolean delete(T entity) {
		getSession().delete(entity);
		return true;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Class<T> getPersistenceClass() {
		return persistenceClass;
	}

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

}

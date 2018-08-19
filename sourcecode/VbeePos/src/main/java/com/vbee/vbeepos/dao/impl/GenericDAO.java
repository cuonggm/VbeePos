package com.vbee.vbeepos.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public abstract class GenericDAO<PK extends Serializable, T> {

	private SessionFactory sessionFactory;
	private Class<T> persistenceClass;

	@SuppressWarnings("unchecked")
	public GenericDAO() {
		this.persistenceClass = (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass())
				.getActualTypeArguments()[1];
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
		Query<T> query = getSession().createQuery("from " + getPersistenceClass().getName(), getPersistenceClass());
		return query.getResultList();
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

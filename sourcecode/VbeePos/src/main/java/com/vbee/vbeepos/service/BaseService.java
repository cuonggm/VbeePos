package com.vbee.vbeepos.service;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseService<PK extends Serializable, T> {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public T findById(Serializable id) {
		Session session = sessionFactory.openSession();
		T entity = 
	}
	
	public T saveOrUpdate(T entity) {
		
	}
	
	public boolean delete(T entity) {
		
	}

}

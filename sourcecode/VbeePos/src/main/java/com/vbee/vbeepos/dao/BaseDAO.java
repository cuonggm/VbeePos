package com.vbee.vbeepos.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDAO<PK extends Serializable, T> {

	T findById(Serializable id);

	T saveOrUpdate(T entity);

	boolean delete(T entity);

	List<T> loadAll();

}

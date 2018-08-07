package com.vbee.vbeepos.service;

import java.io.Serializable;
import java.util.List;

public interface BaseService<PK extends Serializable, T> {

	T findById(Serializable id);

	T saveOrUpdate(T entity);

	boolean delete(T entity);

	List<T> loadAll();

}

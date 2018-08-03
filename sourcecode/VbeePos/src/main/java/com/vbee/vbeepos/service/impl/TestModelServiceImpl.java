package com.vbee.vbeepos.service.impl;

import java.io.Serializable;

import com.vbee.vbeepos.dao.TestModelDAO;
import com.vbee.vbeepos.model.TestModel;
import com.vbee.vbeepos.service.TestModelService;

public class TestModelServiceImpl implements TestModelService {

	protected TestModelDAO testModelDAO;
	
	@Override
	public TestModel findById(Serializable key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TestModel saveOrUpdate(TestModel entity) {
		testModelDAO.saveOrUpdate(entity);
		return null;
	}

	@Override
	public boolean delete(TestModel entity) {
		// TODO Auto-generated method stub
		return false;
	}

	public TestModelDAO getTestModelDAO() {
		return testModelDAO;
	}

	public void setTestModelDAO(TestModelDAO testModelDAO) {
		this.testModelDAO = testModelDAO;
	}
	
}

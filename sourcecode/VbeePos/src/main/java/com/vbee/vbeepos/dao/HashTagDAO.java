package com.vbee.vbeepos.dao;

import com.vbee.vbeepos.model.HashTag;

public interface HashTagDAO extends BaseDAO<Long, HashTag> {

	HashTag findByTag(String tag);

}

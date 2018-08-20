package com.vbee.vbeepos.service;

import com.vbee.vbeepos.model.HashTag;

public interface HashTagService extends BaseService<Long, HashTag> {

	HashTag findByTag(String tag);

}

package com.vbee.vbeepos.dao;

import java.util.List;
import com.vbee.vbeepos.model.Clap;

public interface ClapDAO extends BaseDAO<Long, Clap> {

	List<Clap> clapsOf(Long giftId);

}

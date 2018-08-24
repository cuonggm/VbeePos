package com.vbee.vbeepos.service;

import java.util.List;

import com.vbee.vbeepos.bean.Clapper;
import com.vbee.vbeepos.model.Clap;

public interface ClapService extends BaseService<Long, Clap> {

	Clap createClap(Long giftId, Long clapperId) throws Exception;

	List<Clap> clapsOf(Long giftId);

	List<Clapper> clappers(Long giftId);

}

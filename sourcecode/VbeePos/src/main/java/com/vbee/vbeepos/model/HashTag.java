package com.vbee.vbeepos.model;

import java.util.List;

public class HashTag {

	private Long id;
	private String tag;
	private List<Gift> gifts;

	public HashTag() {

	}

	public Long getId() {
		return id;
	}

	@SuppressWarnings("unused")
	private void setId(Long id) {
		this.id = id;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public List<Gift> getGifts() {
		return gifts;
	}

	public void setGifts(List<Gift> gifts) {
		this.gifts = gifts;
	}

}

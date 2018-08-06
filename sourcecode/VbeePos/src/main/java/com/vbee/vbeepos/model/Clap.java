package com.vbee.vbeepos.model;

public class Clap {

	private Long id;
	private Gift gift;
	private Account clapper;

	public Clap() {
		super();
	}

	public Long getId() {
		return id;
	}

	@SuppressWarnings("unused")
	private void setId(Long id) {
		this.id = id;
	}

	public Gift getGift() {
		return gift;
	}

	public void setGift(Gift gift) {
		this.gift = gift;
	}

	public Account getClapper() {
		return clapper;
	}

	public void setClapper(Account clapper) {
		this.clapper = clapper;
	}

}

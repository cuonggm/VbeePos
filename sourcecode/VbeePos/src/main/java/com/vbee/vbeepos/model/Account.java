package com.vbee.vbeepos.model;

import java.util.List;

public class Account {

	private Long id;
	private String email;
	private String password;
	private String role;
	private Profile profile;
	private List<Gift> sentGifts;
	private List<Gift> receivedGifts;
	private List<Clap> claps;

	public Account() {

	}

	public Long getId() {
		return id;
	}

	@SuppressWarnings("unused")
	private void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public List<Gift> getSentGifts() {
		return sentGifts;
	}

	public void setSentGifts(List<Gift> sentGifts) {
		this.sentGifts = sentGifts;
	}

	public List<Gift> getReceivedGifts() {
		return receivedGifts;
	}

	public void setReceivedGifts(List<Gift> receivedGifts) {
		this.receivedGifts = receivedGifts;
	}

	public List<Clap> getClaps() {
		return claps;
	}

	public void setClaps(List<Clap> claps) {
		this.claps = claps;
	}

}

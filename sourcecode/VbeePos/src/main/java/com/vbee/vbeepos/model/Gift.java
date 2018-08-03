package com.vbee.vbeepos.model;

import java.util.Date;
import java.util.List;

public class Gift {

	private Long id;
	private String message;
	private Integer points;
	private Date sentTime;
	private Account sender;
	private Account receiver;
	private HashTag hashTag;
	private List<Clap> claps;

	public Gift() {

	}

	public Long getId() {
		return id;
	}

	@SuppressWarnings("unused")
	private void setId(Long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getPoints() {
		return points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

	public Date getSentTime() {
		return sentTime;
	}

	public void setSentTime(Date sentTime) {
		this.sentTime = sentTime;
	}

	public Account getSender() {
		return sender;
	}

	public void setSender(Account sender) {
		this.sender = sender;
	}

	public Account getReceiver() {
		return receiver;
	}

	public void setReceiver(Account receiver) {
		this.receiver = receiver;
	}

	public HashTag getHashTag() {
		return hashTag;
	}

	public void setHashTag(HashTag hashTag) {
		this.hashTag = hashTag;
	}

	public List<Clap> getClaps() {
		return claps;
	}

	public void setClaps(List<Clap> claps) {
		this.claps = claps;
	}

}

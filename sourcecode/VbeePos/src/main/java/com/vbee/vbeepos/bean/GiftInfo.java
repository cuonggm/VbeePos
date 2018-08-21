package com.vbee.vbeepos.bean;

import java.util.Date;
import java.util.List;

import com.vbee.vbeepos.model.Clap;
import com.vbee.vbeepos.model.HashTag;

public class GiftInfo {
	private Long id;
	private String message;
	private Integer points;
	private Date sentTime;
	private String sender;
	private String senderEmail;
	private String receiver;
	private String receiverEmail;
	private String hashTag;
	private Long claps;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	
	public String getHashTag() {
		return hashTag;
	}
	public void setHashTag(String hashTag) {
		this.hashTag = hashTag;
	}
	public Long getClaps() {
		return claps;
	}
	public void setClaps(Long claps) {
		this.claps = claps;
	}
	
	public String getSenderEmail() {
		return senderEmail;
	}
	public void setSenderEmail(String senderEmail) {
		this.senderEmail = senderEmail;
	}
	public String getReceiverEmail() {
		return receiverEmail;
	}
	public void setReceiverEmail(String receiverEmail) {
		this.receiverEmail = receiverEmail;
	}
}

package com.vbee.vbeepos.bean;

public class User {

	private Long accountId;
	private String displayInfo;
	private String name;
	private String email;
	private String gender;
	private String role;
	private String birthday;
	private String department;
	private String branch;
	private Long receivedGiftCount;
	private Long sentGiftCount;
	private Long points;

	public User() {

	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public String getDisplayInfo() {
		return displayInfo;
	}

	public void setDisplayInfo(String displayInfo) {
		this.displayInfo = displayInfo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public Long getReceivedGiftCount() {
		return receivedGiftCount;
	}

	public void setReceivedGiftCount(Long receivedGiftCount) {
		this.receivedGiftCount = receivedGiftCount;
	}

	public Long getSentGiftCount() {
		return sentGiftCount;
	}

	public void setSentGiftCount(Long sentGiftCount) {
		this.sentGiftCount = sentGiftCount;
	}

	public Long getPoints() {
		return points;
	}

	public void setPoints(Long points) {
		this.points = points;
	}

}

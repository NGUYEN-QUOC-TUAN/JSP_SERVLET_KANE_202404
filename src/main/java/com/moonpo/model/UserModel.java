package com.moonpo.model;

public class UserModel extends AbstractModel {
	private String userName;
	private String fullName;
	private String passWord;
	private Integer status;
	private Long roleId;

	public UserModel() {
		super();
	}

	public UserModel(Long id, String userName, String fullName, String passWord, Integer status, Long roleId) {
		super();
		this.userName = userName;
		this.fullName = fullName;
		this.passWord = passWord;
		this.status = status;
		this.roleId = roleId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

}

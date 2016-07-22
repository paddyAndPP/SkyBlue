package com.musicalsky.entity;

import java.sql.Date;

/**
 * ����Ա��½ʵ����
 * 
 * @author ������
 * 
 */
public class AdminLogin {

	private Integer loginID;
	private Date createTime;
	private Integer state;
	private String loginAccount;
	private String loginPassword;
	private Integer loginRole;

	public AdminLogin() {}
	
	public AdminLogin(String loginAccount, String loginPassword,
			Integer loginRole) {
		this.loginAccount = loginAccount;
		this.loginPassword = loginPassword;
		this.loginRole = loginRole;
	}

	public Integer getLoginID() {
		return loginID;
	}

	public void setLoginID(Integer loginID) {
		this.loginID = loginID;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getLoginAccount() {
		return loginAccount;
	}

	public void setLoginAccount(String loginAccount) {
		this.loginAccount = loginAccount;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public Integer getLoginRole() {
		return loginRole;
	}

	public void setLoginRole(Integer loginRole) {
		this.loginRole = loginRole;
	}
		
	private SysDictionary dictionary;
	public SysDictionary getDictionary() {
		return dictionary;
	}
	public void setDictionary(SysDictionary dictionary) {
		this.dictionary = dictionary;
	}

	
	@Override
	public String toString() {
		return "AdminLogin [loginID=" + loginID + ", createTime=" + createTime
				+ ", state=" + state + ", loginAccount=" + loginAccount
				+ ", loginPassword=" + loginPassword + ", loginRole="
				+ loginRole + "]";
	}

}

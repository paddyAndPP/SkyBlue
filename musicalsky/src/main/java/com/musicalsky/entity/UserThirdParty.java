package com.musicalsky.entity;

import java.util.Date;

public class UserThirdParty {

	private int thirdPartyID;
	private String thirdPartyAccount;
	private String thirdPartyPassword;
	private int userID;
	private int thirdPartyFlag;
	private Date thirdPartyTime;
	private String QQ;
	private String WebChat;
	
	public UserThirdParty() {}
	public UserThirdParty(String thirdPartyAccount, String qQ, String webChat) {
		this.thirdPartyAccount = thirdPartyAccount;
		QQ = qQ;
		WebChat = webChat;
	}
	
	public int getThirdPartyID() {
		return thirdPartyID;
	}
	public void setThirdPartyID(int thirdPartyID) {
		this.thirdPartyID = thirdPartyID;
	}
	public String getThirdPartyAccount() {
		return thirdPartyAccount;
	}
	public void setThirdPartyAccount(String thirdPartyAccount) {
		this.thirdPartyAccount = thirdPartyAccount;
	}
	public String getThirdPartyPassword() {
		return thirdPartyPassword;
	}
	public void setThirdPartyPassword(String thirdPartyPassword) {
		this.thirdPartyPassword = thirdPartyPassword;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public int getThirdPartyFlag() {
		return thirdPartyFlag;
	}
	public void setThirdPartyFlag(int thirdPartyFlag) {
		this.thirdPartyFlag = thirdPartyFlag;
	}
	public Date getThirdPartyTime() {
		return thirdPartyTime;
	}
	public void setThirdPartyTime(Date thirdPartyTime) {
		this.thirdPartyTime = thirdPartyTime;
	}
	public String getQQ() {
		return QQ;
	}
	public void setQQ(String qQ) {
		QQ = qQ;
	}
	public String getWebChat() {
		return WebChat;
	}
	public void setWebChat(String webChat) {
		WebChat = webChat;
	}
	
	@Override
	public String toString() {
		return "UserThirdParty [thirdPartyID=" + thirdPartyID
				+ ", thirdPartyAccount=" + thirdPartyAccount
				+ ", thirdPartyPassword=" + thirdPartyPassword + ", userID="
				+ userID + ", thirdPartyFlag=" + thirdPartyFlag
				+ ", thirdPartyTime=" + thirdPartyTime + ", QQ=" + QQ
				+ ", WebChat=" + WebChat + "]";
	}
	
	
}

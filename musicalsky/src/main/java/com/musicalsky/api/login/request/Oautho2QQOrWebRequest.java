package com.musicalsky.api.login.request;


public class Oautho2QQOrWebRequest {

	private String nickname;
	private String QQ;
	private String WebChat;
	
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
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
		return "Oautho2QQRequest [nickname=" + nickname + ", QQ=" + QQ
				+ ", WebChat=" + WebChat + "]";
	}
	
}

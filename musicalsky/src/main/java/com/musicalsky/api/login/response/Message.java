package com.musicalsky.api.login.response;

public class Message<T> {

	private int code;
	private String msg;
	private T result;
	
	
	public Message() {}

	public Message(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	
	public Message(int code, String msg, T result) {
		this.code = code;
		this.msg = msg;
		this.result = result;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getResult() {
		return result;
	}

	public void setResult(T result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "Message [code=" + code + ", msg=" + msg + ", result=" + result + "]";
	}

}

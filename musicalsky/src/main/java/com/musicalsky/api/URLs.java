package com.musicalsky.api;

public class URLs {
	
	private static String HTTP = "http://localhost:8080/musicalsky";
	
	/**
	 * QQ接入API
	 */
	public static final String OpenAPIQQ_URL = "https://graph.qq.com/user/get_user_info";
	
	
	/**
	 * user login 
	 */
	public static final String LoginPrefix = "/userLoginApi/";
	public static final String Login = "login";
	public static final String LoginThird = "loginThird";
	public static String LoginUrl = HTTP + LoginPrefix + Login;
}

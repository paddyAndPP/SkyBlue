package com.musicalsky.api;

public class URLs {
	
	private static String HTTP = "http://localhost:8080/musicalsky";
	
	/**
	 * user login 
	 */
	public static final String LoginPrefix = "/userLoginApi/";
	public static final String Login = "login";
	public static String LoginUrl = HTTP + LoginPrefix + Login;
}

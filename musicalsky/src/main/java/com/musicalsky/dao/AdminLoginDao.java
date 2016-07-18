package com.musicalsky.dao;

import com.musicalsky.entity.AdminLogin;

public interface AdminLoginDao {

	/**
	 * ≤‚ ‘mybatis
	 * 
	 * @param account
	 * @return
	 */
	public AdminLogin testMybatis(String loginAccount);

	/**
	 * ”√ªßµ«¬Ω≈–∂œ
	 * 
	 * @param adminL
	 * @return
	 */
	public AdminLogin login(AdminLogin adminL);

}
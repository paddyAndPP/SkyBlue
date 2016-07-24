package com.musicalsky.dao;

import com.musicalsky.entity.AdminLogin;
import com.musicalsky.entity.UserThirdParty;

public interface AdminLoginDao {

	public AdminLogin testMybatis(String loginAccount);

	public AdminLogin login(AdminLogin adminL);
	
	public int addUserThirdParty(UserThirdParty userThirdParty);

}
package com.musicalsky.service;

import com.musicalsky.entity.AdminLogin;
import com.musicalsky.entity.UserThirdParty;

public interface AdminLoginService {

	public AdminLogin testMybatis(String loginAccount);

	public AdminLogin login(AdminLogin adminL);
	
	public int addUserThirdParty(UserThirdParty userThirdParty);

}

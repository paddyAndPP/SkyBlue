package com.musicalsky.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.musicalsky.dao.AdminLoginDao;
import com.musicalsky.entity.AdminLogin;
import com.musicalsky.service.AdminLoginService;

@Service("adminLoginService")
public class AdminLoginServiceImp implements AdminLoginService {

	@Resource
	private AdminLoginDao adminLoginDao;

	@Override
	public AdminLogin testMybatis(String loginAccount) {
		return this.adminLoginDao.testMybatis(loginAccount);
	}

	@Override
	public AdminLogin login(AdminLogin adminL) {

		return this.adminLoginDao.login(adminL);

	}

}
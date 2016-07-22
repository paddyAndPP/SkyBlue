package com.musicalsky.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.musicalsky.AbstractJunitTest;
import com.musicalsky.entity.AdminLogin;

public class AdminLoginDaoTest extends AbstractJunitTest {

	@Autowired
	private AdminLoginDao adminLoginDao;
	
	@Test
	public void testLogin() {
		AdminLogin adminLogin = adminLoginDao.login(new AdminLogin("admin", "1", Integer.valueOf(0)));
		System.out.println(adminLogin);
	}
}

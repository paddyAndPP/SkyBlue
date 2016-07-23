package com.musicalsky.api.login.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.musicalsky.api.Constant;
import com.musicalsky.api.URLs;
import com.musicalsky.api.login.response.Message;
import com.musicalsky.entity.AdminLogin;
import com.musicalsky.service.AdminLoginService;

@Controller
@RequestMapping(URLs.LoginPrefix)
public class UserLoginApiController {

	private Logger logger = (Logger) Logger.getLogger(UserLoginApiController.class);
	
	@Autowired
	private AdminLoginService adminLoginService;
	
	@RequestMapping(value = URLs.Login, method = RequestMethod.POST)
	@ResponseBody
	public JSONObject login(AdminLogin user) {
		AdminLogin result = adminLoginService.login(user);
		if(result == null)
			return (JSONObject) JSONObject.toJSON(
					new Message<String>(Constant.FAILURE_FLAG, Constant.FAILURE, "验证失败"));
		return (JSONObject) JSONObject.toJSON(
				new Message<String>(Constant.SUCCESS_FLAG, Constant.SUCCESS, "验证成功"));
	}
}

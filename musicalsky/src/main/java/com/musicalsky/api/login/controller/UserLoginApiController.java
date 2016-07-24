package com.musicalsky.api.login.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.musicalsky.api.Constant;
import com.musicalsky.api.URLs;
import com.musicalsky.api.login.request.Oautho2QQOrWebRequest;
import com.musicalsky.api.login.response.Message;
import com.musicalsky.api.vo.Oautho2QQOrWebRequestConver;
import com.musicalsky.entity.AdminLogin;
import com.musicalsky.entity.UserThirdParty;
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
	
	@RequestMapping(value = URLs.LoginThird, method=RequestMethod.POST)
	@ResponseBody
	public JSONObject loginThird(Oautho2QQOrWebRequest request) {
		if(isEmptyOautho2QQOrWebRequest(request)) 
			return (JSONObject) JSONObject.toJSON(
					new Message<String>(Constant.FAILURE_FLAG, Constant.FAILURE, "登录失败"));
		int result = adminLoginService.addUserThirdParty(Oautho2QQOrWebRequestConver.converTo(request));
		logger.info("adminLoginService.addUserThirdParty -->>result haaa" + result);
		if(result == 0) 
			return (JSONObject) JSONObject.toJSON(
					new Message<String>(Constant.FAILURE_FLAG, Constant.FAILURE, "后台数据参入异常"));
		return (JSONObject) JSONObject.toJSON(
				new Message<String>(Constant.SUCCESS_FLAG, Constant.SUCCESS, "验证成功"));
	}
	
	private boolean isEmptyOautho2QQOrWebRequest(Oautho2QQOrWebRequest request) {
		return request == null || (StringUtils.isEmpty(request.getQQ()) && StringUtils.isEmpty(request.getWebChat()));
	}
}

package com.musicalsky.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.musicalsky.entity.AdminLogin;
import com.musicalsky.service.AdminLoginService;

@Controller
@RequestMapping("/user")
public class AdminLoginController{
	
	@Resource
	private AdminLoginService adminLoginService;
	
	@RequestMapping("/login")
	public String login(AdminLogin adminL,HttpServletRequest request){
		
		Subject subject=SecurityUtils.getSubject();
		UsernamePasswordToken token=new UsernamePasswordToken(adminL.getLoginAccount(), 
					adminL.getLoginPassword(),adminL.getLoginRole()+"");
		
		try{
			subject.login(token); // 登录验证
			return "redirect:/jsp/main.jsp";
			
		}catch(Exception e){
			request.setAttribute("currentUser", adminL);
			request.setAttribute("errorMsg", "用户名,角色类型或密码错误！");
			return "index";
		}
		
		
	}
	
}



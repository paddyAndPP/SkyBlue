package com.musicalsky.realm;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.HostAuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import com.musicalsky.entity.AdminLogin;
import com.musicalsky.service.AdminLoginService;


/**
 * 自定义Realm
 * @author java1234_小锋
 *
 */
public class MyRealm extends AuthorizingRealm{

	@Resource
	private AdminLoginService adminLoginService;
	
	/**
	 * 为当限前登录的用户授予角色和权
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		return null;
	}

	/**
	 * 验证当前登录的用户
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		String userName=(String)token.getPrincipal();
		String password = new String((char[])token.getCredentials());
		String role = ((HostAuthenticationToken) token).getHost();
		AdminLogin adminLogin = new AdminLogin();
		adminLogin.setLoginAccount(userName);
		adminLogin.setLoginPassword(password);
		adminLogin.setLoginRole(Integer.parseInt(role));
		adminLogin = adminLoginService.login(adminLogin);
		if(adminLogin!=null){
			SecurityUtils.getSubject().getSession().setAttribute("currentUser", adminLogin); // 当前用户信息存到session中
			AuthenticationInfo authcInfo=new SimpleAuthenticationInfo(adminLogin.getLoginAccount(), 
					adminLogin.getLoginPassword(),userName);
			return authcInfo;
		}else{
			return null;				
		}
	}

}

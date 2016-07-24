package com.musicalsky.api.vo;

import org.springframework.util.StringUtils;

import com.musicalsky.api.login.request.Oautho2QQOrWebRequest;
import com.musicalsky.entity.UserThirdParty;

public class Oautho2QQOrWebRequestConver {
	
	//第三方登录用户，暂时考虑将微信账户或者QQ账户作为账户名
	public static UserThirdParty converTo(Oautho2QQOrWebRequest request) {
		return StringUtils.isEmpty(request.getQQ())
				? new UserThirdParty(request.getQQ(), request.getQQ(), request.getWebChat())
				: new UserThirdParty(request.getWebChat(), request.getQQ(), request.getWebChat());
	}
}

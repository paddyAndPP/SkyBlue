package com.musicalsky.api;

import org.junit.Test;

import com.alibaba.fastjson.JSONObject;
import com.musicalsky.api.login.response.Message;

public class JSONTest {

	@Test
	public void testJson() {
		JSONObject str = (JSONObject) JSONObject.toJSON(new Message<String>(Constant.FAILURE_FLAG, Constant.FAILURE, "验证失败"));
		System.out.println("-->>str" + str.toJSONString());
	}
	
}

package com.ccut.passystem.test.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccut.passystem.test.service.TestService_Iface;


@Controller
@RequestMapping("/TestController")
public class TestController {
	Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@Autowired
	TestService_Iface testService_Iface;
	
	@RequestMapping("/hello")
	@ResponseBody
	public Map hello() {
		logger.info("请求登录");
	    logger.debug("debug");
	    logger.warn("warn");
		Map dataMap = null;
		try {
			dataMap = testService_Iface.sayhello();
		} catch (Exception e) {
			dataMap = new HashMap<String, Object>();
			dataMap.put("err", "服务器错误");
			e.printStackTrace();
		}
		return dataMap;
	}

}

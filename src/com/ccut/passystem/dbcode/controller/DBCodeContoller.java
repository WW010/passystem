package com.ccut.passystem.dbcode.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccut.passystem.dbcode.service.DBCodeService_Iface;
import com.ccut.passystem.dbcode.service.MakeCodeService_Iface;

@Controller
@RequestMapping("/DBCodeContoller")
public class DBCodeContoller {
	
	@Autowired
	private DBCodeService_Iface dbCodeService_Iface;
	
	@Autowired
	private MakeCodeService_Iface makeCodeService_Iface;
	
	@RequestMapping("/query_table")
	@ResponseBody
	public List query_table() {
		List ls = null;
		try {
			ls = dbCodeService_Iface.query_All_Table();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ls;
	}
	/**
	 * 代码pojo生成
	 */
	@RequestMapping("/makeCode")
	@ResponseBody
	public Map makeCode(String tablenames) {
		Map data = new HashMap();
		boolean b = false;
		try {
			b = makeCodeService_Iface.makecode(tablenames);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		data.put("bl", b);
		return data;
	}
}

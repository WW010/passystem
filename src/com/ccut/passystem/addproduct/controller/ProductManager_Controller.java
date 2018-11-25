package com.ccut.passystem.addproduct.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccut.passystem.addproduct.service.ProductManager_Service_Ifac;
import com.ccut.passystem.basedb.domain.Supplierproduce;

@Controller
@RequestMapping("/ProductManager_Controller")
public class ProductManager_Controller {

	@Autowired
	ProductManager_Service_Ifac productManager_Service_Ifac;
	
	@RequestMapping("/addProduct")
	@ResponseBody
	public Map addProduct(Supplierproduce supplierproduce){
		Map dataMap = null;
		try {
			dataMap = productManager_Service_Ifac.addProduct(supplierproduce);
		} catch (Exception e) {
			dataMap = new HashMap<>();
			dataMap.put("status", 0);
			dataMap.put("massage", "服务器异常，请稍后重试");
			e.printStackTrace();
		}
		return dataMap;
	}
}

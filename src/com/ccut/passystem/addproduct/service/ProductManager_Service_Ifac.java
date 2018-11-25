package com.ccut.passystem.addproduct.service;

import java.util.Map;

import com.ccut.passystem.basedb.domain.Supplierproduce;

public interface ProductManager_Service_Ifac {
 
	/**
	 * 添加原材料
	 * @param supplierproduce 原材料
	 * @return 操作状态
	 * @throws Exception
	 */
	public Map addProduct(Supplierproduce supplierproduce)throws Exception;
	
}

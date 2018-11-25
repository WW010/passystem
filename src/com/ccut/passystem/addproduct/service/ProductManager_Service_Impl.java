package com.ccut.passystem.addproduct.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ccut.passystem.base.util.UUID_Tools;
import com.ccut.passystem.basedb.dao.Supplierarchivers_Dao_Iface;
import com.ccut.passystem.basedb.dao.Supplierproduce_Dao_Iface;
import com.ccut.passystem.basedb.domain.Supplierarchivers;
import com.ccut.passystem.basedb.domain.Supplierproduce;

@Service
@Transactional
public class ProductManager_Service_Impl implements ProductManager_Service_Ifac{

	@Autowired
	Supplierarchivers_Dao_Iface supplierarchivers_Dao_Iface;
	
	@Autowired
	Supplierproduce_Dao_Iface supplierproduce_Dao_Iface;
	/**
	 * 添加原材料
	 * @param supplierproduce 原材料
	 * @return 操作状态
	 * @throws Exception
	 */
	@Override
	public Map addProduct(Supplierproduce supplierproduce) throws Exception {
		Map dataMap = new HashMap();
		//查询供应商表
		Supplierarchivers supplierarchivers = new Supplierarchivers();
		supplierarchivers.setSuppliername(supplierproduce.getSuppliername());
		List ls = supplierarchivers_Dao_Iface.queryAll_supplierarchivers(supplierarchivers);
		if(ls.size() > 0) {
			// 如果存在则在原料表中添加数据
			supplierproduce.setId(UUID_Tools.getUUID());
			supplierproduce_Dao_Iface.insert_supplierproduce(supplierproduce);
			dataMap.put("status", 1);
			dataMap.put("massage", "添加成功");
		}else {
			// 不存在则提示用户 添加失败
			dataMap.put("status", 2);
			dataMap.put("massage", "添加失败，供应商不存在");
		}
		
		return dataMap;
	}

}

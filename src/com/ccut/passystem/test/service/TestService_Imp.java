package com.ccut.passystem.test.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ccut.passystem.test.dao.DeptDAO;


@Service
@Transactional
public class TestService_Imp implements TestService_Iface {
	
	@Autowired
	DeptDAO deptDAO;
	
	public Map sayhello() throws Exception {
		Map dataMap = new HashMap<String, Object>();
		List ls = deptDAO.query_All_DeptModle();
		dataMap.put("deptlist", ls);
		dataMap.put("say", "service say hello");
		return dataMap;
	}

}

package com.ccut.passystem.dbcode.dao;

import java.util.List;
import java.util.Map;

public interface TableDAO {
	/**
	 * 
	 * @param map 包含  dbModel 数据库名 tbname 表名
	 * @return
	 * @throws Exception
	 */
	public List query(Map map)throws Exception;
	
}

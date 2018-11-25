package com.ccut.passystem.dbcode.service;

import java.util.List;

import com.ccut.passystem.dbcode.domain.DBModel;

public interface DBCodeService_Iface{
	/**
	 *  查询数据库中所有的表
	 * @return 表集合
	 * @throws Exception
	 */
	public List query_All_Table()throws Exception;
	/**
	 *  查询表中的所有字段
	 * @param 数据库对象
	 * @return 表的字段集合
	 * @throws Exception
	 */
	public List query_All_column(DBModel dbModel)throws Exception;
}

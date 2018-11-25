package com.ccut.passystem.dbcode.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ccut.passystem.dbcode.dao.DBDAO;
import com.ccut.passystem.dbcode.dao.TableDAO;
import com.ccut.passystem.dbcode.domain.DBModel;

@Service
@Transactional
public class DBCodeService_Imp implements DBCodeService_Iface{
	
	@Value("${jdbc.dbname}")
	private String dbname;
	
	public String getDBNAME() {
		return dbname;
	}
	@Autowired
	private DBDAO dbDAO;
	
	@Autowired
	private TableDAO tableDAO;
	
	public List query_All_Table() throws Exception {
		List ls =  dbDAO.query(dbname);
		return ls;
	}
	/**
	 *  查询表中的所有字段
	 * @param 数据库对象
	 * @return 表的字段集合
	 * @throws Exception
	 */
	public List query_All_column(DBModel dbModel) throws Exception {
		Map map = new HashMap<String, Object>();
		map.put("dbname", dbname);
		map.put("tbname", dbModel.getTbname());
		List ls = tableDAO.query(map);
		return ls;
	}

}

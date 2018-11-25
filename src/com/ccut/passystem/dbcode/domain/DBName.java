package com.ccut.passystem.dbcode.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 从配置文件中读取数据库名
 * @author Edith
 *
 */
@Component
public class DBName {

//	@Value("${jdbcConfig['jdbc.dbname']}")
	private String dbname;

	public String getDbname() {
		return dbname;
	}

	public void setDbname(String dbname) {
		this.dbname = dbname;
	}
	
}

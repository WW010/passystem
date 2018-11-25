package com.ccut.passystem.test.domain;

import java.io.Serializable;

public class DeptModel implements Serializable{
	private String deptno;
	private String dname;
	private String db_source;
	
	
	public DeptModel() {}
	
	public DeptModel(String deptno, String dname, String db_source) {
		this.deptno = deptno;
		this.dname = dname;
		this.db_source = db_source;
	}

	public String getDeptno() {
		return deptno;
	}
	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDb_source() {
		return db_source;
	}
	public void setDb_source(String db_source) {
		this.db_source = db_source;
	}

}

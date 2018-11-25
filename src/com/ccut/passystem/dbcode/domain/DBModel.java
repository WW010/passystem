package com.ccut.passystem.dbcode.domain;

import java.io.Serializable;

public class DBModel implements Serializable{
	private String tbname;
	private String comments;
	
	public DBModel() {}
	
	public DBModel(String tbname, String comments) {
		this.tbname = tbname;
		this.comments = comments;
	}
	public String getTbname() {
		return tbname;
	}
	public void setTbname(String tbname) {
		this.tbname = tbname;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	

}

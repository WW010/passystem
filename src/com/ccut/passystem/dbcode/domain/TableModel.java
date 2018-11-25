package com.ccut.passystem.dbcode.domain;

import java.io.Serializable;

public class TableModel implements Serializable{
	private String column_name;
	private String column_type;
	
	public TableModel() {}

	public TableModel(String column_name, String column_type) {
		this.column_name = column_name;
		this.column_type = column_type;
	}

	public String getColumn_name() {
		return column_name;
	}

	public void setColumn_name(String column_name) {
		this.column_name = column_name;
	}

	public String getColumn_type() {
		return column_type;
	}

	public void setColumn_type(String column_type) {
		this.column_type = column_type;
	}
	
}

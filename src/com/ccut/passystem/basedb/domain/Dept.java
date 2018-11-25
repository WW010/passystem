package com.ccut.passystem.basedb.domain;
import java.io.Serializable;
import java.util.Date;
public class Dept implements Serializable {
private Integer deptno;
public void setDeptno(Integer deptno){
this.deptno=deptno;
}
public Integer getDeptno(){
return this.deptno;
}
private String dname;
public void setDname(String dname){
this.dname=dname;
}
public String getDname(){
return this.dname;
}
private String db_source;
public void setDb_source(String db_source){
this.db_source=db_source;
}
public String getDb_source(){
return this.db_source;
}
}

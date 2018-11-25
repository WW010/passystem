package com.ccut.passystem.basedb.domain;
import java.io.Serializable;
import java.util.Date;
public class Costdepartmen implements Serializable {
private String id;
public void setId(String id){
this.id=id;
}
public String getId(){
return this.id;
}
private String departmenname;
public void setDepartmenname(String departmenname){
this.departmenname=departmenname;
}
public String getDepartmenname(){
return this.departmenname;
}
private String costamount;
public void setCostamount(String costamount){
this.costamount=costamount;
}
public String getCostamount(){
return this.costamount;
}
private String costdata;
public void setCostdata(String costdata){
this.costdata=costdata;
}
public String getCostdata(){
return this.costdata;
}
private String recorder;
public void setRecorder(String recorder){
this.recorder=recorder;
}
public String getRecorder(){
return this.recorder;
}
private String recorddata;
public void setRecorddata(String recorddata){
this.recorddata=recorddata;
}
public String getRecorddata(){
return this.recorddata;
}
}

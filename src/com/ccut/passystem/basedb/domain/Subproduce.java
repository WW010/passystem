package com.ccut.passystem.basedb.domain;
import java.io.Serializable;
import java.util.Date;
public class Subproduce implements Serializable {
private String id;
public void setId(String id){
this.id=id;
}
public String getId(){
return this.id;
}
private String suppliername;
public void setSuppliername(String suppliername){
this.suppliername=suppliername;
}
public String getSuppliername(){
return this.suppliername;
}
private String qualityname;
public void setQualityname(String qualityname){
this.qualityname=qualityname;
}
public String getQualityname(){
return this.qualityname;
}
private String deal;
public void setDeal(String deal){
this.deal=deal;
}
public String getDeal(){
return this.deal;
}
private String backdata;
public void setBackdata(String backdata){
this.backdata=backdata;
}
public String getBackdata(){
return this.backdata;
}
private String dealdata;
public void setDealdata(String dealdata){
this.dealdata=dealdata;
}
public String getDealdata(){
return this.dealdata;
}
}

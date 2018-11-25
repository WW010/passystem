package com.ccut.passystem.basedb.domain;
import java.io.Serializable;
import java.util.Date;
public class Supplierplan implements Serializable {
private String id;
public void setId(String id){
this.id=id;
}
public String getId(){
return this.id;
}
private String planname;
public void setPlanname(String planname){
this.planname=planname;
}
public String getPlanname(){
return this.planname;
}
private String suppliername;
public void setSuppliername(String suppliername){
this.suppliername=suppliername;
}
public String getSuppliername(){
return this.suppliername;
}
private String producename;
public void setProducename(String producename){
this.producename=producename;
}
public String getProducename(){
return this.producename;
}
private String specifications;
public void setSpecifications(String specifications){
this.specifications=specifications;
}
public String getSpecifications(){
return this.specifications;
}
private String supply;
public void setSupply(String supply){
this.supply=supply;
}
public String getSupply(){
return this.supply;
}
private Integer arrivedata;
public void setArrivedata(Integer arrivedata){
this.arrivedata=arrivedata;
}
public Integer getArrivedata(){
return this.arrivedata;
}
private String price;
public void setPrice(String price){
this.price=price;
}
public String getPrice(){
return this.price;
}
}

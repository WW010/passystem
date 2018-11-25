package com.ccut.passystem.basedb.domain;
import java.io.Serializable;
import java.util.Date;
public class Tracking implements Serializable {
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
private String producename;
public void setProducename(String producename){
this.producename=producename;
}
public String getProducename(){
return this.producename;
}
private String suppliername;
public void setSuppliername(String suppliername){
this.suppliername=suppliername;
}
public String getSuppliername(){
return this.suppliername;
}
private String inventory;
public void setInventory(String inventory){
this.inventory=inventory;
}
public String getInventory(){
return this.inventory;
}
private String supply;
public void setSupply(String supply){
this.supply=supply;
}
public String getSupply(){
return this.supply;
}
private String arrivenumber;
public void setArrivenumber(String arrivenumber){
this.arrivenumber=arrivenumber;
}
public String getArrivenumber(){
return this.arrivenumber;
}
private String state;
public void setState(String state){
this.state=state;
}
public String getState(){
return this.state;
}
}

package com.ccut.passystem.basedb.domain;
import java.io.Serializable;
import java.util.Date;
public class Buyerarchivers implements Serializable {
private String id;
public void setId(String id){
this.id=id;
}
public String getId(){
return this.id;
}
private String buyername;
public void setBuyername(String buyername){
this.buyername=buyername;
}
public String getBuyername(){
return this.buyername;
}
private String buyertel;
public void setBuyertel(String buyertel){
this.buyertel=buyertel;
}
public String getBuyertel(){
return this.buyertel;
}
private String buyeraddr;
public void setBuyeraddr(String buyeraddr){
this.buyeraddr=buyeraddr;
}
public String getBuyeraddr(){
return this.buyeraddr;
}
}

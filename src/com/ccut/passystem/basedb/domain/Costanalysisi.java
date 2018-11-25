package com.ccut.passystem.basedb.domain;
import java.io.Serializable;
import java.util.Date;
public class Costanalysisi implements Serializable {
private String id;
public void setId(String id){
this.id=id;
}
public String getId(){
return this.id;
}
private String productid;
public void setProductid(String productid){
this.productid=productid;
}
public String getProductid(){
return this.productid;
}
private String price;
public void setPrice(String price){
this.price=price;
}
public String getPrice(){
return this.price;
}
private String productnumber;
public void setProductnumber(String productnumber){
this.productnumber=productnumber;
}
public String getProductnumber(){
return this.productnumber;
}
private String totalprice;
public void setTotalprice(String totalprice){
this.totalprice=totalprice;
}
public String getTotalprice(){
return this.totalprice;
}
}

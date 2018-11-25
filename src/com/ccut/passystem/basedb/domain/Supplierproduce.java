package com.ccut.passystem.basedb.domain;
import java.io.Serializable;
import java.util.Date;
public class Supplierproduce implements Serializable {
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
private String producename;
public void setProducename(String producename){
this.producename=producename;
}
public String getProducename(){
return this.producename;
}
private String model;
public void setModel(String model){
this.model=model;
}
public String getModel(){
return this.model;
}
private String specifications;
public void setSpecifications(String specifications){
this.specifications=specifications;
}
public String getSpecifications(){
return this.specifications;
}
private String price;
public void setPrice(String price){
this.price=price;
}
public String getPrice(){
return this.price;
}
}

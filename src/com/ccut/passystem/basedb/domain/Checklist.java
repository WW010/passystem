package com.ccut.passystem.basedb.domain;
import java.io.Serializable;
import java.util.Date;
public class Checklist implements Serializable {
private String id;
public void setId(String id){
this.id=id;
}
public String getId(){
return this.id;
}
private Integer arrivedata;
public void setArrivedata(Integer arrivedata){
this.arrivedata=arrivedata;
}
public Integer getArrivedata(){
return this.arrivedata;
}
private String producename;
public void setProducename(String producename){
this.producename=producename;
}
public String getProducename(){
return this.producename;
}
private String number;
public void setNumber(String number){
this.number=number;
}
public String getNumber(){
return this.number;
}
private String result;
public void setResult(String result){
this.result=result;
}
public String getResult(){
return this.result;
}
}

package com.ccut.passystem.basedb.domain;
import java.io.Serializable;
import java.util.Date;
public class Qualitysituation implements Serializable {
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
private String qualityname;
public void setQualityname(String qualityname){
this.qualityname=qualityname;
}
public String getQualityname(){
return this.qualityname;
}
private String qualityevaluation;
public void setQualityevaluation(String qualityevaluation){
this.qualityevaluation=qualityevaluation;
}
public String getQualityevaluation(){
return this.qualityevaluation;
}
}

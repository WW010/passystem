package com.ccut.passystem.basedb.domain;
import java.io.Serializable;
import java.util.Date;
public class Produceevaluation implements Serializable {
private String id;
public void setId(String id){
this.id=id;
}
public String getId(){
return this.id;
}
private String producename;
public void setProducename(String producename){
this.producename=producename;
}
public String getProducename(){
return this.producename;
}
private String evaluation;
public void setEvaluation(String evaluation){
this.evaluation=evaluation;
}
public String getEvaluation(){
return this.evaluation;
}
private String producereserve;
public void setProducereserve(String producereserve){
this.producereserve=producereserve;
}
public String getProducereserve(){
return this.producereserve;
}
}

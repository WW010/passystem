package com.ccut.passystem.basedb.domain;
import java.io.Serializable;
import java.util.Date;
public class Qualityanalysis implements Serializable {
private String id;
public void setId(String id){
this.id=id;
}
public String getId(){
return this.id;
}
private String qualityevaluation;
public void setQualityevaluation(String qualityevaluation){
this.qualityevaluation=qualityevaluation;
}
public String getQualityevaluation(){
return this.qualityevaluation;
}
private String subproducenumber;
public void setSubproducenumber(String subproducenumber){
this.subproducenumber=subproducenumber;
}
public String getSubproducenumber(){
return this.subproducenumber;
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
private String performanceraito;
public void setPerformanceraito(String performanceraito){
this.performanceraito=performanceraito;
}
public String getPerformanceraito(){
return this.performanceraito;
}
private String grade;
public void setGrade(String grade){
this.grade=grade;
}
public String getGrade(){
return this.grade;
}
}

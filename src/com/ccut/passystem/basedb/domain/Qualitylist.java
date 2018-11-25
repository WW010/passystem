package com.ccut.passystem.basedb.domain;
import java.io.Serializable;
import java.util.Date;
public class Qualitylist implements Serializable {
private String id;
public void setId(String id){
this.id=id;
}
public String getId(){
return this.id;
}
private String qualityname;
public void setQualityname(String qualityname){
this.qualityname=qualityname;
}
public String getQualityname(){
return this.qualityname;
}
private String reason;
public void setReason(String reason){
this.reason=reason;
}
public String getReason(){
return this.reason;
}
private String measures;
public void setMeasures(String measures){
this.measures=measures;
}
public String getMeasures(){
return this.measures;
}
private String performdata;
public void setPerformdata(String performdata){
this.performdata=performdata;
}
public String getPerformdata(){
return this.performdata;
}
private String senddata;
public void setSenddata(String senddata){
this.senddata=senddata;
}
public String getSenddata(){
return this.senddata;
}
private String receverdata;
public void setReceverdata(String receverdata){
this.receverdata=receverdata;
}
public String getReceverdata(){
return this.receverdata;
}
private String feedback;
public void setFeedback(String feedback){
this.feedback=feedback;
}
public String getFeedback(){
return this.feedback;
}
private String signature;
public void setSignature(String signature){
this.signature=signature;
}
public String getSignature(){
return this.signature;
}
}

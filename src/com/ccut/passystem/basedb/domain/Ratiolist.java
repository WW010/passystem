package com.ccut.passystem.basedb.domain;
import java.io.Serializable;
import java.util.Date;
public class Ratiolist implements Serializable {
private String id;
public void setId(String id){
this.id=id;
}
public String getId(){
return this.id;
}
private String finishedproduceratio;
public void setFinishedproduceratio(String finishedproduceratio){
this.finishedproduceratio=finishedproduceratio;
}
public String getFinishedproduceratio(){
return this.finishedproduceratio;
}
private String produce1;
public void setProduce1(String produce1){
this.produce1=produce1;
}
public String getProduce1(){
return this.produce1;
}
private String produce2;
public void setProduce2(String produce2){
this.produce2=produce2;
}
public String getProduce2(){
return this.produce2;
}
private String produce3;
public void setProduce3(String produce3){
this.produce3=produce3;
}
public String getProduce3(){
return this.produce3;
}
}

package com.ccut.passystem.basedb.domain;
import java.io.Serializable;
import java.util.Date;
public class Finishedproducelist implements Serializable {
private String id;
public void setId(String id){
this.id=id;
}
public String getId(){
return this.id;
}
private String finshedproducename;
public void setFinshedproducename(String finshedproducename){
this.finshedproducename=finshedproducename;
}
public String getFinshedproducename(){
return this.finshedproducename;
}
private String needproduce1;
public void setNeedproduce1(String needproduce1){
this.needproduce1=needproduce1;
}
public String getNeedproduce1(){
return this.needproduce1;
}
private String needproduce2;
public void setNeedproduce2(String needproduce2){
this.needproduce2=needproduce2;
}
public String getNeedproduce2(){
return this.needproduce2;
}
private String needproduce3;
public void setNeedproduce3(String needproduce3){
this.needproduce3=needproduce3;
}
public String getNeedproduce3(){
return this.needproduce3;
}
}

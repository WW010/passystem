package com.ccut.passystem.basedb.domain;
import java.io.Serializable;
import java.util.Date;
public class Supplierarchivers implements Serializable {
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
private String contact;
public void setContact(String contact){
this.contact=contact;
}
public String getContact(){
return this.contact;
}
private String header;
public void setHeader(String header){
this.header=header;
}
public String getHeader(){
return this.header;
}
private String contacttel;
public void setContacttel(String contacttel){
this.contacttel=contacttel;
}
public String getContacttel(){
return this.contacttel;
}
private String postcode;
public void setPostcode(String postcode){
this.postcode=postcode;
}
public String getPostcode(){
return this.postcode;
}
private String addr;
public void setAddr(String addr){
this.addr=addr;
}
public String getAddr(){
return this.addr;
}
private String type;
public void setType(String type){
this.type=type;
}
public String getType(){
return this.type;
}
}

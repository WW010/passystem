package com.ccut.passystem.basedb.service;
import com.ccut.passystem.basedb.domain.Costdepartmen;
import java.util.List;
public interface Costdepartmen_Service_Iface {
public void insert_costdepartmen(Costdepartmen costdepartmen) throws Exception;
public void update_costdepartmen(Costdepartmen costdepartmen) throws Exception;
public void delete_costdepartmen(Costdepartmen costdepartmen) throws Exception;
public List queryAll_costdepartmen(Costdepartmen costdepartmen) throws Exception;
public List queryBy_costdepartmen(Costdepartmen costdepartmen) throws Exception;
}

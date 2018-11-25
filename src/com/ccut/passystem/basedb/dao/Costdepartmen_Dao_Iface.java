package com.ccut.passystem.basedb.dao;
import java.util.List;
import com.ccut.passystem.basedb.domain.Costdepartmen;
public interface Costdepartmen_Dao_Iface {
public void insert_costdepartmen(Costdepartmen costdepartmen) throws Exception;
public void update_costdepartmen(Costdepartmen costdepartmen) throws Exception;
public void delete_costdepartmen(Costdepartmen costdepartmen) throws Exception;
public List queryAll_costdepartmen(Costdepartmen costdepartmen) throws Exception;
public List queryBy_costdepartmen(Costdepartmen costdepartmen) throws Exception;
}

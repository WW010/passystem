package com.ccut.passystem.basedb.service;
import com.ccut.passystem.basedb.domain.Subproduce;
import java.util.List;
public interface Subproduce_Service_Iface {
public void insert_subproduce(Subproduce subproduce) throws Exception;
public void update_subproduce(Subproduce subproduce) throws Exception;
public void delete_subproduce(Subproduce subproduce) throws Exception;
public List queryAll_subproduce(Subproduce subproduce) throws Exception;
public List queryBy_subproduce(Subproduce subproduce) throws Exception;
}

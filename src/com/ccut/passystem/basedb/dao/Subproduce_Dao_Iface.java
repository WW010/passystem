package com.ccut.passystem.basedb.dao;
import java.util.List;
import com.ccut.passystem.basedb.domain.Subproduce;
public interface Subproduce_Dao_Iface {
public void insert_subproduce(Subproduce subproduce) throws Exception;
public void update_subproduce(Subproduce subproduce) throws Exception;
public void delete_subproduce(Subproduce subproduce) throws Exception;
public List queryAll_subproduce(Subproduce subproduce) throws Exception;
public List queryBy_subproduce(Subproduce subproduce) throws Exception;
}

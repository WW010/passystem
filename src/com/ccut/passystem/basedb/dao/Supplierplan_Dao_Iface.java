package com.ccut.passystem.basedb.dao;
import java.util.List;
import com.ccut.passystem.basedb.domain.Supplierplan;
public interface Supplierplan_Dao_Iface {
public void insert_supplierplan(Supplierplan supplierplan) throws Exception;
public void update_supplierplan(Supplierplan supplierplan) throws Exception;
public void delete_supplierplan(Supplierplan supplierplan) throws Exception;
public List queryAll_supplierplan(Supplierplan supplierplan) throws Exception;
public List queryBy_supplierplan(Supplierplan supplierplan) throws Exception;
}

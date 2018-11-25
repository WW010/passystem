package com.ccut.passystem.basedb.service;
import com.ccut.passystem.basedb.domain.Supplierplan;
import java.util.List;
public interface Supplierplan_Service_Iface {
public void insert_supplierplan(Supplierplan supplierplan) throws Exception;
public void update_supplierplan(Supplierplan supplierplan) throws Exception;
public void delete_supplierplan(Supplierplan supplierplan) throws Exception;
public List queryAll_supplierplan(Supplierplan supplierplan) throws Exception;
public List queryBy_supplierplan(Supplierplan supplierplan) throws Exception;
}

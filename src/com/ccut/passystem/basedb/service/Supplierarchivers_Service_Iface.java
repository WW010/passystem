package com.ccut.passystem.basedb.service;
import com.ccut.passystem.basedb.domain.Supplierarchivers;
import java.util.List;
public interface Supplierarchivers_Service_Iface {
public void insert_supplierarchivers(Supplierarchivers supplierarchivers) throws Exception;
public void update_supplierarchivers(Supplierarchivers supplierarchivers) throws Exception;
public void delete_supplierarchivers(Supplierarchivers supplierarchivers) throws Exception;
public List queryAll_supplierarchivers(Supplierarchivers supplierarchivers) throws Exception;
public List queryBy_supplierarchivers(Supplierarchivers supplierarchivers) throws Exception;
}

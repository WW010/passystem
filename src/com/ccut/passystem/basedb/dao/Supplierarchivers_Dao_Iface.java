package com.ccut.passystem.basedb.dao;
import java.util.List;
import com.ccut.passystem.basedb.domain.Supplierarchivers;
public interface Supplierarchivers_Dao_Iface {
public void insert_supplierarchivers(Supplierarchivers supplierarchivers) throws Exception;
public void update_supplierarchivers(Supplierarchivers supplierarchivers) throws Exception;
public void delete_supplierarchivers(Supplierarchivers supplierarchivers) throws Exception;
public List queryAll_supplierarchivers(Supplierarchivers supplierarchivers) throws Exception;
public List queryBy_supplierarchivers(Supplierarchivers supplierarchivers) throws Exception;
}

package com.ccut.passystem.basedb.dao;
import java.util.List;
import com.ccut.passystem.basedb.domain.Buyerarchivers;
public interface Buyerarchivers_Dao_Iface {
public void insert_buyerarchivers(Buyerarchivers buyerarchivers) throws Exception;
public void update_buyerarchivers(Buyerarchivers buyerarchivers) throws Exception;
public void delete_buyerarchivers(Buyerarchivers buyerarchivers) throws Exception;
public List queryAll_buyerarchivers(Buyerarchivers buyerarchivers) throws Exception;
public List queryBy_buyerarchivers(Buyerarchivers buyerarchivers) throws Exception;
}

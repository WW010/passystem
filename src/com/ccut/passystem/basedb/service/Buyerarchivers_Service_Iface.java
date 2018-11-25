package com.ccut.passystem.basedb.service;
import com.ccut.passystem.basedb.domain.Buyerarchivers;
import java.util.List;
public interface Buyerarchivers_Service_Iface {
public void insert_buyerarchivers(Buyerarchivers buyerarchivers) throws Exception;
public void update_buyerarchivers(Buyerarchivers buyerarchivers) throws Exception;
public void delete_buyerarchivers(Buyerarchivers buyerarchivers) throws Exception;
public List queryAll_buyerarchivers(Buyerarchivers buyerarchivers) throws Exception;
public List queryBy_buyerarchivers(Buyerarchivers buyerarchivers) throws Exception;
}

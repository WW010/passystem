package com.ccut.passystem.basedb.service;
import com.ccut.passystem.basedb.domain.Ratiolist;
import java.util.List;
public interface Ratiolist_Service_Iface {
public void insert_ratiolist(Ratiolist ratiolist) throws Exception;
public void update_ratiolist(Ratiolist ratiolist) throws Exception;
public void delete_ratiolist(Ratiolist ratiolist) throws Exception;
public List queryAll_ratiolist(Ratiolist ratiolist) throws Exception;
public List queryBy_ratiolist(Ratiolist ratiolist) throws Exception;
}

package com.ccut.passystem.basedb.dao;
import java.util.List;
import com.ccut.passystem.basedb.domain.Ratiolist;
public interface Ratiolist_Dao_Iface {
public void insert_ratiolist(Ratiolist ratiolist) throws Exception;
public void update_ratiolist(Ratiolist ratiolist) throws Exception;
public void delete_ratiolist(Ratiolist ratiolist) throws Exception;
public List queryAll_ratiolist(Ratiolist ratiolist) throws Exception;
public List queryBy_ratiolist(Ratiolist ratiolist) throws Exception;
}

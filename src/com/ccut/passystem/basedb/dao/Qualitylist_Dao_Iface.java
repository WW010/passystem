package com.ccut.passystem.basedb.dao;
import java.util.List;
import com.ccut.passystem.basedb.domain.Qualitylist;
public interface Qualitylist_Dao_Iface {
public void insert_qualitylist(Qualitylist qualitylist) throws Exception;
public void update_qualitylist(Qualitylist qualitylist) throws Exception;
public void delete_qualitylist(Qualitylist qualitylist) throws Exception;
public List queryAll_qualitylist(Qualitylist qualitylist) throws Exception;
public List queryBy_qualitylist(Qualitylist qualitylist) throws Exception;
}

package com.ccut.passystem.basedb.service;
import com.ccut.passystem.basedb.domain.Qualitylist;
import java.util.List;
public interface Qualitylist_Service_Iface {
public void insert_qualitylist(Qualitylist qualitylist) throws Exception;
public void update_qualitylist(Qualitylist qualitylist) throws Exception;
public void delete_qualitylist(Qualitylist qualitylist) throws Exception;
public List queryAll_qualitylist(Qualitylist qualitylist) throws Exception;
public List queryBy_qualitylist(Qualitylist qualitylist) throws Exception;
}

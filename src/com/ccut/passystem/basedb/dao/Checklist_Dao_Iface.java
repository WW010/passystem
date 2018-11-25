package com.ccut.passystem.basedb.dao;
import java.util.List;
import com.ccut.passystem.basedb.domain.Checklist;
public interface Checklist_Dao_Iface {
public void insert_checklist(Checklist checklist) throws Exception;
public void update_checklist(Checklist checklist) throws Exception;
public void delete_checklist(Checklist checklist) throws Exception;
public List queryAll_checklist(Checklist checklist) throws Exception;
public List queryBy_checklist(Checklist checklist) throws Exception;
}

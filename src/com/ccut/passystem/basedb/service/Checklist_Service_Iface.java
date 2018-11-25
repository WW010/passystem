package com.ccut.passystem.basedb.service;
import com.ccut.passystem.basedb.domain.Checklist;
import java.util.List;
public interface Checklist_Service_Iface {
public void insert_checklist(Checklist checklist) throws Exception;
public void update_checklist(Checklist checklist) throws Exception;
public void delete_checklist(Checklist checklist) throws Exception;
public List queryAll_checklist(Checklist checklist) throws Exception;
public List queryBy_checklist(Checklist checklist) throws Exception;
}

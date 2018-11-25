package com.ccut.passystem.basedb.service;
import com.ccut.passystem.basedb.domain.Finishedproducelist;
import java.util.List;
public interface Finishedproducelist_Service_Iface {
public void insert_finishedproducelist(Finishedproducelist finishedproducelist) throws Exception;
public void update_finishedproducelist(Finishedproducelist finishedproducelist) throws Exception;
public void delete_finishedproducelist(Finishedproducelist finishedproducelist) throws Exception;
public List queryAll_finishedproducelist(Finishedproducelist finishedproducelist) throws Exception;
public List queryBy_finishedproducelist(Finishedproducelist finishedproducelist) throws Exception;
}

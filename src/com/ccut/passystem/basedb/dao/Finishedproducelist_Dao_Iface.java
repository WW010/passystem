package com.ccut.passystem.basedb.dao;
import java.util.List;
import com.ccut.passystem.basedb.domain.Finishedproducelist;
public interface Finishedproducelist_Dao_Iface {
public void insert_finishedproducelist(Finishedproducelist finishedproducelist) throws Exception;
public void update_finishedproducelist(Finishedproducelist finishedproducelist) throws Exception;
public void delete_finishedproducelist(Finishedproducelist finishedproducelist) throws Exception;
public List queryAll_finishedproducelist(Finishedproducelist finishedproducelist) throws Exception;
public List queryBy_finishedproducelist(Finishedproducelist finishedproducelist) throws Exception;
}

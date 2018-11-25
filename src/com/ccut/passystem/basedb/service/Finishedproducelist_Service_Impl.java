package com.ccut.passystem.basedb.service;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.ccut.passystem.basedb.domain.Finishedproducelist;
import com.ccut.passystem.basedb.dao.Finishedproducelist_Dao_Iface;

@Service("Finishedproducelist_Service")
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class Finishedproducelist_Service_Impl implements Finishedproducelist_Service_Iface {
@Resource
public Finishedproducelist_Dao_Iface finishedproducelist_dao_iface;
public void insert_finishedproducelist(Finishedproducelist finishedproducelist) throws Exception{
finishedproducelist_dao_iface.insert_finishedproducelist(finishedproducelist);
}
public void update_finishedproducelist(Finishedproducelist finishedproducelist) throws Exception{
finishedproducelist_dao_iface.update_finishedproducelist(finishedproducelist);
}
public void delete_finishedproducelist(Finishedproducelist finishedproducelist) throws Exception{
finishedproducelist_dao_iface.delete_finishedproducelist(finishedproducelist);
}
public List queryAll_finishedproducelist(Finishedproducelist finishedproducelist) throws Exception{
return finishedproducelist_dao_iface.queryAll_finishedproducelist(finishedproducelist);
}
public List queryBy_finishedproducelist(Finishedproducelist finishedproducelist) throws Exception{
return finishedproducelist_dao_iface.queryBy_finishedproducelist(finishedproducelist);
}
}
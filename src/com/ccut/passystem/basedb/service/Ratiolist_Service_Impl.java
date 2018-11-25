package com.ccut.passystem.basedb.service;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.ccut.passystem.basedb.domain.Ratiolist;
import com.ccut.passystem.basedb.dao.Ratiolist_Dao_Iface;

@Service("Ratiolist_Service")
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class Ratiolist_Service_Impl implements Ratiolist_Service_Iface {
@Resource
public Ratiolist_Dao_Iface ratiolist_dao_iface;
public void insert_ratiolist(Ratiolist ratiolist) throws Exception{
ratiolist_dao_iface.insert_ratiolist(ratiolist);
}
public void update_ratiolist(Ratiolist ratiolist) throws Exception{
ratiolist_dao_iface.update_ratiolist(ratiolist);
}
public void delete_ratiolist(Ratiolist ratiolist) throws Exception{
ratiolist_dao_iface.delete_ratiolist(ratiolist);
}
public List queryAll_ratiolist(Ratiolist ratiolist) throws Exception{
return ratiolist_dao_iface.queryAll_ratiolist(ratiolist);
}
public List queryBy_ratiolist(Ratiolist ratiolist) throws Exception{
return ratiolist_dao_iface.queryBy_ratiolist(ratiolist);
}
}
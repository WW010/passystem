package com.ccut.passystem.basedb.service;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.ccut.passystem.basedb.domain.Qualitylist;
import com.ccut.passystem.basedb.dao.Qualitylist_Dao_Iface;

@Service("Qualitylist_Service")
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class Qualitylist_Service_Impl implements Qualitylist_Service_Iface {
@Resource
public Qualitylist_Dao_Iface qualitylist_dao_iface;
public void insert_qualitylist(Qualitylist qualitylist) throws Exception{
qualitylist_dao_iface.insert_qualitylist(qualitylist);
}
public void update_qualitylist(Qualitylist qualitylist) throws Exception{
qualitylist_dao_iface.update_qualitylist(qualitylist);
}
public void delete_qualitylist(Qualitylist qualitylist) throws Exception{
qualitylist_dao_iface.delete_qualitylist(qualitylist);
}
public List queryAll_qualitylist(Qualitylist qualitylist) throws Exception{
return qualitylist_dao_iface.queryAll_qualitylist(qualitylist);
}
public List queryBy_qualitylist(Qualitylist qualitylist) throws Exception{
return qualitylist_dao_iface.queryBy_qualitylist(qualitylist);
}
}
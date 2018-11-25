package com.ccut.passystem.basedb.service;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.ccut.passystem.basedb.domain.Checklist;
import com.ccut.passystem.basedb.dao.Checklist_Dao_Iface;

@Service("Checklist_Service")
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class Checklist_Service_Impl implements Checklist_Service_Iface {
@Resource
public Checklist_Dao_Iface checklist_dao_iface;
public void insert_checklist(Checklist checklist) throws Exception{
checklist_dao_iface.insert_checklist(checklist);
}
public void update_checklist(Checklist checklist) throws Exception{
checklist_dao_iface.update_checklist(checklist);
}
public void delete_checklist(Checklist checklist) throws Exception{
checklist_dao_iface.delete_checklist(checklist);
}
public List queryAll_checklist(Checklist checklist) throws Exception{
return checklist_dao_iface.queryAll_checklist(checklist);
}
public List queryBy_checklist(Checklist checklist) throws Exception{
return checklist_dao_iface.queryBy_checklist(checklist);
}
}
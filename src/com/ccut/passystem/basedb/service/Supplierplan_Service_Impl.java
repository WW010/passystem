package com.ccut.passystem.basedb.service;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.ccut.passystem.basedb.domain.Supplierplan;
import com.ccut.passystem.basedb.dao.Supplierplan_Dao_Iface;

@Service("Supplierplan_Service")
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class Supplierplan_Service_Impl implements Supplierplan_Service_Iface {
@Resource
public Supplierplan_Dao_Iface supplierplan_dao_iface;
public void insert_supplierplan(Supplierplan supplierplan) throws Exception{
supplierplan_dao_iface.insert_supplierplan(supplierplan);
}
public void update_supplierplan(Supplierplan supplierplan) throws Exception{
supplierplan_dao_iface.update_supplierplan(supplierplan);
}
public void delete_supplierplan(Supplierplan supplierplan) throws Exception{
supplierplan_dao_iface.delete_supplierplan(supplierplan);
}
public List queryAll_supplierplan(Supplierplan supplierplan) throws Exception{
return supplierplan_dao_iface.queryAll_supplierplan(supplierplan);
}
public List queryBy_supplierplan(Supplierplan supplierplan) throws Exception{
return supplierplan_dao_iface.queryBy_supplierplan(supplierplan);
}
}
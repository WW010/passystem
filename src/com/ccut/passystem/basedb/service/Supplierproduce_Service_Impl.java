package com.ccut.passystem.basedb.service;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.ccut.passystem.basedb.domain.Supplierproduce;
import com.ccut.passystem.basedb.dao.Supplierproduce_Dao_Iface;

@Service("Supplierproduce_Service")
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class Supplierproduce_Service_Impl implements Supplierproduce_Service_Iface {
@Resource
public Supplierproduce_Dao_Iface supplierproduce_dao_iface;
public void insert_supplierproduce(Supplierproduce supplierproduce) throws Exception{
supplierproduce_dao_iface.insert_supplierproduce(supplierproduce);
}
public void update_supplierproduce(Supplierproduce supplierproduce) throws Exception{
supplierproduce_dao_iface.update_supplierproduce(supplierproduce);
}
public void delete_supplierproduce(Supplierproduce supplierproduce) throws Exception{
supplierproduce_dao_iface.delete_supplierproduce(supplierproduce);
}
public List queryAll_supplierproduce(Supplierproduce supplierproduce) throws Exception{
return supplierproduce_dao_iface.queryAll_supplierproduce(supplierproduce);
}
public List queryBy_supplierproduce(Supplierproduce supplierproduce) throws Exception{
return supplierproduce_dao_iface.queryBy_supplierproduce(supplierproduce);
}
}
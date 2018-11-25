package com.ccut.passystem.basedb.service;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.ccut.passystem.basedb.domain.Subproduce;
import com.ccut.passystem.basedb.dao.Subproduce_Dao_Iface;

@Service("Subproduce_Service")
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class Subproduce_Service_Impl implements Subproduce_Service_Iface {
@Resource
public Subproduce_Dao_Iface subproduce_dao_iface;
public void insert_subproduce(Subproduce subproduce) throws Exception{
subproduce_dao_iface.insert_subproduce(subproduce);
}
public void update_subproduce(Subproduce subproduce) throws Exception{
subproduce_dao_iface.update_subproduce(subproduce);
}
public void delete_subproduce(Subproduce subproduce) throws Exception{
subproduce_dao_iface.delete_subproduce(subproduce);
}
public List queryAll_subproduce(Subproduce subproduce) throws Exception{
return subproduce_dao_iface.queryAll_subproduce(subproduce);
}
public List queryBy_subproduce(Subproduce subproduce) throws Exception{
return subproduce_dao_iface.queryBy_subproduce(subproduce);
}
}
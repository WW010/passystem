package com.ccut.passystem.basedb.service;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.ccut.passystem.basedb.domain.Costdepartmen;
import com.ccut.passystem.basedb.dao.Costdepartmen_Dao_Iface;

@Service("Costdepartmen_Service")
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class Costdepartmen_Service_Impl implements Costdepartmen_Service_Iface {
@Resource
public Costdepartmen_Dao_Iface costdepartmen_dao_iface;
public void insert_costdepartmen(Costdepartmen costdepartmen) throws Exception{
costdepartmen_dao_iface.insert_costdepartmen(costdepartmen);
}
public void update_costdepartmen(Costdepartmen costdepartmen) throws Exception{
costdepartmen_dao_iface.update_costdepartmen(costdepartmen);
}
public void delete_costdepartmen(Costdepartmen costdepartmen) throws Exception{
costdepartmen_dao_iface.delete_costdepartmen(costdepartmen);
}
public List queryAll_costdepartmen(Costdepartmen costdepartmen) throws Exception{
return costdepartmen_dao_iface.queryAll_costdepartmen(costdepartmen);
}
public List queryBy_costdepartmen(Costdepartmen costdepartmen) throws Exception{
return costdepartmen_dao_iface.queryBy_costdepartmen(costdepartmen);
}
}
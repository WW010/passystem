package com.ccut.passystem.basedb.service;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.ccut.passystem.basedb.domain.Supplierarchivers;
import com.ccut.passystem.basedb.dao.Supplierarchivers_Dao_Iface;

@Service("Supplierarchivers_Service")
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class Supplierarchivers_Service_Impl implements Supplierarchivers_Service_Iface {
@Resource
public Supplierarchivers_Dao_Iface supplierarchivers_dao_iface;
public void insert_supplierarchivers(Supplierarchivers supplierarchivers) throws Exception{
supplierarchivers_dao_iface.insert_supplierarchivers(supplierarchivers);
}
public void update_supplierarchivers(Supplierarchivers supplierarchivers) throws Exception{
supplierarchivers_dao_iface.update_supplierarchivers(supplierarchivers);
}
public void delete_supplierarchivers(Supplierarchivers supplierarchivers) throws Exception{
supplierarchivers_dao_iface.delete_supplierarchivers(supplierarchivers);
}
public List queryAll_supplierarchivers(Supplierarchivers supplierarchivers) throws Exception{
return supplierarchivers_dao_iface.queryAll_supplierarchivers(supplierarchivers);
}
public List queryBy_supplierarchivers(Supplierarchivers supplierarchivers) throws Exception{
return supplierarchivers_dao_iface.queryBy_supplierarchivers(supplierarchivers);
}
}
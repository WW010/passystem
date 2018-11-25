package com.ccut.passystem.basedb.service;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.ccut.passystem.basedb.domain.Produceevaluation;
import com.ccut.passystem.basedb.dao.Produceevaluation_Dao_Iface;

@Service("Produceevaluation_Service")
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class Produceevaluation_Service_Impl implements Produceevaluation_Service_Iface {
@Resource
public Produceevaluation_Dao_Iface produceevaluation_dao_iface;
public void insert_produceevaluation(Produceevaluation produceevaluation) throws Exception{
produceevaluation_dao_iface.insert_produceevaluation(produceevaluation);
}
public void update_produceevaluation(Produceevaluation produceevaluation) throws Exception{
produceevaluation_dao_iface.update_produceevaluation(produceevaluation);
}
public void delete_produceevaluation(Produceevaluation produceevaluation) throws Exception{
produceevaluation_dao_iface.delete_produceevaluation(produceevaluation);
}
public List queryAll_produceevaluation(Produceevaluation produceevaluation) throws Exception{
return produceevaluation_dao_iface.queryAll_produceevaluation(produceevaluation);
}
public List queryBy_produceevaluation(Produceevaluation produceevaluation) throws Exception{
return produceevaluation_dao_iface.queryBy_produceevaluation(produceevaluation);
}
}
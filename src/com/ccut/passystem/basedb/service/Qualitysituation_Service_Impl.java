package com.ccut.passystem.basedb.service;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.ccut.passystem.basedb.domain.Qualitysituation;
import com.ccut.passystem.basedb.dao.Qualitysituation_Dao_Iface;

@Service("Qualitysituation_Service")
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class Qualitysituation_Service_Impl implements Qualitysituation_Service_Iface {
@Resource
public Qualitysituation_Dao_Iface qualitysituation_dao_iface;
public void insert_qualitysituation(Qualitysituation qualitysituation) throws Exception{
qualitysituation_dao_iface.insert_qualitysituation(qualitysituation);
}
public void update_qualitysituation(Qualitysituation qualitysituation) throws Exception{
qualitysituation_dao_iface.update_qualitysituation(qualitysituation);
}
public void delete_qualitysituation(Qualitysituation qualitysituation) throws Exception{
qualitysituation_dao_iface.delete_qualitysituation(qualitysituation);
}
public List queryAll_qualitysituation(Qualitysituation qualitysituation) throws Exception{
return qualitysituation_dao_iface.queryAll_qualitysituation(qualitysituation);
}
public List queryBy_qualitysituation(Qualitysituation qualitysituation) throws Exception{
return qualitysituation_dao_iface.queryBy_qualitysituation(qualitysituation);
}
}
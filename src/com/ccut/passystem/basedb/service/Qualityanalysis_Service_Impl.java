package com.ccut.passystem.basedb.service;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.ccut.passystem.basedb.domain.Qualityanalysis;
import com.ccut.passystem.basedb.dao.Qualityanalysis_Dao_Iface;

@Service("Qualityanalysis_Service")
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class Qualityanalysis_Service_Impl implements Qualityanalysis_Service_Iface {
@Resource
public Qualityanalysis_Dao_Iface qualityanalysis_dao_iface;
public void insert_qualityanalysis(Qualityanalysis qualityanalysis) throws Exception{
qualityanalysis_dao_iface.insert_qualityanalysis(qualityanalysis);
}
public void update_qualityanalysis(Qualityanalysis qualityanalysis) throws Exception{
qualityanalysis_dao_iface.update_qualityanalysis(qualityanalysis);
}
public void delete_qualityanalysis(Qualityanalysis qualityanalysis) throws Exception{
qualityanalysis_dao_iface.delete_qualityanalysis(qualityanalysis);
}
public List queryAll_qualityanalysis(Qualityanalysis qualityanalysis) throws Exception{
return qualityanalysis_dao_iface.queryAll_qualityanalysis(qualityanalysis);
}
public List queryBy_qualityanalysis(Qualityanalysis qualityanalysis) throws Exception{
return qualityanalysis_dao_iface.queryBy_qualityanalysis(qualityanalysis);
}
}
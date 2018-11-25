package com.ccut.passystem.basedb.service;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.ccut.passystem.basedb.domain.Costanalysisi;
import com.ccut.passystem.basedb.dao.Costanalysisi_Dao_Iface;

@Service("Costanalysisi_Service")
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class Costanalysisi_Service_Impl implements Costanalysisi_Service_Iface {
@Resource
public Costanalysisi_Dao_Iface costanalysisi_dao_iface;
public void insert_costanalysisi(Costanalysisi costanalysisi) throws Exception{
costanalysisi_dao_iface.insert_costanalysisi(costanalysisi);
}
public void update_costanalysisi(Costanalysisi costanalysisi) throws Exception{
costanalysisi_dao_iface.update_costanalysisi(costanalysisi);
}
public void delete_costanalysisi(Costanalysisi costanalysisi) throws Exception{
costanalysisi_dao_iface.delete_costanalysisi(costanalysisi);
}
public List queryAll_costanalysisi(Costanalysisi costanalysisi) throws Exception{
return costanalysisi_dao_iface.queryAll_costanalysisi(costanalysisi);
}
public List queryBy_costanalysisi(Costanalysisi costanalysisi) throws Exception{
return costanalysisi_dao_iface.queryBy_costanalysisi(costanalysisi);
}
}
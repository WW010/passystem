package com.ccut.passystem.basedb.service;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.ccut.passystem.basedb.domain.Tracking;
import com.ccut.passystem.basedb.dao.Tracking_Dao_Iface;

@Service("Tracking_Service")
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class Tracking_Service_Impl implements Tracking_Service_Iface {
@Resource
public Tracking_Dao_Iface tracking_dao_iface;
public void insert_tracking(Tracking tracking) throws Exception{
tracking_dao_iface.insert_tracking(tracking);
}
public void update_tracking(Tracking tracking) throws Exception{
tracking_dao_iface.update_tracking(tracking);
}
public void delete_tracking(Tracking tracking) throws Exception{
tracking_dao_iface.delete_tracking(tracking);
}
public List queryAll_tracking(Tracking tracking) throws Exception{
return tracking_dao_iface.queryAll_tracking(tracking);
}
public List queryBy_tracking(Tracking tracking) throws Exception{
return tracking_dao_iface.queryBy_tracking(tracking);
}
}
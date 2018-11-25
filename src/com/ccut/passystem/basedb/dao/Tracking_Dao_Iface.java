package com.ccut.passystem.basedb.dao;
import java.util.List;
import com.ccut.passystem.basedb.domain.Tracking;
public interface Tracking_Dao_Iface {
public void insert_tracking(Tracking tracking) throws Exception;
public void update_tracking(Tracking tracking) throws Exception;
public void delete_tracking(Tracking tracking) throws Exception;
public List queryAll_tracking(Tracking tracking) throws Exception;
public List queryBy_tracking(Tracking tracking) throws Exception;
}

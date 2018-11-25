package com.ccut.passystem.basedb.service;
import com.ccut.passystem.basedb.domain.Tracking;
import java.util.List;
public interface Tracking_Service_Iface {
public void insert_tracking(Tracking tracking) throws Exception;
public void update_tracking(Tracking tracking) throws Exception;
public void delete_tracking(Tracking tracking) throws Exception;
public List queryAll_tracking(Tracking tracking) throws Exception;
public List queryBy_tracking(Tracking tracking) throws Exception;
}

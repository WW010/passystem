package com.ccut.passystem.basedb.service;
import com.ccut.passystem.basedb.domain.Supplierproduce;
import java.util.List;
public interface Supplierproduce_Service_Iface {
public void insert_supplierproduce(Supplierproduce supplierproduce) throws Exception;
public void update_supplierproduce(Supplierproduce supplierproduce) throws Exception;
public void delete_supplierproduce(Supplierproduce supplierproduce) throws Exception;
public List queryAll_supplierproduce(Supplierproduce supplierproduce) throws Exception;
public List queryBy_supplierproduce(Supplierproduce supplierproduce) throws Exception;
}

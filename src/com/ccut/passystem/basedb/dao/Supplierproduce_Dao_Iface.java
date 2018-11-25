package com.ccut.passystem.basedb.dao;
import java.util.List;
import com.ccut.passystem.basedb.domain.Supplierproduce;
public interface Supplierproduce_Dao_Iface {
public void insert_supplierproduce(Supplierproduce supplierproduce) throws Exception;
public void update_supplierproduce(Supplierproduce supplierproduce) throws Exception;
public void delete_supplierproduce(Supplierproduce supplierproduce) throws Exception;
public List queryAll_supplierproduce(Supplierproduce supplierproduce) throws Exception;
public List queryBy_supplierproduce(Supplierproduce supplierproduce) throws Exception;
}

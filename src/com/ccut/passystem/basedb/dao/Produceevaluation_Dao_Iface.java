package com.ccut.passystem.basedb.dao;
import java.util.List;
import com.ccut.passystem.basedb.domain.Produceevaluation;
public interface Produceevaluation_Dao_Iface {
public void insert_produceevaluation(Produceevaluation produceevaluation) throws Exception;
public void update_produceevaluation(Produceevaluation produceevaluation) throws Exception;
public void delete_produceevaluation(Produceevaluation produceevaluation) throws Exception;
public List queryAll_produceevaluation(Produceevaluation produceevaluation) throws Exception;
public List queryBy_produceevaluation(Produceevaluation produceevaluation) throws Exception;
}

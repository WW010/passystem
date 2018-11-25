package com.ccut.passystem.basedb.service;
import com.ccut.passystem.basedb.domain.Produceevaluation;
import java.util.List;
public interface Produceevaluation_Service_Iface {
public void insert_produceevaluation(Produceevaluation produceevaluation) throws Exception;
public void update_produceevaluation(Produceevaluation produceevaluation) throws Exception;
public void delete_produceevaluation(Produceevaluation produceevaluation) throws Exception;
public List queryAll_produceevaluation(Produceevaluation produceevaluation) throws Exception;
public List queryBy_produceevaluation(Produceevaluation produceevaluation) throws Exception;
}

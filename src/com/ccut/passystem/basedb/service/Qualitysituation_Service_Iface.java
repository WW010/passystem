package com.ccut.passystem.basedb.service;
import com.ccut.passystem.basedb.domain.Qualitysituation;
import java.util.List;
public interface Qualitysituation_Service_Iface {
public void insert_qualitysituation(Qualitysituation qualitysituation) throws Exception;
public void update_qualitysituation(Qualitysituation qualitysituation) throws Exception;
public void delete_qualitysituation(Qualitysituation qualitysituation) throws Exception;
public List queryAll_qualitysituation(Qualitysituation qualitysituation) throws Exception;
public List queryBy_qualitysituation(Qualitysituation qualitysituation) throws Exception;
}

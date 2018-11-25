package com.ccut.passystem.basedb.dao;
import java.util.List;
import com.ccut.passystem.basedb.domain.Qualitysituation;
public interface Qualitysituation_Dao_Iface {
public void insert_qualitysituation(Qualitysituation qualitysituation) throws Exception;
public void update_qualitysituation(Qualitysituation qualitysituation) throws Exception;
public void delete_qualitysituation(Qualitysituation qualitysituation) throws Exception;
public List queryAll_qualitysituation(Qualitysituation qualitysituation) throws Exception;
public List queryBy_qualitysituation(Qualitysituation qualitysituation) throws Exception;
}

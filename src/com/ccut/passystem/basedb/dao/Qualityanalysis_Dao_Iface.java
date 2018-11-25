package com.ccut.passystem.basedb.dao;
import java.util.List;
import com.ccut.passystem.basedb.domain.Qualityanalysis;
public interface Qualityanalysis_Dao_Iface {
public void insert_qualityanalysis(Qualityanalysis qualityanalysis) throws Exception;
public void update_qualityanalysis(Qualityanalysis qualityanalysis) throws Exception;
public void delete_qualityanalysis(Qualityanalysis qualityanalysis) throws Exception;
public List queryAll_qualityanalysis(Qualityanalysis qualityanalysis) throws Exception;
public List queryBy_qualityanalysis(Qualityanalysis qualityanalysis) throws Exception;
}

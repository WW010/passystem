package com.ccut.passystem.basedb.service;
import com.ccut.passystem.basedb.domain.Qualityanalysis;
import java.util.List;
public interface Qualityanalysis_Service_Iface {
public void insert_qualityanalysis(Qualityanalysis qualityanalysis) throws Exception;
public void update_qualityanalysis(Qualityanalysis qualityanalysis) throws Exception;
public void delete_qualityanalysis(Qualityanalysis qualityanalysis) throws Exception;
public List queryAll_qualityanalysis(Qualityanalysis qualityanalysis) throws Exception;
public List queryBy_qualityanalysis(Qualityanalysis qualityanalysis) throws Exception;
}

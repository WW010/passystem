package com.ccut.passystem.basedb.service;
import com.ccut.passystem.basedb.domain.Costanalysisi;
import java.util.List;
public interface Costanalysisi_Service_Iface {
public void insert_costanalysisi(Costanalysisi costanalysisi) throws Exception;
public void update_costanalysisi(Costanalysisi costanalysisi) throws Exception;
public void delete_costanalysisi(Costanalysisi costanalysisi) throws Exception;
public List queryAll_costanalysisi(Costanalysisi costanalysisi) throws Exception;
public List queryBy_costanalysisi(Costanalysisi costanalysisi) throws Exception;
}

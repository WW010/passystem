package com.ccut.passystem.basedb.dao;
import java.util.List;
import com.ccut.passystem.basedb.domain.Costanalysisi;
public interface Costanalysisi_Dao_Iface {
public void insert_costanalysisi(Costanalysisi costanalysisi) throws Exception;
public void update_costanalysisi(Costanalysisi costanalysisi) throws Exception;
public void delete_costanalysisi(Costanalysisi costanalysisi) throws Exception;
public List queryAll_costanalysisi(Costanalysisi costanalysisi) throws Exception;
public List queryBy_costanalysisi(Costanalysisi costanalysisi) throws Exception;
}

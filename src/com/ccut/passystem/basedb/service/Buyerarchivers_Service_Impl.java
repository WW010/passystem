package com.ccut.passystem.basedb.service;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.ccut.passystem.basedb.domain.Buyerarchivers;
import com.ccut.passystem.basedb.dao.Buyerarchivers_Dao_Iface;

@Service("Buyerarchivers_Service")
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class Buyerarchivers_Service_Impl implements Buyerarchivers_Service_Iface {
@Resource
public Buyerarchivers_Dao_Iface buyerarchivers_dao_iface;
public void insert_buyerarchivers(Buyerarchivers buyerarchivers) throws Exception{
buyerarchivers_dao_iface.insert_buyerarchivers(buyerarchivers);
}
public void update_buyerarchivers(Buyerarchivers buyerarchivers) throws Exception{
buyerarchivers_dao_iface.update_buyerarchivers(buyerarchivers);
}
public void delete_buyerarchivers(Buyerarchivers buyerarchivers) throws Exception{
buyerarchivers_dao_iface.delete_buyerarchivers(buyerarchivers);
}
public List queryAll_buyerarchivers(Buyerarchivers buyerarchivers) throws Exception{
return buyerarchivers_dao_iface.queryAll_buyerarchivers(buyerarchivers);
}
public List queryBy_buyerarchivers(Buyerarchivers buyerarchivers) throws Exception{
return buyerarchivers_dao_iface.queryBy_buyerarchivers(buyerarchivers);
}
}
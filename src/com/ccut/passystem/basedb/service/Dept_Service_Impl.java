package com.ccut.passystem.basedb.service;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.ccut.passystem.basedb.domain.Dept;
import com.ccut.passystem.basedb.dao.Dept_Dao_Iface;

@Service("Dept_Service")
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class Dept_Service_Impl implements Dept_Service_Iface {
@Resource
public Dept_Dao_Iface dept_dao_iface;
public void insert_dept(Dept dept) throws Exception{
dept_dao_iface.insert_dept(dept);
}
public void update_dept(Dept dept) throws Exception{
dept_dao_iface.update_dept(dept);
}
public void delete_dept(Dept dept) throws Exception{
dept_dao_iface.delete_dept(dept);
}
public List queryAll_dept(Dept dept) throws Exception{
return dept_dao_iface.queryAll_dept(dept);
}
public List queryBy_dept(Dept dept) throws Exception{
return dept_dao_iface.queryBy_dept(dept);
}
}
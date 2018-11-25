package com.ccut.passystem.basedb.dao;
import java.util.List;
import com.ccut.passystem.basedb.domain.Dept;
public interface Dept_Dao_Iface {
public void insert_dept(Dept dept) throws Exception;
public void update_dept(Dept dept) throws Exception;
public void delete_dept(Dept dept) throws Exception;
public List queryAll_dept(Dept dept) throws Exception;
public List queryBy_dept(Dept dept) throws Exception;
}

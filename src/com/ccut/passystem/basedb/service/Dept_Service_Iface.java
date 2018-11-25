package com.ccut.passystem.basedb.service;
import com.ccut.passystem.basedb.domain.Dept;
import java.util.List;
public interface Dept_Service_Iface {
public void insert_dept(Dept dept) throws Exception;
public void update_dept(Dept dept) throws Exception;
public void delete_dept(Dept dept) throws Exception;
public List queryAll_dept(Dept dept) throws Exception;
public List queryBy_dept(Dept dept) throws Exception;
}

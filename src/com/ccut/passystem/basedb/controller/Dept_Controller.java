package com.ccut.passystem.basedb.controller;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ccut.passystem.basedb.domain.Dept;
import com.ccut.passystem.basedb.service.Dept_Service_Iface;
@Controller
@RequestMapping("Dept_Controller")
public class Dept_Controller {
@Resource
public Dept_Service_Iface dept_service_iface;







}
package com.ccut.passystem.basedb.controller;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ccut.passystem.basedb.domain.Supplierplan;
import com.ccut.passystem.basedb.service.Supplierplan_Service_Iface;
@Controller
@RequestMapping("Supplierplan_Controller")
public class Supplierplan_Controller {
@Resource
public Supplierplan_Service_Iface supplierplan_service_iface;







}
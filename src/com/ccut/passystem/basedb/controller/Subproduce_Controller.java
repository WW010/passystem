package com.ccut.passystem.basedb.controller;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ccut.passystem.basedb.domain.Subproduce;
import com.ccut.passystem.basedb.service.Subproduce_Service_Iface;
@Controller
@RequestMapping("Subproduce_Controller")
public class Subproduce_Controller {
@Resource
public Subproduce_Service_Iface subproduce_service_iface;







}
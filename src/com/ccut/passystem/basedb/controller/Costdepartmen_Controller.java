package com.ccut.passystem.basedb.controller;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ccut.passystem.basedb.domain.Costdepartmen;
import com.ccut.passystem.basedb.service.Costdepartmen_Service_Iface;
@Controller
@RequestMapping("Costdepartmen_Controller")
public class Costdepartmen_Controller {
@Resource
public Costdepartmen_Service_Iface costdepartmen_service_iface;







}
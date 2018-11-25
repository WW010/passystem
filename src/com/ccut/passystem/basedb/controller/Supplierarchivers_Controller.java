package com.ccut.passystem.basedb.controller;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ccut.passystem.basedb.domain.Supplierarchivers;
import com.ccut.passystem.basedb.service.Supplierarchivers_Service_Iface;
@Controller
@RequestMapping("Supplierarchivers_Controller")
public class Supplierarchivers_Controller {
@Resource
public Supplierarchivers_Service_Iface supplierarchivers_service_iface;







}
package com.ccut.passystem.basedb.controller;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ccut.passystem.basedb.domain.Buyerarchivers;
import com.ccut.passystem.basedb.service.Buyerarchivers_Service_Iface;
@Controller
@RequestMapping("Buyerarchivers_Controller")
public class Buyerarchivers_Controller {
@Resource
public Buyerarchivers_Service_Iface buyerarchivers_service_iface;







}
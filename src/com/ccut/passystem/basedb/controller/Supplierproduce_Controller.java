package com.ccut.passystem.basedb.controller;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ccut.passystem.basedb.domain.Supplierproduce;
import com.ccut.passystem.basedb.service.Supplierproduce_Service_Iface;
@Controller
@RequestMapping("Supplierproduce_Controller")
public class Supplierproduce_Controller {
@Resource
public Supplierproduce_Service_Iface supplierproduce_service_iface;







}
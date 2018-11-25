package com.ccut.passystem.basedb.controller;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ccut.passystem.basedb.domain.Costanalysisi;
import com.ccut.passystem.basedb.service.Costanalysisi_Service_Iface;
@Controller
@RequestMapping("Costanalysisi_Controller")
public class Costanalysisi_Controller {
@Resource
public Costanalysisi_Service_Iface costanalysisi_service_iface;







}
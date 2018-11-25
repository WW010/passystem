package com.ccut.passystem.basedb.controller;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ccut.passystem.basedb.domain.Qualitysituation;
import com.ccut.passystem.basedb.service.Qualitysituation_Service_Iface;
@Controller
@RequestMapping("Qualitysituation_Controller")
public class Qualitysituation_Controller {
@Resource
public Qualitysituation_Service_Iface qualitysituation_service_iface;







}
package com.ccut.passystem.basedb.controller;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ccut.passystem.basedb.domain.Qualityanalysis;
import com.ccut.passystem.basedb.service.Qualityanalysis_Service_Iface;
@Controller
@RequestMapping("Qualityanalysis_Controller")
public class Qualityanalysis_Controller {
@Resource
public Qualityanalysis_Service_Iface qualityanalysis_service_iface;







}
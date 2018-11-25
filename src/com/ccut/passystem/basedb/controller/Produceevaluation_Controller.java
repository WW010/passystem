package com.ccut.passystem.basedb.controller;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ccut.passystem.basedb.domain.Produceevaluation;
import com.ccut.passystem.basedb.service.Produceevaluation_Service_Iface;
@Controller
@RequestMapping("Produceevaluation_Controller")
public class Produceevaluation_Controller {
@Resource
public Produceevaluation_Service_Iface produceevaluation_service_iface;







}
package com.ccut.passystem.basedb.controller;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ccut.passystem.basedb.domain.Qualitylist;
import com.ccut.passystem.basedb.service.Qualitylist_Service_Iface;
@Controller
@RequestMapping("Qualitylist_Controller")
public class Qualitylist_Controller {
@Resource
public Qualitylist_Service_Iface qualitylist_service_iface;







}
package com.ccut.passystem.basedb.controller;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ccut.passystem.basedb.domain.Tracking;
import com.ccut.passystem.basedb.service.Tracking_Service_Iface;
@Controller
@RequestMapping("Tracking_Controller")
public class Tracking_Controller {
@Resource
public Tracking_Service_Iface tracking_service_iface;







}
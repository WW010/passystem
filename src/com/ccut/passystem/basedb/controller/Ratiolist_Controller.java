package com.ccut.passystem.basedb.controller;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ccut.passystem.basedb.domain.Ratiolist;
import com.ccut.passystem.basedb.service.Ratiolist_Service_Iface;
@Controller
@RequestMapping("Ratiolist_Controller")
public class Ratiolist_Controller {
@Resource
public Ratiolist_Service_Iface ratiolist_service_iface;







}
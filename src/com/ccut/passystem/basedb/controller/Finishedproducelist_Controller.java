package com.ccut.passystem.basedb.controller;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ccut.passystem.basedb.domain.Finishedproducelist;
import com.ccut.passystem.basedb.service.Finishedproducelist_Service_Iface;
@Controller
@RequestMapping("Finishedproducelist_Controller")
public class Finishedproducelist_Controller {
@Resource
public Finishedproducelist_Service_Iface finishedproducelist_service_iface;







}
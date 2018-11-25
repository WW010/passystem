package com.ccut.passystem.basedb.controller;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ccut.passystem.basedb.domain.Checklist;
import com.ccut.passystem.basedb.service.Checklist_Service_Iface;
@Controller
@RequestMapping("Checklist_Controller")
public class Checklist_Controller {
@Resource
public Checklist_Service_Iface checklist_service_iface;







}
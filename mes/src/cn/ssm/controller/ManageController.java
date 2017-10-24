package cn.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller 
@RequestMapping("/manage")
public class ManageController {

	
	@RequestMapping("/clientManage")
	public String clientManage(Model model )throws Exception{
		
		return "clientManage";
	}
	@RequestMapping("/assetManage")
	public String assetManage(Model model )throws Exception{
		
		return "assetManage";
	}
	
}
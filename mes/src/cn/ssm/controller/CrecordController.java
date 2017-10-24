package cn.ssm.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.ssm.po.Crecord;
import cn.ssm.po.CrecordAssetnum;
import cn.ssm.po.Crecordline;
import cn.ssm.po.DevDodate;
import cn.ssm.service.CrecordService;

@Controller
@RequestMapping ("/crecord")
public class CrecordController {
	@Autowired 
	private CrecordService crecordService;
	@RequestMapping ("/getAll")
	public String getAll(String dev ,Model model, String dodate) throws Exception{
		ArrayList<Crecord> itemdetails=new ArrayList<Crecord>();
		ArrayList<CrecordAssetnum> items = new ArrayList<CrecordAssetnum>();
		items=crecordService.selectCrecordAseet();
		model.addAttribute("items", items);
		DevDodate devdodate=new DevDodate();
		devdodate.setDev(dev);
		devdodate.setDodate(dodate);
		if("*".equals(dev)){
			itemdetails=crecordService.selectAllCrecord(devdodate);
		}else{
			itemdetails=crecordService.selectCrecord(devdodate);
		}
		
		
		model.addAttribute("itemdetails", itemdetails);
		return "crecord";
		
	}
	
	@RequestMapping("/getCrecordline")
	public String  getPistdline(String CPLANNUM,String ASSETNUM,Model model) throws Exception{
		ArrayList<Crecordline> items=new ArrayList<Crecordline>();
		items=crecordService.selectCrecordline(CPLANNUM, ASSETNUM);
		model.addAttribute("items", items);
		return "crecordline";
		
	}
}

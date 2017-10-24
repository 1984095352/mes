package cn.ssm.controller;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.ssm.po.Abnormal;
import cn.ssm.po.Crecordline;
import cn.ssm.service.CrecordService;
import cn.ssm.util.getNextDay;

@Controller
@RequestMapping ("/abnormal")
public class AbnormalController {
	@Autowired 
	private CrecordService crecordService;
	@RequestMapping ("/getAll")
	public String getAll(String startdate,String enddate,Model model) throws Exception{
		ArrayList<Abnormal> itemdetails=new ArrayList<Abnormal>();
		if((startdate==null||startdate == "")&&((enddate!=null&&enddate != ""))){
			startdate="1000-1-1";
			enddate=getNextDay.getNextDate(enddate);
		}else if((startdate!=null&&startdate != "")&&((enddate==null||enddate == ""))){
			enddate=getNextDay.getNextDate(new Date());
		}else if((startdate!=null&&startdate != "")&&((enddate!=null&&enddate != ""))){
			enddate=getNextDay.getNextDate(enddate);
		}else if((startdate==null||startdate=="")&&(enddate==null||enddate == "")){
			startdate="1000-1-1";
			enddate=getNextDay.getNextDate(new Date());
		}
		itemdetails=crecordService.selectAbnormalByTime(startdate, enddate);
		
		
		model.addAttribute("itemdetails", itemdetails);
		return "abnormal";
		
	}
	
	@RequestMapping("/getCrecordline")
	public String  getPistdline(String CPLANNUM,String ASSETNUM,Model model) throws Exception{
		ArrayList<Crecordline> items=new ArrayList<Crecordline>();
		items=crecordService.selectCrecordline(CPLANNUM, ASSETNUM);
		model.addAttribute("items", items);
		return "crecordline";
		
	}
}

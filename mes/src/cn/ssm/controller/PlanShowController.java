package cn.ssm.controller;

import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.ssm.po.PlandevshowRecord;
import cn.ssm.po.Plandevshowperson;
import cn.ssm.service.PlanShowService;
import cn.ssm.util.getNextDay;

@Controller
@RequestMapping ("/plan")
public class PlanShowController {
	@Autowired
	private PlanShowService planShowService;
	@RequestMapping("/getAll")
	public String getAll(String startdate,String enddate,String people,Model model,HttpSession session)throws Exception{
		ArrayList<Plandevshowperson> Pplist = new ArrayList<Plandevshowperson>();
		ArrayList<PlandevshowRecord> Prlist = new ArrayList<PlandevshowRecord>();
		Pplist=planShowService.selectCplanPerson();
		model.addAttribute("Pplist", Pplist);

		if(people==null||"0".equals(people)){
			people="*";
		}
		if((startdate==null||startdate == "")&&((enddate!=null||enddate != ""))){
			startdate="1000-1-1";
			enddate=getNextDay.getNextDate(enddate);
		}
		if((startdate!=null||startdate != "")&&((enddate==null||enddate == ""))){
			enddate=getNextDay.getNextDate(new Date());
		}
		if((startdate!=null||startdate != "")&&((enddate!=null||enddate != ""))){
			enddate=getNextDay.getNextDate(enddate);
		}
		if((startdate==null||startdate=="")&&(enddate==null||enddate == "")){
			startdate="1000-1-1";
			enddate=getNextDay.getNextDate(new Date());
		}
		if(people==null||"*".equals(people)){
			Prlist=planShowService.selectAllPlanRecord(startdate, enddate);
		}else{
			Prlist=planShowService.selectPlanRecord(startdate, enddate, people);
		}
		model.addAttribute("Prlist", Prlist);
		return "plandevshow";
		
	}

}

package cn.ssm.controller;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.ssm.po.CplandevshowRecord;
import cn.ssm.po.Plandevshowperson;
import cn.ssm.service.CplanShowService;
import cn.ssm.util.getNextDay;

@Controller
@RequestMapping ("/cplan")
public class CplanShowController {
	@Autowired
	private CplanShowService cplanShowService;
	@RequestMapping("/getAll")
	public String getAll(String startdate,String enddate,String people,Model model)throws Exception{
		ArrayList<Plandevshowperson> Cplist = new ArrayList<Plandevshowperson>();
		ArrayList<CplandevshowRecord> Crlist = new ArrayList<CplandevshowRecord>();
		Cplist=cplanShowService.selectCplanPerson();
		model.addAttribute("Cplist", Cplist);

		if(people==null||"0".equals(people)){
			people="*";
		}
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
		if(people==null||"*".equals(people)){
			Crlist=cplanShowService.selectAllCplanRecord(startdate, enddate);
		}else{
			Crlist=cplanShowService.selectCplanRecord(startdate, enddate, people);
		}
		model.addAttribute("Crlist", Crlist);
		return "cplandevshow";
		
	}

}

package cn.ssm.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.ssm.po.Addplan_3Assetnum;
import cn.ssm.po.Person;
import cn.ssm.service.AddPlanService;

/**   
* @Title: AddPlanController.java
* @Package cn.ssm.controller
* @Description: 添加计划
* @author wei   
* @date 2017-6-8 下午3:11:25
* @version V1.0   
*/
@Controller
@RequestMapping ("/add")
public class AddPlanController {
	@Autowired
	private AddPlanService addPlanService;
	@RequestMapping("/plan1")
	public String addPlan1(HttpSession session)throws Exception{
		return "addplan-1";
		
	}
	@RequestMapping("/plan2")
	public String addPlan2(String dodate ,String pro,Model model,HttpSession session)throws Exception{
		session.setAttribute("dodate", dodate);
		session.setAttribute("pro", pro);
		ArrayList<Person> Plist = new ArrayList<Person>();
		Plist=addPlanService.selectByPro(pro);
		model.addAttribute("Plist", Plist);
		return "addplan-2";
		
	}
	@RequestMapping("/plan3")
	public String addPlan3(String people,Model model,HttpSession session)throws Exception{
		ArrayList<Addplan_3Assetnum> list = new ArrayList<Addplan_3Assetnum>();
		session.setAttribute("people", people);
		String pro=(String) session.getAttribute("pro");
		list=addPlanService.selectAdd3(pro);
		model.addAttribute("list", list);
		return "addplan-3";
		
	}
	@RequestMapping("/plan4")
	public String addPlan4( HttpServletRequest request,Model model,HttpSession session,HttpServletResponse response)throws Exception{
		String[] dev = request.getParameterValues("dev[]");
		String pro=(String) session.getAttribute("pro");
		String people=(String) session.getAttribute("people");
		String dodate=(String) session.getAttribute("dodate");
		Person p= (Person) session.getAttribute("user");
		if(p==null){
			model.addAttribute("error", "请先登录！");
			return "forward:/WEB-INF/jsp/index.jsp";
		}
		String DRAWUPBY=	p.getLoginid();		
		for(int i=0;i<dev.length;i++){
		Person person=	addPlanService.selectByLoginId(people);
		String DEPARTMENT=person.getDepartment();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
		String dateString = sdf.format(new Date());
		Random r = new Random();
		String ran = r.nextInt(9999)+"";		
		SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd");		
		String DRAWUPDATE = d.format(new Date());						
		String PIPLANNUM = dateString + ran;				
		String DEVICENUM = dev[i]; 							
		String PIPROFESSION = pro;
		String STDNUM = addPlanService.selectPistdNum(PIPROFESSION, DEVICENUM);
		Map<String,String> map =new HashMap<String,String>();
		map.put("PIPLANNUM", PIPLANNUM);
		map.put("DEPARTMENT", DEPARTMENT);
		map.put("PIPROFESSION", PIPROFESSION);
		map.put("DRAWUPBY", DRAWUPBY);
		map.put("DRAWUPDATE", DRAWUPDATE);
		map.put("people", people);
		map.put("dodate", dodate);
		map.put("DEVICENUM", DEVICENUM);
		map.put("STDNUM", STDNUM);
		
		addPlanService.insertPirecord(map);
		}
		return "addplan-4";
		
	}
}

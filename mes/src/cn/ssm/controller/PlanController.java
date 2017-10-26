package cn.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.ssm.po.ShopPlan;
import cn.ssm.po.Task;
import cn.ssm.service.ShopPlanService;



@Controller 
@RequestMapping("/plan")
public class PlanController {
	
	@Autowired
	private ShopPlanService shopPlanService;
	@RequestMapping("/toShopPlan")
	public String toShopPlan(Integer planId,Model model )throws Exception{
		List<Task> listTask= new ArrayList<Task>();
		ShopPlan shopPlan=shopPlanService.selectByPrimaryKey(planId);
		model.addAttribute("shopPlan", shopPlan);
		listTask=shopPlanService.selectTaskByKey(planId);
		model.addAttribute("listTask", listTask);
		model.addAttribute("planId", planId);
		return "shopplan";
	}
	@RequestMapping("/addShopPlan")
	public String addShopPlan(ShopPlan shopPlan,Integer num,HttpServletRequest request,Model model )throws Exception{
		List<Task> listTask=new ArrayList<Task>();
		String processSort="";
		
			if(num!=null){
				for(int i=1;i<=num;i++){
					String gongxu=request.getParameter("gongxu"+i);
					String caozuogong=request.getParameter("caozuogong"+i);
					String shebei=request.getParameter("shebei"+i);
					Task task=new Task();
					task.setProcessName(gongxu);
					task.setOperator(caozuogong);
					task.setAsset(shebei);
					listTask.add(task);
					processSort +=gongxu+",";
				}
				processSort=processSort.substring(0, processSort.length()-1);
				shopPlanService.insertShopPlan(shopPlan,processSort);
				Integer planId=shopPlan.getPlanId();
				shopPlanService.insertTask(listTask,planId);
				return "shopplanlist";
			}else{
				return "redirect:toShopPlan";
			}
	}
		
		
	
	@RequestMapping("/toOrder")
	public String toOrder(Model model )throws Exception{
		
		return "order";
	}
	@RequestMapping("/toApply")
	public String toApply(Model model )throws Exception{
		
		return "applyMaterials";
	}
	@RequestMapping("/toProductTest")
	public String toProductTest(Model model )throws Exception{
		
		return "product_test";
	}

	@RequestMapping("/toGenzongdan")
	public String toGenzongdan(Model model )throws Exception{
		
		return "genzongdan";
	}
	@RequestMapping("/shopAjax")
	public String ajax(HttpServletRequest request,HttpServletResponse response,Model model )throws Exception{
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		//PrintWriter out=response.getWriter();
		String data="工序1,工序2,工序3";
		//out.print(data);
		model.addAttribute("data", data);
		return "shopdiv";
		
	}
	@RequestMapping("/orderAjax")
	public String orderAjax(HttpServletRequest request,HttpServletResponse response,Model model )throws Exception{
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		String data="123456";
		
		model.addAttribute("data", data);
		return "orderdiv";
		
	}
	@RequestMapping("/applyAjax")
	public String applyAjax(HttpServletRequest request,HttpServletResponse response,Model model )throws Exception{
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		String data="123,456,789,123,666666";
		
		model.addAttribute("data", data);
		return "applydiv";
		
	}
	@RequestMapping("/genzongdanAjax")
	public String genzongdanAjax(HttpServletRequest request,HttpServletResponse response,Model model )throws Exception{
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		//PrintWriter out=response.getWriter();
		String data="工序1,工序2,工序3";
		//out.print(data);
		model.addAttribute("data", data);
		return "genzongdandiv";
		
	}
	@RequestMapping("/productTestAjax")
	public String productTestAjax(HttpServletRequest request,HttpServletResponse response,Model model )throws Exception{
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		//PrintWriter out=response.getWriter();
		String data="工序1,工序2,工序3";
		//out.print(data);
		model.addAttribute("data", data);
		return "productTestDiv";
		
	}
}
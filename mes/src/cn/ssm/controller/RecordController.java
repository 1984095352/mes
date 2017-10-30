package cn.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.ssm.po.ShopPlan;
import cn.ssm.service.ShopPlanService;



@Controller 
@RequestMapping("/record")
public class RecordController {

	@Autowired
	private ShopPlanService shopPlanService;
	@RequestMapping("/toOrderList")
	public String toOrderList(Model model )throws Exception{
		
		return "order_list";
	}
	@RequestMapping("/toApplyList")
	public String toApplyList(Model model )throws Exception{
		
		return "applyList";
	}
	@RequestMapping("/toShopPlanList")
	public String toShopPlanList(String client, String chanpin, String chejian,Model model )throws Exception{
		List<ShopPlan> listShopPlan = new ArrayList<ShopPlan>();
		listShopPlan=shopPlanService.selectShopPlanByParam(client, chanpin, chejian);
		model.addAttribute("listShopPlan",listShopPlan);
		return "shopplanlist";
	}
	@RequestMapping("/toGenzongdanList")
	public String toGenzongdanList(Model model )throws Exception{
		
		return "genzongdanlist";
	}
	@RequestMapping("/toSalary")
	public String toSalary(Model model )throws Exception{
		
		return "salary";
	}
	@RequestMapping("/toSalaryDetail")
	public String toSalaryDetail(Model model )throws Exception{
		
		return "salary_detail";
	}
	@RequestMapping("/toProductRecord")
	public String toShengchanjilu(Model model )throws Exception{
		
		return "productRecord";
	}
	@RequestMapping("/toProductTestList")
	public String toProductTestList(Model model )throws Exception{
		
		return "productTestList";
	}
}
package cn.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller 
@RequestMapping("/record")
public class RecordController {

	
	@RequestMapping("/toOrderList")
	public String toOrderList(Model model )throws Exception{
		
		return "order_list";
	}
	@RequestMapping("/toApplyList")
	public String toApplyList(Model model )throws Exception{
		
		return "applyList";
	}
	@RequestMapping("/toShopPlanList")
	public String toShopPlanList(Model model )throws Exception{
		
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
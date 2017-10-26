package cn.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.ssm.mapper.TaskMapper;
import cn.ssm.service.ShopPlanService;



@Controller 
@RequestMapping("/record")
public class RecordController {

	@Autowired
	private ShopPlanService shopPlanService;
	@Autowired
	private TaskMapper taskMapper;
	@RequestMapping("/toOrderList")
	public String toOrderList(Model model )throws Exception{
		
		return "order_list";
	}
	@RequestMapping("/toApplyList")
	public String toApplyList(Model model )throws Exception{
		
		return "applyList";
	}
	@RequestMapping("/toShopPlanList")
	public String toShopPlanList(Model model, String client, String chanpin, String chejian )throws Exception{
		shopPlanService.selectShopPlanByParam(client, chanpin, chejian);
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
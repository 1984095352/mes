package cn.ssm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller 
@RequestMapping("/plan")
public class PlanController {
	
	
	@RequestMapping("/toShopPlan")
	public String toShopPlan(Model model )throws Exception{
		String data="工序1,工序2,工序3";
		String wuliaohao="123456";
		model.addAttribute("data", data);
		model.addAttribute("wuliaohao", wuliaohao);
		return "shopplan";
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
	@RequestMapping("/ajax")
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
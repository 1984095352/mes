package cn.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.ssm.po.Cstdline;
import cn.ssm.po.PistdAssetnum;
import cn.ssm.po.PistdAssetnumDetail;
import cn.ssm.service.PistdAssetnumDetailService;
import cn.ssm.service.PistdAssetnumService;

/**   
* @Title: CstdController.java
* @Package cn.ssm.controller
* @Description: 工艺点检标准查询
* @author 魏亮旗   
* @date 2017-6-8 下午3:14:17
* @version V1.0   
*/
@Controller
@RequestMapping ("/cstd")
public class CstdController {
	@Autowired 
	private PistdAssetnumDetailService pistdAssetnumDetailService ;
	@Autowired 
	private PistdAssetnumService pistdAssetnumService;
	@RequestMapping ("/getAll")
	public String getAll(String dev ,Model model, HttpServletRequest request ) throws Exception{
		ArrayList<PistdAssetnum> items = new ArrayList<PistdAssetnum>();
		items=pistdAssetnumService.getAllCpistdAssetnum();
		model.addAttribute("items", items);
		ArrayList<PistdAssetnumDetail> itemdetails=new ArrayList<PistdAssetnumDetail>();
		if(dev==null||"all".equals(dev)){
			itemdetails=pistdAssetnumDetailService.selectCpistd();
		}else{
			itemdetails=pistdAssetnumDetailService.selectCpistdBydev(dev);
		}
		model.addAttribute("itemdetails", itemdetails);
		return "cstd";
		
	}
	
	@RequestMapping("/getCstdline")
	public String  getPistdline(String stdnum ,String description,Model model) throws Exception{
		List<Cstdline> cstdline=new ArrayList<Cstdline>();
		cstdline=pistdAssetnumDetailService.selectCstdline(stdnum);
		model.addAttribute("cstdlines", cstdline);
		model.addAttribute("description", description);
		return "cstdline";
		
	}
}

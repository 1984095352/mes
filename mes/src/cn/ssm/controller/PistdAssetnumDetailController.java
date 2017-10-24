package cn.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.ssm.po.Pistd2;
import cn.ssm.po.PistdAssetnum;
import cn.ssm.po.PistdAssetnumDetail;
import cn.ssm.po.Pistdasset2;
import cn.ssm.po.Pistdline3;
import cn.ssm.service.PistdAssetnumDetailService;
import cn.ssm.service.PistdAssetnumService;
import cn.ssm.util.Page;

/**   
* @Title: PistdAssetnumDetailController.java
* @Package cn.ssm.controller
* @Description: 专业点检标准查询
* @author 魏亮旗   
* @date 2017-6-8 下午3:13:35
* @version V1.0   
*/
@Controller 
@RequestMapping ("/pistdasset")
public class PistdAssetnumDetailController {

	@Autowired 
	private PistdAssetnumDetailService pistdAssetnumDetailService ;
	@Autowired 
	private PistdAssetnumService pistdAssetnumService;
	@RequestMapping ("/getAll")
	public String getAllPistdAssetnumDetail(String dev ,Model model, HttpServletRequest request ) throws Exception{
		
		int totalCount=0;
		if(dev==null){
			dev="all";
		}
		if(dev==null||"all".equals(dev)||dev.isEmpty()){
			
			totalCount=pistdAssetnumDetailService.selectCount();
		}else{
			
			totalCount=pistdAssetnumDetailService.selectCount2(dev);	
		}

		ArrayList<PistdAssetnum> items = new ArrayList<PistdAssetnum>();
		items=pistdAssetnumService.getAllPistdAssetnum();
		model.addAttribute("items", items);
		

		String pageNow = request.getParameter("pageNow"); 
		Page page = null;
		
		ArrayList<PistdAssetnumDetail> itemdetails6= new ArrayList<PistdAssetnumDetail>();
		ArrayList<Pistdasset2> detail16 = new ArrayList<Pistdasset2>();
		if (pageNow != null) {    
	        page = new Page(totalCount, Integer.parseInt(pageNow)); 
	        if(dev==null||"all".equals(dev)){
				
				detail16=pistdAssetnumDetailService.selectPistdassetByPage(page.getStartPos(), page.getPageSize());
			}else{
				
				detail16=pistdAssetnumDetailService.selectPistdasset2ByPage(page.getStartPos(), page.getPageSize(),dev);	
			}
			if(detail16!=null&&detail16.size()>0)
			{	
				for(int i=0;i<detail16.size();i++)
				{
					PistdAssetnumDetail list16 = new PistdAssetnumDetail();
					String assetnum= detail16.get(i).getAssetnum();
					String pistdnum= detail16.get(i).getPistdnum();
					String detail26=pistdAssetnumDetailService.selectdesByAss(assetnum);
					ArrayList<Pistd2> detail36=new ArrayList<Pistd2>();
					detail36=pistdAssetnumDetailService.selectpistd2(pistdnum);
					if(detail36!=null&&detail36.size()>0)
					{	
						for(int j=0;j<detail36.size();j++){
							list16.setASSETDESCRIPTION(detail26 );
							list16.setPIPROFESSION(detail36.get(j).getPiprofession());
							list16.setPISTDDESCRIPTION(detail36.get(j).getDescription());
							list16.setPISTDNUM(detail36.get(j).getPistdnum());
							itemdetails6.add(list16);
						}
					}
				}
				model.addAttribute("itemdetails", itemdetails6);
				model.addAttribute("page", page);
			}
		} else {    
	        page = new Page(totalCount, 1);  
	        if(dev==null||"all".equals(dev)){
				
				detail16=pistdAssetnumDetailService.selectPistdassetByPage(page.getStartPos(), page.getPageSize());
			}else{
				
				detail16=pistdAssetnumDetailService.selectPistdasset2ByPage(page.getStartPos(), page.getPageSize(),dev);	
			}
			if(detail16!=null&&detail16.size()>0)
			{	
				for(int i=0;i<detail16.size();i++)
				{
					PistdAssetnumDetail list16 = new PistdAssetnumDetail();
					String assetnum= detail16.get(i).getAssetnum();
					String pistdnum= detail16.get(i).getPistdnum();
					String detail26=pistdAssetnumDetailService.selectdesByAss(assetnum);
					ArrayList<Pistd2> detail36=new ArrayList<Pistd2>();
					detail36=pistdAssetnumDetailService.selectpistd2(pistdnum);
					if(detail36!=null&&detail36.size()>0)
					{	
						for(int j=0;j<detail36.size();j++){
							list16.setASSETDESCRIPTION(detail26 );
							list16.setPIPROFESSION(detail36.get(j).getPiprofession());
							list16.setPISTDDESCRIPTION(detail36.get(j).getDescription());
							list16.setPISTDNUM(detail36.get(j).getPistdnum());
							itemdetails6.add(list16);
						}
					}
				}
				model.addAttribute("itemdetails", itemdetails6);
				model.addAttribute("page", page);
			}
		}  
		
		model.addAttribute("dev", dev);
		return "pistd";
		
	}
	@RequestMapping("/getPistdline")
	public String  getPistdline(String stdnum ,String description,Model model) throws Exception{
		List<Pistdline3> pistdline=new ArrayList<Pistdline3>();
		pistdline=pistdAssetnumDetailService.selectByPistdnum(stdnum);
		model.addAttribute("pistdlines", pistdline);
		model.addAttribute("description", description);
		return "pistdline";
		
	}
	
}

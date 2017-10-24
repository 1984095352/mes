package cn.ssm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.ssm.po.Person;
import cn.ssm.service.PersonService;

@Controller
@RequestMapping("/person")
public class PersonController {
	@Autowired
	private PersonService personService;
	@RequestMapping("/s")
	public ModelAndView queryItems(HttpServletRequest request) throws Exception {
		
		System.out.println(request.getParameter("id"));
	
		//调用service查询商品列表
		Person person = personService.selectByPrimaryKey(2);

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("person", person);
		// 指定逻辑视图名
		modelAndView.setViewName("index");

		return modelAndView;
	}
	
	
}

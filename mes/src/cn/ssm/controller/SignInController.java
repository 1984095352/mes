package cn.ssm.controller;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import cn.ssm.po.Person;
import cn.ssm.service.SignInService;
import cn.ssm.util.MD5;


/**   
* @Title: SignInController.java
* @Package cn.ssm.controller
* @Description: 用户权限，登录，注册，退出等操作
* @author Wei   
* @date 2017-5-4 下午7:36:38
* @version V1.0   
*/
@Controller 
@RequestMapping("/user")
public class SignInController {
	
	
	@Autowired 
	private SignInService signInService ;
	@RequestMapping("/signin")
	public String signIn(String loginid, String password, HttpSession session,Model model)throws Exception{
		password=new MD5().getPassword(password);
		
		Map<String,String> map =new HashMap<String,String>();
		map.put("loginid",loginid);
		map.put("password",password);
		
		
		Person	person = signInService.signIn(map);
		if(person==null){
			model.addAttribute("error", "用户名或密码错误");
			return "index";
		}
		session.setAttribute("user", person);

		return "dashboard";
	}
	@RequestMapping("/login")
	public String toSignIn( )throws Exception{
		return "index";
	}
	@RequestMapping("/dashboard")
	public String dashboard( )throws Exception{
		return "dashboard";
	}
	@RequestMapping("/register")
	public String register(HttpServletRequest request,Model model)throws Exception{
		String loginid =request.getParameter("LOGINID");
		String password =request.getParameter("PASSWORD");
		String displayname =request.getParameter("DISPLAYNAME");
		String department =request.getParameter("DEPARTMENT");
		String profession =request.getParameter("PROFESSION");
		String email =request.getParameter("EMAIL");
		password=new MD5().getPassword(password);
		Map<String,String> map =new HashMap<String,String>();
		map.put("loginid", loginid);
		map.put("password", password);
		map.put("displayname", displayname);
		map.put("department", department);
		map.put("profession", profession);
		map.put("email", email);
		Person	person1=signInService.selectByLoginId(loginid);
		Person	person2=signInService.selectByEmail(email);
		if(person1!=null){
			
			return "register";
		}
		if(person2!=null){
			
			return "register";
		}
		
				signInService.insertPerson(map);
				String e3="注册成功,请重新登录！";
				model.addAttribute("e3", e3);
				return "index";
			
		}	
	@RequestMapping("/toreg")
	public String toreg( )throws Exception{
		return "register";
	}
	@RequestMapping("/relogin")
	public String relogin(String loginid, String password,HttpSession session,HttpServletRequest request,HttpServletResponse response,Model model)throws Exception{
		password=new MD5().getPassword(password);
		
		Map<String,String> map =new HashMap<String,String>();
		map.put("loginid",loginid);
		map.put("password",password);
		
		session.removeAttribute("relogin_errror");
		Person	person = signInService.signIn(map);
		if(person==null){
			model.addAttribute("error", "用户名或密码错误");
			return "Reloogin";
		}
		session.setAttribute("user", person);
		String param=null;
		String To_url= session.getAttribute("To_url").toString();
		if(session.getAttribute("param")!=null){
			 param= session.getAttribute("param").toString();
		}
		String url=To_url.substring(4);
		if(param!=null){
			return "redirect:"+url+"?"+param;
		}
		
			return "redirect:"+url;
		
	}
	@RequestMapping("/ajax")
	public void ajax(HttpServletRequest request,HttpServletResponse response)throws Exception{
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		String loginid =request.getParameter("loginid");
		String email =request.getParameter("email");
		Person	person1=signInService.selectByLoginId(loginid);
		Person	person2=signInService.selectByEmail(email);
		PrintWriter out=response.getWriter();
		if(person1!=null){
			out.print("<font style='color:red;font-size:18px';>工号已存在!</font>");
			
		}
		if(person2!=null){
			out.print("<font style='color:red;font-size:18px';>邮箱被占用!</font>");
			
		}
		
		out.flush();
		out.close();	
			
		
	}
	//用户退出
	@RequestMapping("/logout")
	public String logout(HttpSession session)throws Exception{
		
		//session失效
		session.invalidate();
		//重定向到商品查询页面
		return "index";
		
	}
}

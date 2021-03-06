package cn.ssm.controller.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;




public class LoginInterceptor implements HandlerInterceptor {

	//在执行handler之前来执行的
	//用于用户认证校验、用户权限校验
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		
		String  url = request.getRequestURI();
		String  param=request.getQueryString();
		//判断用户身份在session中是否存在
		HttpSession session = request.getSession();
		session.setAttribute("To_url", url);
		if(param!=null){
			session.setAttribute("param", param);
		}
/*		Person person =  (Person) session.getAttribute("user");
		//如果用户身份在session中存在放行
		if(person!=null){
			return true;
		}*/
		//执行到这里拦截，跳转到登陆页面，用户进行身份认证
		session.setAttribute("relogin_errror", "请先登录！");
		request.getRequestDispatcher("/WEB-INF/jsp/Reloogin.jsp").forward(request, response);

		//如果返回false表示拦截不继续执行handler，如果返回true表示放行
		return false;
		
	}
	//在执行handler返回modelAndView之前来执行
	//如果需要向页面提供一些公用 的数据或配置一些视图信息，使用此方法实现 从modelAndView入手
	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("HandlerInterceptor1...postHandle");
		
	}
	//执行handler之后执行此方法
	//作系统 统一异常处理，进行方法执行性能监控，在preHandle中设置一个时间点，在afterCompletion设置一个时间，两个时间点的差就是执行时长
	//实现 系统 统一日志记录
	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("HandlerInterceptor1...afterCompletion");
	}

}

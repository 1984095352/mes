<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()+ path + "/";
%>

	<c:forEach items="${data}" var="item">
       <div > 
               
           已完成数量：<span style="color:blue;font-size:16px;">${item }</span>&nbsp;&nbsp;  
           生产流程：<span style="color:blue;font-size:16px;">${item }</span>&nbsp;&nbsp; 
           正在生产车间：<span style="color:blue;font-size:16px;">${item }</span>&nbsp;&nbsp; 
     
     <br/><br/>
     </div>
     </c:forEach>
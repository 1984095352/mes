<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>



<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>



<script type='text/javascript'>alert('新增专业点检计划成功！');location.href='${pageContext.request.contextPath }/add/plan1.action';</script>
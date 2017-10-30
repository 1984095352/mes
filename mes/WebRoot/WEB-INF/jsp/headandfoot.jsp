<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()+ path + "/";
%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1 , user-scalable=no">
    <title></title>
    <link href="../css/bootstrap-multiselect.css" rel="stylesheet" type="text/css"/>
    <link rel="stylesheet" href="../css/bootstrap.min.new.css"/>
    <link href="../css/bootstrap-datetimepicker.min.css" rel="stylesheet" media="screen">
    <link rel="stylesheet" href="../css/main.css"/>
</head>
<body>
<!--导航-->

<nav class="navbar navbar-default">
    <div class="container">
        <!--小屏幕导航按钮和logo-->
        <div class="navbar-header">
            <button class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a href="index.html" class="navbar-brand">logo</a>
        </div>
        <!--小屏幕导航按钮和logo-->
        <!--导航-->
        <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
                <li ><a href="#"><span class="glyphicon glyphicon-home"></span>&nbsp;&nbsp;首页</a></li>              
                <li class="dropdown">
                    <a id="dLabel" type="button" data-toggle="dropdown" >
                        <span class="glyphicon glyphicon-pencil"></span>&nbsp;&nbsp;计划
                        <span class="caret"></span>
                    </a>
                    <ul class="dropdown-menu" >
                        <li><a href="${pageContext.request.contextPath}/plan/toOrder.action"><span class="glyphicon     glyphicon-cog"></span>&nbsp;&nbsp;客户交互计划</a></li>     
                        <li><a href="${pageContext.request.contextPath}/plan/toShopPlan.action"><span class="glyphicon     glyphicon-cog"></span>&nbsp;&nbsp;生产排产计划</a></li>
                        <li><a href="${pageContext.request.contextPath}/plan/toApply.action"><span class="glyphicon     glyphicon-cog"></span>&nbsp;&nbsp;申请领料</a></li>     
                        <li><a href="${pageContext.request.contextPath}/plan/toGenzongdan.action"><span class="glyphicon     glyphicon-cog"></span>&nbsp;&nbsp;跟踪单</a></li>
                        <li><a href="${pageContext.request.contextPath}/plan/toProductTest.action"><span class="glyphicon     glyphicon-cog"></span>&nbsp;&nbsp;产品检测</a></li>     
                    </ul>
       
                </li>
                <li class="dropdown">
                    <a id="dLabel" type="button" data-toggle="dropdown" >
                        <span class="glyphicon glyphicon-list-alt"></span>&nbsp;&nbsp;记录
                        <span class="caret"></span>
                    </a>
                    <ul class="dropdown-menu" >
                        <li><a href="${pageContext.request.contextPath}/record/toOrderList.action"><span class="glyphicon     glyphicon-cog"></span>&nbsp;&nbsp;客户交互记录</a></li>     
                        <li><a href="${pageContext.request.contextPath}/record/toShopPlanList.action"><span class="glyphicon     glyphicon-cog"></span>&nbsp;&nbsp;生产排产记录</a></li>
                        <li><a href="${pageContext.request.contextPath}/record/toApplyList.action"><span class="glyphicon     glyphicon-cog"></span>&nbsp;&nbsp;领料单记录</a></li>     
                        <li><a href="${pageContext.request.contextPath}/record/toGenzongdanList.action"><span class="glyphicon     glyphicon-cog"></span>&nbsp;&nbsp;跟踪单记录</a></li>
                        <li><a href="${pageContext.request.contextPath}/record/toSalary.action"><span class="glyphicon     glyphicon-cog"></span>&nbsp;&nbsp;工资单记录</a></li>
                        <li><a href="${pageContext.request.contextPath}/record/toProductRecord.action"><span class="glyphicon     glyphicon-cog"></span>&nbsp;&nbsp;生产记录</a></li>
                        <li><a href="${pageContext.request.contextPath}/record/toProductTestList.action"><span class="glyphicon     glyphicon-cog"></span>&nbsp;&nbsp;产品检测记录</a></li>     
                    </ul>
       
                </li>
                <li class="dropdown">
                    <a id="dLabel" type="button" data-toggle="dropdown" >
                        <span class="glyphicon glyphicon-user"></span>&nbsp;&nbsp;管理
                        <span class="caret"></span>
                    </a>
                    <ul class="dropdown-menu" >
                        <li><a href="${pageContext.request.contextPath}/manage/clientManage.action"><span class="glyphicon     glyphicon-cog"></span>&nbsp;&nbsp;客户产品管理</a></li>     
                        <li><a href="${pageContext.request.contextPath}/manage/assetManage.action"><span class="glyphicon     glyphicon-cog"></span>&nbsp;&nbsp;设备模具绑定</a></li>
                    </ul>
       
                </li>      
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li class="dropdown">
                    <a id="user" type="button" data-toggle="dropdown" >
                        admin
                        <span class="caret"></span>
                    </a>
                    <ul class="dropdown-menu" >
                        <li><a href="#"><span class="glyphicon     glyphicon-cog"></span>&nbsp;&nbsp;修改密码</a></li>     
                    </ul>
                </li>
                <li><a href="#"><span class="glyphicon glyphicon-off"></span>&nbsp;&nbsp;退出</a></li>
            </ul>
        </div>
        <!--导航-->

    </div>
</nav>
<!--导航-->


<!--footer-->
<footer class="navbar-fixed-bottom">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <p>
                    Copyright&nbsp;©&nbsp;2018&nbsp;&nbsp;安徽红桥金属制造有限公司&nbsp;&nbsp;电话：+86-563-2279508
                </p>
            </div>
        </div>
    </div>
</footer>
<!--footer-->
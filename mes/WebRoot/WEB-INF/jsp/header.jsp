<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%@ page import="java.text.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <meta name="description" content="dashboard">
    <meta name="author" content="xue">
    <link rel="icon" href="../img/ico/favicon.ico">

    <title>工业燃烧设备点检系统</title>

    <!-- Bootstrap core CSS -->
    <link href="../css/bootstrap-theme.min.css" rel="stylesheet"> 
    <link href="../css/bootstrap.min.css" rel="stylesheet">  
    <link href="../css/dashboard.css" rel="stylesheet">
    <link href="../css/sticky-footer.css" rel="stylesheet">

  </head>

  <body>

    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container-fluid">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapse" data-toggle="collapse" data-target="#navbar" >
            <!--<span class="sr-only">Toggle navigation</span>-->
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
            <a class="navbar-brand"  href="#" onclick="location.reload()"><img src="../img/title.png"/></a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav navbar-right">
            <li><p class="navbar-brand">金隆铜业欢迎您</p></li>
            <li><a href="#">联系我们</a></li>
            <li><a href="#">帮助</a></li>
            <li class="dropdown">
                <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                    
                    ${user.displayname }
                    <span class="caret"></span></a>
                <ul class="dropdown-menu" role="menu">
                    <li><a href="message.php"><span class="glyphicon glyphicon-user"></span> 我的信息</a></li>
                    <li><a href="calendar.php"><span class="glyphicon glyphicon-calendar"></span> 我的日历</a></li>
                    <li><a href="plandevshow.php"><span class="glyphicon glyphicon-tasks"></span> 我的任务</a></li>
                    <li class="divider"></li>
                    <li><a href="change_password_form.php"><span class="glyphicon glyphicon-cog"></span> 修改密码</a></li> 
                    <li><a href="${pageContext.request.contextPath }/user/logout.action"><span class="glyphicon glyphicon-log-out"></span> 登出系统</a></li>
                </ul>    
            </li>
          </ul>
        </div>
      </div>
    </nav>

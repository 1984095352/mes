<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<div class="container-fluid">
   <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
          <ul class="nav nav-pills nav-stacked nav-list">
              <li class="active">
                  <a href="${pageContext.request.contextPath }/user/dashboard.action" onclick="location.reload()">
                      <span class="glyphicon glyphicon-home"></span>
                      <span class="menu-text"><B> 网站首页</B></span>
                  </a>
              </li>
              
              <li>
                <a href="#" class="dropdown-toggle">
                    <span class="glyphicon glyphicon-asterisk"></span>
                    <span class="menu-text"><B> 点检标准</B></span>  
                    <b class="arrow icon-angle-down"></b>
                </a>
                <ul class="submenu">
                    <%-- <li><a href="${pageContext.request.contextPath }/pistd/findall.action">专业点检标准查询</a></li> --%>
                    <li><a href="${pageContext.request.contextPath }/pistdasset/getAll.action?dev=all">专业点检标准查询</a></li>
                    <li><a href="${pageContext.request.contextPath }/cstd/getAll.action">工艺点检标准查询</a>
                </ul>
            </li>
            
            <li>
                <a href="#" class="dropdown-toggle">
                    <span class="glyphicon glyphicon-calendar"></span>
                    <span class="menu-text"><B> 点检计划</B></span>  
                    <b class="arrow icon-angle-down"></b>
                </a>
                <ul class="submenu">
                    <li><a href="${pageContext.request.contextPath }/add/plan1.action">专业点检计划添加</a></li>
                    <li><a href="${pageContext.request.contextPath }/plan/getAll.action">专业点检计划列表</a></li>
                    <li><a href="${pageContext.request.contextPath }/cplan/getAll.action">工艺点检计划列表</a>
                </ul>
            </li>
            
            <li>
                <a href="#" class="dropdown-toggle">
                    <span class="glyphicon glyphicon-pencil"></span>
                    <span class="menu-text"><B> 点检记录</B></span>  
                    <b class="arrow icon-angle-down"></b>
                </a>
                <ul class="submenu">
                    <li><a href="#">专业点检记录</a></li>
                    <li><a href="${pageContext.request.contextPath }/crecord/getAll.action">工艺点检记录</a>
                    <li><a href="${pageContext.request.contextPath }/abnormal/getAll.action">点检异常记录</a>
                </ul>
            </li>
          </ul>
        </div>
      </div>
    </div>

<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<jsp:include page="header.jsp"></jsp:include>
<jsp:include page="sidebar.jsp"></jsp:include>
<jsp:include page="footer.jsp"></jsp:include>

<link href="../css/bootstrap-multiselect.css" rel="stylesheet" type="text/css" />
<link href="../css/line.css" rel="stylesheet" type="text/css" />
<link href="../css/bootstrap-datetimepicker.min.css" rel="stylesheet" media="screen">
<script type="text/javascript" src="../js/jquery.min.js" charset="UTF-8"></script>
<script type="text/javascript" src="../js/bootstrap-datetimepicker.js" charset="UTF-8"></script>
<script type="text/javascript" src="../js/locales/bootstrap-datetimepicker.zh-CN.js" charset="UTF-8"></script>
<script type="text/javascript" src="../js/bootstrap.min.js"></script>
<script src="../js/bootstrap-multiselect.js" type="text/javascript"></script>
<link href="../css/bootstrap-datetimepicker.min.css" rel="stylesheet" media="screen">
<link href="../css/bootstrap-multiselect.css" rel="stylesheet" type="text/css" />

<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
    <h1 class="page-header">   
        <label>专业点检记录行： &nbsp;</label>
        <span></span>
        
    </h1>
    <div class="table-responsive">
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>行号</th>
                    <th>点检项</th>
                    <th>点检内容</th>
                    <th>点检方法</th>                  
                    <th>判定基准</th>
                    <th>点检周期</th>
                    <th>点检结果</th>
                    <th>点检记录</th>
                    <th>修改记录</th>
                </tr>
            </thead>
            <tbody>
                
  <c:forEach items="${items}" var="item">                 
                <tr>
                    <td>${item.PIRECORDLINENUM}</td>
                    <td>${item.PARTLOC}</td>
                    <td>${item.CONTENT}</td>
                    <td>${item.METHOD}</td>
                    <td>${item.STANDARD}</td>
                    <td>${item.PERIOD}</td>
                    <td>${item.RESULT}</td>
                    <td>${item.RECORD}</td>
                    <td></td>
                </tr>
 </c:forEach>                    
            </tbody>
        </table>
    </div>      
</div>
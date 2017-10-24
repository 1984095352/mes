<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<jsp:include page="header.jsp"></jsp:include>
<jsp:include page="sidebar.jsp"></jsp:include>
<jsp:include page="footer.jsp"></jsp:include>

<link href="../css/bootstrap-multiselect.css" rel="stylesheet" type="text/css" />
<link href="../css/line.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../js/jquery.min.js" charset="UTF-8"></script>
<script type="text/javascript" src="../js/bootstrap.min.js"></script>
<script src="../js/bootstrap-multiselect.js" type="text/javascript"></script>




<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
    <h1 class="page-header">   
        <label>点检标准： &nbsp;</label> 
           ${description}
    </h1>
    <div class="table-responsive">
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>标准行号</th>
                    <th>点检项</th>
                    <th>点检内容</th>
                    <th>点检方法</th>                  
                    <th>判定基准</th>
                    <th>点检周期</th>
                    <th>禁用</th>
                </tr>
            </thead>
            <tbody>
             <c:forEach items="${pistdlines}" var="item">
                <tr>
                    <td>${item.pistdlinenum}</td>
                    <td>${item.partloc}</td>
                    <td>${item.content}</td>
                    <td>${item.method}</td>
                    <td>${item.standard}</td>
                    <td>${item.period}</td>
                    <td>
                     
                        <c:if test="${item.disabled==0}">未禁用</c:if>
                        <c:if test="${item.disabled!=0}">已禁用</c:if>
                    </td>
                </tr>
             </c:forEach> 
            </tbody>
        </table>
    </div>      
</div>




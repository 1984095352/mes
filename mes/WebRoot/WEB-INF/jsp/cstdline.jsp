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
        <label>工艺点检标准： &nbsp;</label> 
           ${description}
    </h1>
    <div class="table-responsive">
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>标准行号</th>
                    <th>点检项</th>
                    <th>点检内容</th>
                    <th>判定基准</th>
                    <th>点检次数</th>     
                </tr>
            </thead>
            <tbody>
                
            <c:forEach items="${cstdlines}" var="item">
                <tr>
                    <td>${item.clinenum}</td>
                    <td>${item.partloc}</td>
                    <td>${item.content}</td>
                    <td>${item.standard}</td>
                    <td>${item.cishu}</td>                  
                </tr>
            </c:forEach>  
            </tbody>
        </table>
    </div>      
</div>




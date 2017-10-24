<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
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
        <label>工艺点检记录行：</label>
        
    </h1>
    <div class="table-responsive">
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>行号</th>
                    <th>点检项</th>
                    <th>点检内容</th>                                    
                    <th>判定基准</th>                  
                    <th>结果1</th>
                    <th>点检时间1</th>
                    <th>记录1</th>
                    <th>结果2</th>
                    <th>点检时间2</th>
                    <th>记录2</th>
                    <th>结果3</th>
                    <th>点检时间3</th>
                    <th>记录3</th>
                    <th>结果4</th>
                    <th>点检时间4</th>
                    <th>记录4</th>
                    <th>修改记录</th>
                </tr>
            </thead>
            <tbody>
            <c:forEach items="${items}" var="item">
                <tr>
                    <td>${item.CLINENUM}</td>
                    <td>${item.PARTLOC}</td>
                    <td>${item.CONTENT}</td>                  
                    <td>${item.STANDARD}</td>
                    <td>${item.RESULT1}</td>
                    <td>${item.TIME1}</td>
                    <td>${item.RECORD1}</td>
                    <td>${item.RESULT2}</td>
                    <td>${item.TIME2}</td>
                    <td>${item.RECORD2}</td>
                    <td>${item.RESULT3}</td>
                    <td>${item.TIME3}</td>
                    <td>${item.RECORD3}</td>
                    <td>${item.RESULT4}</td>
                    <td>${item.TIME4}</td>
                    <td>${item.RECORD4}</td>

                    <td><a href="#">修改</a></td>
                </tr>
                </c:forEach>    
            </tbody>
        </table>
    </div>      
</div>

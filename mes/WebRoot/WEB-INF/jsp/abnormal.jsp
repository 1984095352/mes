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
    <h1 class="page-header" >
        <div class="divcss">
        <label>工艺点检异常项查询</label>
        <form name="form" action="${pageContext.request.contextPath }/abnormal/getAll.action" method="post" >           
            <label class="room10">起始时间</label>
            <div class="room11">
                <div class="input-group date form_date col-md-5"  data-date-format="yyyy-mm-dd"> 
                    <input class="form-control" size="16" type="text" name="startdate" id="startdate">
                    <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
                    <span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
                </div>
            </div>
            <label class="room12">截至时间</label>
            <div class="room13">
                <div class="input-group date form_date col-md-5"  data-date-format="yyyy-mm-dd">
                    <input class="form-control" size="16" type="text" name="enddate" id="enddate">
                    <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
                    <span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
                </div>
            </div>
            <div class="room14">
                <input type="submit" value="查询" class="btn btn-default btn-primary">
            </div>
        </form>
        </div>
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
                        <th>时间1</th>
                        <th>记录1</th>
                        <th>结果2</th>
                        <th>时间2</th>
                        <th>记录2</th>
                        <th>结果3</th>
                        <th>时间3</th>
                        <th>记录3</th>
                        <th>结果4</th>
                        <th>时间4</th>
                        <th>记录4</th>
                        
                    </tr>
                </thead>
                <tbody>
            <c:forEach items="${itemdetails}" var="itemdetail">
		        <tr>
		            <td>${itemdetail.UNIDCRECORD}</td>
		            <td>${itemdetail.PARTLOC}</td>
		            <td>${itemdetail.CONTENT}</td>                  
		            <td>${itemdetail.STANDARD}</td>
		            <td>${itemdetail.RESULT1}</td>
		            <td>${itemdetail.TIME1}</td>
		            <td>${itemdetail.RECORD1}</td>
		            <td>${itemdetail.RESULT2}</td>
		            <td>${itemdetail.TIME2}</td>
		            <td>${itemdetail.RECORD2}</td>
		            <td>${itemdetail.RESULT3}</td>
		            <td>${itemdetail.TIME3}</td>
		            <td>${itemdetail.RECORD3}</td>
		            <td>${itemdetail.RESULT4}</td>
		            <td>${itemdetail.TIME4}</td>
		            <td>${itemdetail.RECORD4}</td>
		                    
		        </tr>
 				</c:forEach> 
                </tbody>
            </table>
        </div>
</div>


<script type="text/javascript">
    $('.form_date').datetimepicker({
        language:  'zh-CN',
        weekStart: 0,
        todayBtn:  1,
	autoclose: 1,
	todayHighlight: 1,
	startView: 3,
	minView: 2,
	forceParse: 0 
    });
</script>
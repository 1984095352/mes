
<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()+ path + "/";
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
		<div class="divcss">
			<label>工艺点检记录查询</label>
			<form name="form" action="${pageContext.request.contextPath }/crecord/getAll.action"
				method="post" onsubmit="return checkinfomation()">
				<div class="room1">
					<div class="input-group date form_date col-md-5"
						data-date-format="yyyy-mm">
						<input class="form-control" size="16" type="text" name="dodate"
							id="dodate"> <span class="input-group-addon"><span
							class="glyphicon glyphicon-remove"></span>
						</span> <span class="input-group-addon"><span
							class="glyphicon glyphicon-calendar"></span>
						</span>
					</div>
				</div>
				<div class="room2">
					<select name="dev" id="dev" class="multiselect">
						<option value=0>--请选择查询设备--</option>
						<option value=*>显示全部设备</option>
						<c:forEach items="${items}" var="item">
							<option value="${item.devnum }">${item.DESCRIPTION }</option>
						</c:forEach>
					</select>
				</div>
				<div class="room3">
					<input type="submit" value="查询" class="btn btn-default btn-primary">
				</div>
			</form>
		</div>
	</h1>
	<div class="table-responsive">
		<table class="table table-striped">
			<thead>
				<tr>
					<th>序号</th>
					<th>计划编号</th>
					<th>点检专业</th>
					<th>点检设备</th>
					<th>勤数</th>
					<th>点检人</th>
					<th>点检日期</th>
					<th>点检结果</th>
					<!--<th>打印表格</th>-->
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${itemdetails}" var="itemdetail" varStatus="stauts">
					<tr>
						<td>${stauts.index+1}</td>
						<td>${itemdetail.CPLANNUM}</td>
						<td>工艺</td>
						<td>${itemdetail.assetname}</td>
						<td>${itemdetail.REGULAR}</td>
						<td>${itemdetail.DISPLAYNAME}</td>
						<c:set var="string1" value="${itemdetail.CPLANDATE0}"/>
						<c:set var="string2" value="${fn:substringBefore(string1, ' ')}" />
						<td> ${string2}</td>
						<td><a target="_blank"
							href="${pageContext.request.contextPath }/crecord/getCrecordline.action?CPLANNUM=${itemdetail.CPLANNUM}&ASSETNUM=${itemdetail.DENUM}&REGULAR=${itemdetail.REGULAR}">查看</a>
						</td>
						<!--td><?PHP echo "<a target=\"_blank\" href=\"gyprint.php?CPLANNUM=$CPLANNUM&&ASSETNUM=$DENUM&REGULAR=$REGULAR&DATE=$CPLANDATE0\">打印</a>";?></td-->
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</div>


<script type="text/javascript">
    function checkinfomation(){
        var dev = document.getElementById("dev").value;
        if(dev!=0 )
            {
                return true;
            }  
        else{
                alert("请选择设备！");
                return false;
            }        
        }
</script>
<script type="text/javascript">
    $('.form_date').datetimepicker({
        language:  'zh-CN',
        weekStart: 0,
        todayBtn:  1,
	autoclose: 1,
	todayHighlight: 1,
	startView: 3,
	minView: 3,
	forceParse: 0 
    });
</script>
<script type="text/javascript">
    $(document).ready(function() {
    $('.multiselect').multiselect({
      maxHeight: 200,
      enableFiltering: true,
      enableCaseInsensitiveFiltering: true,
      filterPlaceholder: '',
    });
  });
</script>

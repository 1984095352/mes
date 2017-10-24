<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<jsp:include page="header.jsp"></jsp:include> 
<jsp:include page="sidebar.jsp"></jsp:include> 
<jsp:include page="footer.jsp"></jsp:include> 

<link href="../css/bootstrap-multiselect.css" rel="stylesheet" type="text/css"/>
<link href="../css/line.css" rel="stylesheet" type="text/css"/>
<link href="../css/bootstrap-datetimepicker.min.css" rel="stylesheet" media="screen">
<script type="text/javascript" src="../js/jquery.min.js" charset="UTF-8"></script>
<script type="text/javascript" src="../js/bootstrap-datetimepicker.js" charset="UTF-8"></script>
<script type="text/javascript" src="../js/locales/bootstrap-datetimepicker.zh-CN.js" charset="UTF-8"></script>
<script type="text/javascript" src="../js/bootstrap.min.js"></script>
<script src="../js/bootstrap-multiselect.js" type="text/javascript"></script>
<link href="../css/bootstrap-datetimepicker.min.css" rel="stylesheet" media="screen">
<link href="../css/bootstrap-multiselect.css" rel="stylesheet" type="text/css"/>



<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
    <h1 class="page-header" >
        <div class="divcss">
        <label>专业点检计划查询</label>
        <form name="form" action="${pageContext.request.contextPath }/plan/getAll.action" method="post" onsubmit="return checkinfomation()">
            <div class="room4">
                <select name="people" id="people" class="multiselect">
                    <option value=0>--请选择点检人--</option>
                    <option value=*>显示全部点检人</option> 
				<c:forEach items="${Pplist}" var="item">			
            	<option value="${item.EXECUTEBY}">${item.DISPLAYNAME}</option>		
				</c:forEach>      
                </select>
            </div>
            <label class="room5">起始时间</label>
            <div class="room6">
                <div class="input-group date form_date col-md-5"  data-date-format="yyyy-mm-dd"> 
                    <input class="form-control" size="16" type="text" name="startdate" id="startdate">
                    <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
                    <span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
                </div>
            </div>
            <label class="room7">截至</label>
            <div class="room8">
                <div class="input-group date form_date col-md-5"  data-date-format="yyyy-mm-dd">
                    <input class="form-control" size="16" type="text" name="enddate" id="enddate">
                    <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
                    <span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
                </div>
            </div>
            <div class="room9">
                <input type="submit" value="查询" class="btn btn-default btn-primary">
            </div>
        </form>
        </div>
    </h1> 
        <div class="table-responsive">             
            <table class="table table-striped" >
                <thead>
                    <tr>
                        <th>计划编号</th>                  
                        <th>部门</th>
                        <th>专业</th>
                        <th>制定人</th>
                        <th>制定时间</th>
                        <th>执行人</th>
                        <th>点检时间</th>
                        <th>点检设备</th>
                        <th>使用点检标准</th>
                        <th>完成情况</th>
                    </tr>
                </thead>
                <tbody>
	<c:forEach items="${Prlist}" var="item1">
 		<tr>
            <td>${item1.PIPLANNUM}</td>            
            <td>${item1.DEPARTMENT}</td>
            <td>${item1.PIPROFESSION}</td>
            <td>${item1.DRAWUPBY}</td>
            <td>${item1.DRAWUPDATE}</td>
            <td>${item1.DISPLAYNAME}</td>
            <td>${item1.PIPLANDATE}</td>
            <td>${item1.ASSETDESCRIPTION}</td>
            <td><a  target="_blank" href="${pageContext.request.contextPath }/pistdasset/getPistdline.action?stdnum=${item1.PISTDNUM}&description=${item1.PISTDDESCRIPTION}">${item1.PISTDDESCRIPTION}</a></td>
            <td>${item1.RESULT}</td>
        </tr>	
 	</c:forEach>                
  
	

                </tbody>
            </table>
        </div>
</div>

<!-- <script type="text/javascript">
    function checkinfomation(){
        var peo = document.getElementById("people").value;
        if(peo!=0 )
            {
                return true;
            }  
        else{
                alert("请选择点检人！");
                return false;
            }        
        }
</script> -->

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
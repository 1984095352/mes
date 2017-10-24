<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<jsp:include page="header.jsp"></jsp:include>
<jsp:include page="sidebar.jsp"></jsp:include>



<link href="../css/bootstrap-datetimepicker.min.css" rel="stylesheet" media="screen">
<link href="../css/bootstrap-multiselect.css" rel="stylesheet" type="text/css"/>
<link href="../css/planline.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../js/jquery.min.js" charset="UTF-8"></script>
<script type="text/javascript" src="../js/bootstrap-datetimepicker.js" charset="UTF-8"></script>
<script type="text/javascript" src="../js/locales/bootstrap-datetimepicker.zh-CN.js" charset="UTF-8"></script>
<script type="text/javascript" src="../js/bootstrap.min.js"></script>
<script src="../js/holder.min.js" type="text/javascript"></script>

<jsp:include page="footer.jsp"></jsp:include>

<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
    <div class="steps steps-4">
	    <ol>
		<li ><i>1</i>点检基本信息</li>
		<li class="active"><i>2</i>点检人员选择</li>
		<li ><i>3</i>点检设备选择</li>		
                <li ><i>&radic;</i>计划安排完成</li>
	    </ol>		
    </div>

    
  
    <div class="divcss">
        <form name="form2" action="${pageContext.request.contextPath }/add/plan3.action" method="post" onsubmit="return checkinfomation()">
            <label class="room11">请选择计划点检人员</label>
            <div class="room12">
                <select name="people" id="people" class="multiselect">
                    <option value=0>--请选择--</option>
						<c:forEach  items="${Plist}" var="item">
                    	<option value="${item.loginid}">${item.displayname}</option>   	
           
						</c:forEach>
                </select>
            </div>
            <div class="room13">
                <input type="button" value="上一步" class="btn btn-default btn-primary" onclick="window.location.href='${pageContext.request.contextPath }/add/plan1.action?dodate=${dodate }&pro=${pro }'">
            </div>
            <div class="room14">
                <input type="submit" value="下一步" class="btn btn-default btn-primary">
            </div>
        </form>
    </div>
</div> 

<script type="text/javascript">
    function checkinfomation(){
        var people = document.getElementById("people").value;
        if(people!=0 )
            {
                return true;
            }  
        else{
                alert("请选择计划点检人员！");
                return false;
            }        
        }
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
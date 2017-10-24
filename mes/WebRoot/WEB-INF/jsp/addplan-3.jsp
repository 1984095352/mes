<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>


<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>




<link href="../css/bootstrap-datetimepicker.min.css" rel="stylesheet" media="screen">
<link href="../css/bootstrap-multiselect.css" rel="stylesheet" type="text/css"/>
<link href="../css/planline.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../js/jquery.min.js" charset="UTF-8"></script>
<script type="text/javascript" src="../js/bootstrap-datetimepicker.js" charset="UTF-8"></script>
<script type="text/javascript" src="../js/locales/bootstrap-datetimepicker.zh-CN.js" charset="UTF-8"></script>
<script type="text/javascript" src="../js/bootstrap.min.js"></script>
<script src="../js/holder.min.js" type="text/javascript"></script>

<jsp:include page="header.jsp"></jsp:include>
<jsp:include page="sidebar.jsp"></jsp:include>
<jsp:include page="footer.jsp"></jsp:include>

<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
    <div class="steps steps-4">
	    <ol>
		<li ><i>1</i>点检基本信息</li>
		<li ><i>2</i>点检人员选择</li>
		<li class="active"><i>3</i>点检设备选择</li>		
                <li ><i>&radic;</i>计划安排完成</li>
	    </ol>		
    </div>
    <div class="divcss">
        <form name="form3" action="${pageContext.request.contextPath }/add/plan4.action" method="post" onsubmit="return checkinfomation()">
            <label class="room11">请选择计划点检设备</label>
            <div class="room12">
                <select name="dev[]" id="dev" class="multiselect" multiple="multiple">                    
                        <c:forEach items="${list}" var="item" >
                        		<option  value="${item.devnum}">${item.DESCRIPTION}</option>
                        </c:forEach>
                                             
                </select>
            </div>
            <div class="room13">
                <input type="button" value="上一步" class="btn btn-default btn-primary" onclick="window.location.href='${pageContext.request.contextPath }/add/plan2.action?people=${people}&dodate=${dodate }&pro=${pro }'">
            </div>
            <div class="room14">
                <input type="submit" value="完成" class="btn btn-default btn-primary">
            </div>
        </form>
    </div>
</div> 

<script type="text/javascript">
    function checkinfomation(){
        var dev = document.getElementById("dev").value;
        if(dev.length!=0 )
            {
                return true;
            }  
        else{
                alert("请选择点检设备！");
                return false;
            }        
        }
</script>
<script type="text/javascript">
  $(document).ready(function() {
  $('.multiselect').multiselect({
    maxHeight: 300,
    enableFiltering: true,
    enableCaseInsensitiveFiltering: true,
    filterPlaceholder: '',
    nonSelectedText: '请选择点检设备',
    nSelectedText: '个设备已选择',
    numberDisplayed: 2
    });
  });
</script>

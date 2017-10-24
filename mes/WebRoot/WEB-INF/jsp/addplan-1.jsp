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



<link href="../css/bootstrap-datetimepicker.min.css" rel="stylesheet" media="screen">
<link href="../css/bootstrap-multiselect.css" rel="stylesheet" type="text/css"/>
<link href="../css/planline.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../js/jquery.min.js" charset="UTF-8"></script>
<script type="text/javascript" src="../js/bootstrap-datetimepicker.js" charset="UTF-8"></script>
<script type="text/javascript" src="../js/locales/bootstrap-datetimepicker.zh-CN.js" charset="UTF-8"></script>
<script type="text/javascript" src="../js/bootstrap.min.js"></script>
<script src="../js/holder.min.js" type="text/javascript"></script>


<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
    <div class="steps steps-4">
	    <ol>
		<li class="active"><i>1</i>点检基本信息</li>
		<li ><i>2</i>点检人员选择</li>
		<li ><i>3</i>点检设备选择</li>		
                <li ><i>&radic;</i>计划安排完成</li>
	    </ol>		
    </div>


    <div class="divcss">       
        <form name="form1" action="${pageContext.request.contextPath }/add/plan2.action" method="post" onsubmit="return checkinfomation()">
	    <div class="form-group">
                <label class="room1">请选择计划日期</label>
                    <div class="room2">
                        <div class="input-group date form_date col-md-5"  data-date-format="yyyy-mm-dd">
                            <input class="form-control" size="16" type="text" name="dodate" id="dodate" value=${dodate }>
                            <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
		            		<span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
                        </div>
                    </div>
        </div>
            <label class="room3">请选择计划专业</label>
            <div class="room4">
                <select name="pro" id="pro" class="multiselect">
                    <option value=0>--请选择--</option> 
                  <c:if test="${pro==null}">             
                  <option  value=电气>电气</option>
                  <option  value=机械>机械</option>
                   </c:if>
                 <c:if test="${pro=='机械'}"> 
                 <option selected="selected">${pro}</option>
                 <option  value=电气>电气</option> 
                 </c:if>
                  <c:if test="${pro=='电气'}"> 
                 <option selected="selected">${pro}</option>
                 <option  value=机械>机械</option>
                 </c:if>
                </select>
            </div>
            <div class="room15">
                <input type="button" value="清空选项" class="btn btn-default btn-primary" onclick="location.reload()">
            </div>
            <div class="room16">
                <input type="submit" value="下一步" class="btn btn-default btn-primary">
            </div>
        </form>
    </div> 
</div>

<script type="text/javascript">
    function checkinfomation(){
        var dodate = document.getElementById("dodate").value;
        var depart = document.getElementById("pro").value;
        if(dodate!=0 && pro!=0)
            {
                return true;
            }  
        else{
                alert("信息填写不完整！");
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
	minView: 2,
	forceParse: 0 
    });
</script>
<script type="text/javascript">
    $(document).ready(function() {
    $('.multiselect').multiselect({
        maxHeight: 200,
        enableFiltering: false,
        enableCaseInsensitiveFiltering: false,
        filterPlaceholder: '',
    });
  });
</script>
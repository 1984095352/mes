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

<link href="../css/bootstrap-multiselect.css" rel="stylesheet" type="text/css" />
<link href="../css/line.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../js/jquery.min.js" charset="UTF-8"></script>
<script type="text/javascript" src="../js/bootstrap.min.js"></script>
<script src="../js/bootstrap-multiselect.js" type="text/javascript"></script>

<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
    <h1 class="page-header">   
  	<form name="form" action="${pageContext.request.contextPath }/cstd/getAll.action" method="post" onsubmit="return checkinfomation()" class="lineright" >
			<div style="float:left;">
				<label>工艺设备标准查询</label>
			</div>
			<select name="dev" id="dev" class="multiselect">
				<option value=0>--请选择--</option>
				<option value="all">显示全部设备</option>
				<c:forEach  items="${items}" var="item">
				<option value="${item.ASSETNUM }">${item.DESCRIPTION }</option>
				</c:forEach>

			</select> <input type="submit" value="查询" class="btn btn-default btn-primary">
		</form>
    </h1>              
    <div class="table-responsive">
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>序号</th>
                    <th>设备名称</th>
                    <th>点检专业</th>
                    <th>标准编码</th>
                    <th>绑定标准名称</th>
                    <th>查看标准行</th>
                </tr>
            </thead>            
            <tbody>                
               <c:forEach  items="${itemdetails}" var="itemdetail" varStatus="stauts" >
                <tr>
					<td> ${stauts.index+1} </td>
					<td>${itemdetail.ASSETDESCRIPTION }</td>
					<td>${itemdetail.PIPROFESSION }</td>
					<td>${itemdetail.PISTDNUM }</td>
					<td>${itemdetail.PISTDDESCRIPTION }</td>
					<td><input value="查看细节" class="btn btn-xs btn-primary" onclick="window.open('${pageContext.request.contextPath }/cstd/getCstdline.action?stdnum=${itemdetail.PISTDNUM}&description=${itemdetail.PISTDDESCRIPTION }')"></td>
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
    $(document).ready(function() {
    $('.multiselect').multiselect({
      maxHeight: 200,
      enableFiltering: true,
      enableCaseInsensitiveFiltering: true,
      filterPlaceholder: '',
    });
  });
</script>


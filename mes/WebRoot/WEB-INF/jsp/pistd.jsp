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
		<form name="form" action="${pageContext.request.contextPath }/pistdasset/getAll.action" method="post" onsubmit="return checkinfomation()" class="lineright" >
			<div style="float:left;">
				<label>专业设备标准查询</label>
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
					<td><input value="查看细节" class="btn btn-xs btn-primary" onclick="window.open('${pageContext.request.contextPath }/pistdasset/getPistdline.action?stdnum=${itemdetail.PISTDNUM}&description=${itemdetail.PISTDDESCRIPTION }')"></td>
				</tr>
				</c:forEach>
			</tbody>
		
		</table>
		<!-- 分页功能 start -->    
    <div align="center" >    
        <font size="2">共 ${page.totalPageCount} 页</font> <font size="2">第    
            ${page.pageNow} 页</font> <a href="${pageContext.request.contextPath }/pistdasset/getAll.action?pageNow=1&dev=${dev}">首页</a>    
        <c:choose>    
            <c:when test="${page.pageNow - 1 > 0}">    
                <a href="${pageContext.request.contextPath }/pistdasset/getAll.action?pageNow=${page.pageNow - 1}&dev=${dev}">上一页</a>    
            </c:when>    
            <c:when test="${page.pageNow - 1 <= 0}">    
                <a href="${pageContext.request.contextPath }/pistdasset/getAll.action?pageNow=1&dev=${dev}">上一页</a>    
            </c:when>    
        </c:choose>    
        <c:choose>    
            <c:when test="${page.totalPageCount==0}">    
                <a href="${pageContext.request.contextPath }/pistdasset/getAll.action?pageNow=${page.pageNow}&dev=${dev}">下一页</a>    
            </c:when>    
            <c:when test="${page.pageNow + 1 < page.totalPageCount}">    
                <a href="${pageContext.request.contextPath }/pistdasset/getAll.action?pageNow=${page.pageNow + 1}&dev=${dev}">下一页</a>    
            </c:when>    
            <c:when test="${page.pageNow + 1 >= page.totalPageCount}">    
                <a href="${pageContext.request.contextPath }/pistdasset/getAll.action?pageNow=${page.totalPageCount}&dev=${dev}">下一页</a>    
            </c:when>    
        </c:choose>    
        <c:choose>    
            <c:when test="${page.totalPageCount==0}">    
                <a href="${pageContext.request.contextPath }/pistdasset/getAll.action?pageNow=${page.pageNow}&dev=${dev}">尾页</a>    
            </c:when>    
            <c:otherwise>    
                <a href="${pageContext.request.contextPath }/pistdasset/getAll.action?pageNow=${page.totalPageCount}&dev=${dev}">尾页</a>    
            </c:otherwise>    
        </c:choose>  
        跳到<select name='topage' size='1' onchange="window.location=' ${pageContext.request.contextPath }/pistdasset/getAll.action?pageNow='+this.value+'&dev=${dev} '">
       <c:forEach var="i" begin="1" end="${page.totalPageCount}">
       <c:if test="${i==page.pageNow}"><option value='${i}' selected>${i}</option></c:if>
       <c:if test="${i!=page.pageNow}"><option value='${i}'>${i}</option></c:if>
       </c:forEach></select> 页
    </div>    
    <!-- 分页功能 End -->
	</div>

</div>

<script type="text/javascript">
	function checkinfomation() {
		var dev = document.getElementById("dev").value;
		if (dev != 0) {
			return true;
		} else {
			alert("请选择设备！");
			return false;
		}
	}
</script>

<script type="text/javascript">
	$(document).ready(function() {
		$('.multiselect').multiselect({
			maxHeight : 200,
			enableFiltering : true,
			enableCaseInsensitiveFiltering : true,
			filterPlaceholder : '',
		});
	});
</script>



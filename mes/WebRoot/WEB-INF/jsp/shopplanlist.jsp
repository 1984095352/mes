<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()+ path + "/";
%>
<jsp:include page="headandfoot.jsp"></jsp:include>
<div class="container">
    <h4 class="myClass navbar-left" >排产计划查询</h4>
		<form class="form-inline top" method="post" action="${pageContext.request.contextPath}/record/toShopPlanList.action">
		  <div class="form-group">
		  	<label for="exampleInputName2">客户</label>
		    <input type="text" class="form-control" name="client" >
		  </div>
		  <div class="form-group">
		  	<label for="exampleInputName2">产品</label>
		    <input type="text" class="form-control" name="chanpin" >
		  </div>
          <div class="form-group">
		  	<label for="exampleInputName2">车间</label>
		    <input type="text" class="form-control"  name="chejian">
		  </div>&nbsp;&nbsp;&nbsp;&nbsp;
		  <button type="submit" class="btn btn-primary ">查询</button>
		</form>
		<br />
    <div class="table-responsive">
	  <table class="table">
			<thead>
				<tr>
					<th>计划单号</th>
					<th>客户</th>
					<th>产品名称</th>
					<th>物料号</th>
					<th>车间名称</th>
					<th>制定计划日期</th>
					<th>计划数量</th>
					<th>修改计划</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${listShopPlan}" var="item">
				<tr  >
					<td>${item.planNo }</td>
					<td>${item.client }</td>
					<td>${item.materialName }</td>
					<td>${item.materialNo }</td>
					<td>${item.shopName }</td>
					<td>${item.planDate }</td>
					<td>${item.planNum }</td>
					<td><input type="hidden" name="id" value="${item.planId }"/><input class="btn  btn-xs btn-primary" type="button" value="修改" onclick="revise(this)"></td>
				</tr>
				</c:forEach>
				
				
			</tbody>
	</table>
	</div>  
</div>



<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
       <script src="../js/jquery-3.2.1.min.js"></script>  
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <script src="../js/bootstrap.min.js"></script>
        <script src="../js/bootstrap-datetimepicker.js"></script>
        <script src="../js/bootstrap-datetimepicker.zh-CN.js"></script>
<script type="text/javascript" >//$(document).ready(function(){
	
	function revise(obj){
	    
	    
		var id=$(obj).prev().val();
		location.href="${pageContext.request.contextPath}/plan/toShopPlan.action?planId="+id;
	}
	
</script>
    
</body>
</html>
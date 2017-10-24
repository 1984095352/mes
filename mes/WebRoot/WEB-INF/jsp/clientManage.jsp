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
    <h4 class="myClass navbar-left">客户查询</h4>
		<form class="form-inline top">
		  <div class="form-group">
		  	<label for="exampleInputName2">客户</label>
		    <input type="text" class="form-control" id="exampleInputName2" >
		  </div>
		  <div class="form-group">
		  	<label for="exampleInputName2">产品</label>
		    <input type="text" class="form-control" id="exampleInputName2" >
		  </div> &nbsp;&nbsp;&nbsp;&nbsp;     
		  <button type="submit" class="btn btn-primary ">查询</button>
		</form>
		<br />
    <div class="table-responsive  center">
	  <table class="table">
			<thead>
				<tr>
					<th>客户</th>
					<th>产品名称</th>
					<th>物料号</th>
				</tr>
			</thead>
			<tbody>
				<tr  >
					<td>客户</td>
					<td>产品名称</td>
					<td>物料号</td>
				</tr>
				<tr  >
					<td>客户</td>
					<td>产品名称</td>
					<td>物料号</td>
				</tr>
				<tr  >
					<td>客户</td>
					<td>产品名称</td>
					<td>物料号</td>
				</tr>
				<tr  >
					<td>客户</td>
					<td>产品名称</td>
					<td>物料号</td>
				</tr>
				<tr  >
					<td>客户</td>
					<td>产品名称</td>
					<td>物料号</td>
				</tr>
				<tr  >
					<td>客户</td>
					<td>产品名称</td>
					<td>物料号</td>
				</tr>
				<tr  >
					<td>客户</td>
					<td>产品名称</td>
					<td>物料号</td>
				</tr>
				<tr  >
					<td>客户</td>
					<td>产品名称</td>
					<td>物料号</td>
				</tr>
				<tr  >
					<td>客户</td>
					<td>产品名称</td>
					<td>物料号</td>
				</tr>
				<tr  >
					<td>客户</td>
					<td>产品名称</td>
					<td>物料号</td>
				</tr>
				
			</tbody>
		</table>
	</div> 
	<h4 class="myClass navbar-left">客户管理</h4><br /><br /><br /><br />
		<form class="form-inline">
		  <div class="form-group">
		  	<label for="exampleInputName2">客户</label>
		    <input type="text" class="form-control" id="exampleInputName2" >
		  </div>
		  <div class="form-group">
		  	<label for="exampleInputName2">产品</label>
		    <input type="text" class="form-control" id="exampleInputName2" >
		  </div>
		  <div class="form-group">
		  	<label for="exampleInputName2">物料号</label>
		    <input type="text" class="form-control" id="exampleInputName2" >
		  </div> &nbsp;&nbsp;&nbsp;&nbsp;     
		  <button type="submit" class="btn btn-primary ">添加</button>
		</form>
</div>



<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
       <script src="../js/jquery-3.2.1.min.js"></script>  
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <script src="../js/bootstrap.min.js"></script>
        <script src="../js/bootstrap-datetimepicker.js"></script>
        <script src="../js/bootstrap-datetimepicker.zh-CN.js"></script>
<script type="text/javascript" >//$(document).ready(function(){
	
	function revise(obj){
	    
	    
		var id=$(obj).prev().prev().val();
		//location.href="order.html?id="+id;
	}
	
</script>
    
</body>
</html>
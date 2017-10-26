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
    <h4 class="myClass navbar-left">设备模具查询</h4>
		<form class="form-inline top">
		  <div class="form-group">
		  	<label for="exampleInputName2">设备</label>
		    <input type="text" class="form-control" id="exampleInputName2" >
		  </div>
		  <div class="form-group">
		  	<label for="exampleInputName2">模具</label>
		    <input type="text" class="form-control" id="exampleInputName2" >
		  </div>  &nbsp;&nbsp;&nbsp;&nbsp;     
		  <button type="submit" class="btn btn-primary ">查询</button>
		</form>
		<br />
    <div class="table-responsive  center">
	  <table class="table">
			<thead>
				<tr>
					<th>设备</th>
					<th>模具</th>			
				</tr>
			</thead>
			<tbody>
				<tr  >
					<td>设备</td>
					<td>模具</td>					
				</tr>
				<tr  >
					<td>设备</td>
					<td>模具</td>					
				</tr>
				<tr  >
					<td>设备</td>
					<td>模具</td>					
				</tr>
				<tr  >
					<td>设备</td>
					<td>模具</td>					
				</tr>
				<tr  >
					<td>设备</td>
					<td>模具</td>					
				</tr>
				<tr  >
					<td>设备</td>
					<td>模具</td>					
				</tr>
				
			</tbody>
		</table>
	</div> 
	<h4 class="myClass navbar-left">设备模具管理</h4> <br /><br /><br /><br />
		<form class="form-inline top">
		  <div class="form-group">
		  	<label for="exampleInputName2">设备</label>
		    <input type="text" class="form-control" id="exampleInputName2" >
		  </div>
		  <div class="form-group">
		  	<label for="exampleInputName2">模具</label>
		    <input type="text" class="form-control" id="exampleInputName2" >
		  </div>
		   &nbsp;&nbsp;&nbsp;&nbsp;     
		  <button type="submit" class="btn btn-primary ">绑定</button>
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
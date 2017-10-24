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
    <h4 class="myClass navbar-left">工资查询</h4>
		<form class="form-inline top">
		  <div class="form-group">
		  	<label for="exampleInputName2">车间</label>
		    <input type="text" class="form-control" id="exampleInputName2" />
		  </div>
		  <div class="form-group">
		  	<label for="exampleInputName2">操作工</label>
		    <input type="text" class="form-control" id="exampleInputName2" >
		  </div>
          <div class="form-group">
		  	<label for="exampleInputName2">月份</label>
		    <input type="text" class="form-control" id="exampleInputName2" >
		  </div>
		  <button type="submit" class="btn btn-primary pull-right">查询</button>
		</form>
		<br />
    <div class="table-responsive">
	  <table class="table">
			<thead>
				<tr>
					<th>生产日期</th>					
					<th>产品名称</th>
					<th>工序</th>
					<th>操作工</th>
					<th>合格数量</th>
					<th>工价</th>
					<th>工资</th>
				</tr>
			</thead>
			<tbody>
				<tr  >
					<td>生产日期</td>
					<td>产品名称</td>
					<td>工序</td>
					<td>操作工</td>
					<td>合格数量</td>
					<td>工价</td>
					<td>工资</td>
				</tr>
				<tr  >
					<td>生产日期</td>
					<td>产品名称</td>
					<td>工序</td>
					<td>操作工</td>
					<td>合格数量</td>
					<td>工价</td>
					<td>工资</td>
				</tr>
				<tr  >
					<td>生产日期</td>
					<td>产品名称</td>
					<td>工序</td>
					<td>操作工</td>
					<td>合格数量</td>
					<td>工价</td>
					<td>工资</td>
				</tr>
				<tr  >
					<td>生产日期</td>
					<td>产品名称</td>
					<td>工序</td>
					<td>操作工</td>
					<td>合格数量</td>
					<td>工价</td>
					<td>工资</td>
				</tr>
				<tr  >
					<td>生产日期</td>
					<td>产品名称</td>
					<td>工序</td>
					<td>操作工</td>
					<td>合格数量</td>
					<td>工价</td>
					<td>工资</td>
				</tr>
				<tr  >
					<td>生产日期</td>
					<td>产品名称</td>
					<td>工序</td>
					<td>操作工</td>
					<td>合格数量</td>
					<td>工价</td>
					<td>工资</td>
				</tr>
				<tr  >
					<td>生产日期</td>
					<td>产品名称</td>
					<td>工序</td>
					<td>操作工</td>
					<td>合格数量</td>
					<td>工价</td>
					<td>工资</td>
				</tr>
				<tr  >
					<td>生产日期</td>
					<td>产品名称</td>
					<td>工序</td>
					<td>操作工</td>
					<td>合格数量</td>
					<td>工价</td>
					<td>工资</td>
				</tr>
				<tr  >
					<td>生产日期</td>
					<td>产品名称</td>
					<td>工序</td>
					<td>操作工</td>
					<td>合格数量</td>
					<td>工价</td>
					<td>工资</td>
				</tr>
				<tr  >
					<td>生产日期</td>
					<td>产品名称</td>
					<td>工序</td>
					<td>操作工</td>
					<td>合格数量</td>
					<td>工价</td>
					<td>工资</td>
				</tr>
				<tr  >
					<td>生产日期</td>
					<td>产品名称</td>
					<td>工序</td>
					<td>操作工</td>
					<td>合格数量</td>
					<td>工价</td>
					<td>工资</td>
				</tr>
				<tr  >
					<td>生产日期</td>
					<td>产品名称</td>
					<td>工序</td>
					<td>操作工</td>
					<td>合格数量</td>
					<td>工价</td>
					<td>工资</td>
				</tr>
				<tr  >
					<td>生产日期</td>
					<td>产品名称</td>
					<td>工序</td>
					<td>操作工</td>
					<td>合格数量</td>
					<td>工价</td>
					<td>工资</td>
				</tr>
				<tr  >
					<td>生产日期</td>
					<td>产品名称</td>
					<td>工序</td>
					<td>操作工</td>
					<td>合格数量</td>
					<td>工价</td>
					<td>工资</td>
				</tr>
				<tr  >
					<td>生产日期</td>
					<td>产品名称</td>
					<td>工序</td>
					<td>操作工</td>
					<td>合格数量</td>
					<td>工价</td>
					<td>工资</td>
				</tr>
				
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
	    
	    
		var id=$(obj).prev().prev().val();
		//location.href="order.html?id="+id;
	}
	
</script>
    
</body>
</html>
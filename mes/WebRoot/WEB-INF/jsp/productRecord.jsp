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
    <h4 class="myClass navbar-left">生产记录查询</h4>
		<form class="form-inline top">
		  <div class="form-group">
		  	<label for="exampleInputName2">员工</label>
		    <input type="text" class="form-control" id="exampleInputName2" placeholder="Jane Doe">
		  </div>
		  <div class="form-group">
		  	<label for="exampleInputName2">设备</label>
		    <input type="text" class="form-control" id="exampleInputName2" placeholder="Jane Doe">
		  </div>
          <div class="form-group">
		  	<label for="exampleInputName2">磨具</label>
		    <input type="text" class="form-control" id="exampleInputName2" placeholder="Jane Doe">
		  </div>
		  <label for="exampleInputName2">日期</label>
		  <div class="input-group date form_date"  data-date-format="yyyy-mm-dd">
              <input class="form-control" size="10" type="text" name="jiaofu_date1"> 
              <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
              <span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
          </div> 
		  <button type="submit" class="btn btn-primary pull-right">查询</button>
		</form>
		<br />
    <div class="table-responsive">
	  <table class="table">
			<thead>
				<tr>
					<th>生产日期</th>
					<th>计划单号</th>					
					<th>产品名称</th>
					<th>车间</th>
					<th>工序</th>
					<th>操作工</th>
					<th>合格数量</th>
					<th>次品数量</th>
					<th>设备名称</th>
					<th>设备状态</th>
					<th>磨具名称</th>
					<th>磨具状态</th>
				</tr>
			</thead>
			<tbody>
				<tr  >
					<td>生产日期</td>
					<td>计划单号</td>
					<td>产品名称</td>
					<td>车间</td>
					<td>工序</td>
					<td>操作工</td>
					<td>合格数量</td>
					<td>次品数量</td>
					<td>设备名称</td>
					<td>设备状态</td>
					<td>磨具名称</td>
					<td>磨具状态</td>
				</tr>
				<tr  >
					<td>生产日期</td>
					<td>计划单号</td>
					<td>产品名称</td>
					<td>车间</td>
					<td>工序</td>
					<td>操作工</td>
					<td>合格数量</td>
					<td>次品数量</td>
					<td>设备名称</td>
					<td>设备状态</td>
					<td>磨具名称</td>
					<td>磨具状态</td>
				</tr>
				<tr  >
					<td>生产日期</td>
					<td>计划单号</td>
					<td>产品名称</td>
					<td>车间</td>
					<td>工序</td>
					<td>操作工</td>
					<td>合格数量</td>
					<td>次品数量</td>
					<td>设备名称</td>
					<td>设备状态</td>
					<td>磨具名称</td>
					<td>磨具状态</td>
				</tr>
				<tr  >
					<td>生产日期</td>
					<td>计划单号</td>
					<td>产品名称</td>
					<td>车间</td>
					<td>工序</td>
					<td>操作工</td>
					<td>合格数量</td>
					<td>次品数量</td>
					<td>设备名称</td>
					<td>设备状态</td>
					<td>磨具名称</td>
					<td>磨具状态</td>
				</tr>
				<tr  >
					<td>生产日期</td>
					<td>计划单号</td>
					<td>产品名称</td>
					<td>车间</td>
					<td>工序</td>
					<td>操作工</td>
					<td>合格数量</td>
					<td>次品数量</td>
					<td>设备名称</td>
					<td>设备状态</td>
					<td>磨具名称</td>
					<td>磨具状态</td>
				</tr>
				<tr  >
					<td>生产日期</td>
					<td>计划单号</td>
					<td>产品名称</td>
					<td>车间</td>
					<td>工序</td>
					<td>操作工</td>
					<td>合格数量</td>
					<td>次品数量</td>
					<td>设备名称</td>
					<td>设备状态</td>
					<td>磨具名称</td>
					<td>磨具状态</td>
				</tr>
				<tr  >
					<td>生产日期</td>
					<td>计划单号</td>
					<td>产品名称</td>
					<td>车间</td>
					<td>工序</td>
					<td>操作工</td>
					<td>合格数量</td>
					<td>次品数量</td>
					<td>设备名称</td>
					<td>设备状态</td>
					<td>磨具名称</td>
					<td>磨具状态</td>
				</tr>
				<tr  >
					<td>生产日期</td>
					<td>计划单号</td>
					<td>产品名称</td>
					<td>车间</td>
					<td>工序</td>
					<td>操作工</td>
					<td>合格数量</td>
					<td>次品数量</td>
					<td>设备名称</td>
					<td>设备状态</td>
					<td>磨具名称</td>
					<td>磨具状态</td>
				</tr>
				<tr  >
					<td>生产日期</td>
					<td>计划单号</td>
					<td>产品名称</td>
					<td>车间</td>
					<td>工序</td>
					<td>操作工</td>
					<td>合格数量</td>
					<td>次品数量</td>
					<td>设备名称</td>
					<td>设备状态</td>
					<td>磨具名称</td>
					<td>磨具状态</td>
				</tr>
				<tr  >
					<td>生产日期</td>
					<td>计划单号</td>
					<td>产品名称</td>
					<td>车间</td>
					<td>工序</td>
					<td>操作工</td>
					<td>合格数量</td>
					<td>次品数量</td>
					<td>设备名称</td>
					<td>设备状态</td>
					<td>磨具名称</td>
					<td>磨具状态</td>
				</tr>
				<tr  >
					<td>生产日期</td>
					<td>计划单号</td>
					<td>产品名称</td>
					<td>车间</td>
					<td>工序</td>
					<td>操作工</td>
					<td>合格数量</td>
					<td>次品数量</td>
					<td>设备名称</td>
					<td>设备状态</td>
					<td>磨具名称</td>
					<td>磨具状态</td>
				</tr>
				<tr  >
					<td>生产日期</td>
					<td>计划单号</td>
					<td>产品名称</td>
					<td>车间</td>
					<td>工序</td>
					<td>操作工</td>
					<td>合格数量</td>
					<td>次品数量</td>
					<td>设备名称</td>
					<td>设备状态</td>
					<td>磨具名称</td>
					<td>磨具状态</td>
				</tr>
				<tr  >
					<td>生产日期</td>
					<td>计划单号</td>
					<td>产品名称</td>
					<td>车间</td>
					<td>工序</td>
					<td>操作工</td>
					<td>合格数量</td>
					<td>次品数量</td>
					<td>设备名称</td>
					<td>设备状态</td>
					<td>磨具名称</td>
					<td>磨具状态</td>
				</tr>
				<tr  >
					<td>生产日期</td>
					<td>计划单号</td>
					<td>产品名称</td>
					<td>车间</td>
					<td>工序</td>
					<td>操作工</td>
					<td>合格数量</td>
					<td>次品数量</td>
					<td>设备名称</td>
					<td>设备状态</td>
					<td>磨具名称</td>
					<td>磨具状态</td>
				</tr>
				<tr  >
					<td>生产日期</td>
					<td>计划单号</td>
					<td>产品名称</td>
					<td>车间</td>
					<td>工序</td>
					<td>操作工</td>
					<td>合格数量</td>
					<td>次品数量</td>
					<td>设备名称</td>
					<td>设备状态</td>
					<td>磨具名称</td>
					<td>磨具状态</td>
				</tr>
				<tr  >
					<td>生产日期</td>
					<td>计划单号</td>
					<td>产品名称</td>
					<td>车间</td>
					<td>工序</td>
					<td>操作工</td>
					<td>合格数量</td>
					<td>次品数量</td>
					<td>设备名称</td>
					<td>设备状态</td>
					<td>磨具名称</td>
					<td>磨具状态</td>
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
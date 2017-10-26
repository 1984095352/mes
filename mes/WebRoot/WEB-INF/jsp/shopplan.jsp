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
    <h4>产品信息</h4>
        <form id="form" class="form-inline" action="${pageContext.request.contextPath}/plan/addShopPlan.action" method="post">
            <table class="table table-hover">
              <tr>
                <td><label for="exampleInputName2">计划单号</label></td>
                
                <td><input type="text" class="form-control" name="planNo" value="${shopPlan.planNo }"/></td>           
              
                <td><label for="exampleInputName2">物料号</label></td>
                <td><input id="wl" type="text" class="form-control" name="materialNo"  value="${shopPlan.materialNo }"></td>
              
              
                <td><label for="exampleInputName2">产品名称</label></td>
                <td><input type="text" class="form-control" name="materialName" value="${shopPlan.materialName }"/></td>
              </tr>
              <tr>
                <td><label for="exampleInputName2">车间名称</label></td>  
                <td><input id="cj" type="text" class="form-control" name="shopName" value="${shopPlan.shopName }"/></td>           
              
                <td><label for="exampleInputName2">计划数量</label></td>
                <td><input  type="text" class="form-control" name="planNum"  value="${shopPlan.planNum }"></td>
              </tr>
            
          </table>
        <h4>生产车间计划安排</h4>
        <input  type="hidden" id="num" name="num"  value="">
        <input  type="hidden"  name="planId"  value="${planId }">
        <div id="div">
        	<jsp:include page="shopdiv.jsp"></jsp:include>
        </div>
                <br />
               
        </form>
        <button id="tijiao" type="button" class="btn btn-primary navbar-right">提交</button>
</div>



<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="../js/jquery-3.2.1.min.js"></script>  
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <script src="../js/bootstrap.min.js"></script>
        <script src="../js/bootstrap-datetimepicker.js"></script>
        <script src="../js/bootstrap-datetimepicker.zh-CN.js"></script>
        <script src="../js/my.js"></script>
<script type="text/javascript" >//$(document).ready(function(){
	//window.onload = orderjs();
	$(function(){
		/* order_js();
		calender(); */
		/* $("#cj").blur(function(){
			 $.ajax({
					 	 url:"${pageContext.request.contextPath}/plan/shopAjax.action",						 
						 data:{
							wuliao:$("#wl").val(),
							shop_name:$("#cj").val(),
						 },
						 type:"POST",
						 success:function(responseText){
							$("#div").html(responseText);
							
						 }
			}); 
			
			
		}); */
		$("#tijiao").click(function(){
			var j=1;
			$(".used").each(function(){
				$(this).attr("id","div_"+j);
				var gongxu = $(this).children().first();
				gongxu.attr("name","gongxu" + j);
				var shebei =gongxu.next();
				shebei.attr("name","shebei" + j);
				var caozuogong =shebei.next();
				caozuogong.attr("name","caozuogong" + j);
				j++;
			});
			$("#num").val(j-1);
			var formParam1 = $("form").serialize();
			var formParam2 = $("form").serializeArray();
			alert(formParam1);
			$("form").submit();
		});
	});
	function jia(obj){
			
			var sourceNode = $(obj).parent();
			var cloneNode = sourceNode.clone();
			sourceNode.after("<div id='' class='used'></div>");
			sourceNode.next().html(cloneNode.html());		
	}
	function jian(obj){
			
			var delNode = $(obj).parent();
			delNode.remove();		
	}
</script>
    
</body>
</html>
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
        <form id="form" class="form-inline">
            <table class="table table-hover">
              <tr>
              	<td><label for="exampleInputName2">客户</label></td>
                <td><input  type="text" class="form-control" name="client"  value="${wuliaohao }"></td>
              
                <td><label for="exampleInputName2">计划单号</label></td>  
                <td><input type="text" class="form-control" name="plan_no"  value=""/></td>           
              
                <td><label for="exampleInputName2">物料号</label></td>
                <td><input id="wl" type="text" class="form-control" name="wuliaohao"  value="${wuliaohao }"></td>
              
              
                <td><label for="exampleInputName2">产品名称</label></td>
                <td><input type="text" class="form-control" name="chanpin"  value=""/></td>
                                   
              </tr>
            
          </table>
        <h4>产品测量记录</h4>
        <div id="div">
        	<jsp:include page="productTestDiv.jsp"></jsp:include>
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
		$("#wl").blur(function(){
			 $.ajax({
					 	 url:"${pageContext.request.contextPath}/plan/productTestAjax.action",						 
						 data:{
							wuliao:$("#wl").val(),
							shop_name:$("#cj").val(),
						 },
						 type:"POST",
						 success:function(responseText){
							$("#div").html(responseText);
							
						 }
			}); 
			
			
		});
		$("#tijiao").click(function(){
			var j=1;
			$(".used").each(function(){
				var produce_date = $(this).children().first().children().first().children().first().children().first();	
				produce_date.attr("name","produce_date" + j);
				var gongxu = produce_date.parent().next().children().first();
				gongxu.attr("name","gongxu" + j);
				var biaozhunzhi =gongxu.parent().next().children().first();
				biaozhunzhi.attr("name","biaozhunzhi" + j);
				var clz1 =biaozhunzhi.parent().next().children().first();
				clz1.attr("name","clz1" + j);
				var clz2 =clz1.parent().next().children().first();
				clz2.attr("name","clz2" + j);
				var clz3 =clz2.parent().next().children().first();
				clz3.attr("name","clz3" + j);
				var clz4 = clz3.parent().parent().next().children().first().children().first();
				clz4.attr("name","clz4" + j);
				var clz5 = clz4.parent().next().children().first();
				clz5.attr("name","clz5" + j);
				var caozuogong =clz5.parent().next().children().first();
				caozuogong.attr("name","caozuogong" + j);
				var pihao =caozuogong.parent().next().children().first();
				pihao.attr("name","pihao" + j);
				var panding =pihao.parent().next().children().first();
				panding.attr("name","panding" + j);
				j++;
			});
			var formParam1 = $("form").serialize();
			var formParam2 = $("form").serializeArray();
			alert(formParam1);
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
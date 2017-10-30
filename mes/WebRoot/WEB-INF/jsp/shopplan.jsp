<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()+ path + "/";
%>
<jsp:include page="headandfoot.jsp"></jsp:include>
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="../js/jquery-3.2.1.min.js"></script>  
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <script src="../js/bootstrap.min.js"></script>
        <script src="../js/bootstrap-multiselect.js" type="text/javascript"></script>
        <script src="../js/bootstrap-datetimepicker.js"></script>
        <script src="../js/bootstrap-datetimepicker.zh-CN.js"></script>
        <script src="../js/my.js"></script>
<div class="container">
    <h4>产品信息</h4>
        <form id="form" class="form-inline" action="${pageContext.request.contextPath}/plan/addShopPlan.action" method="post">
            <table class="table table-hover">
              <tr>
                <td><label for="exampleInputName2">计划单号</label></td> 
                <td><input type="text" class="form-control" name="planNo" value="${shopPlan.planNo }"/></td>                                         
              
                <td><label for="exampleInputName2">物料号</label></td>
                <td><input id="wl" type="text" class="form-control" name="materialNo"  value="${shopPlan.materialNo }"></td>
              
              	<td><label for="exampleInputName2">客户</label></td> 
                <td><input type="text" class="form-control" name="client" value="${shopPlan.client }"/></td>
             </tr>
             <tr>              
                <td><label for="exampleInputName2">产品名称</label></td>
                <td><input type="text" class="form-control" name="materialName" value="${shopPlan.materialName }"/></td>
              
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


<script type="text/javascript" >//$(document).ready(function(){
	//window.onload = orderjs();
	$(function(){
		/* order_js();
		calender(); */
		 $("#cj").blur(function(){
			 $.ajax({
					 	 url:"${pageContext.request.contextPath}/plan/shopAjax.action",						 
						 data:{
							materialNo:$("#wl").val(),
							shopName:$("#cj").val(),
						 },
						 type:"POST",
						 success:function(responseText){
							$("#div").html(responseText);
							$(".multiselect1").multiselect({
								placeholder: '--请选择--',
							    maxHeight: 300,
							    enableFiltering: true,
							    enableCaseInsensitiveFiltering: true,
							    filterPlaceholder: '',
							    nonSelectedText: '--请选择--',
							    nSelectedText: '个已选择',
							    numberDisplayed: 4
				    		});
						 }
			}); 
			
			
		}); 
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
			$("form").submit();
		});
		$(".multiselect").multiselect({
		    maxHeight: 300,
		    enableFiltering: true,
		    enableCaseInsensitiveFiltering: true,
		    filterPlaceholder: '',
		    nonSelectedText: '--请选择--',
		    nSelectedText: '个已选择',
		    numberDisplayed: 4
    	});
	});
	function jia(obj){
			
			var sourceNode = $("#div_0");
			var cloneNode = sourceNode.clone();
			cloneNode.addClass("used");
			cloneNode.removeClass("hidden");
			cloneNode.children().first().next().next().addClass("multiselect1");
			cloneNode.children().first().next().next().attr("multiple","multiple");
			cloneNode.children().first().next().next().children().first().remove();	
			sourceNode.parent().append(cloneNode);
			$(".multiselect1").multiselect({
				placeholder: '--请选择--',
			    maxHeight: 300,
			    enableFiltering: true,
			    enableCaseInsensitiveFiltering: true,
			    filterPlaceholder: '',
			    nonSelectedText: '--请选择--',
			    nSelectedText: '个已选择',
			    numberDisplayed: 4
    		});
	}
	function jian(obj){
			
			var delNode = $(obj).parent();
			
			var firstdiv=$("#div").children().first().next();
			
			if(delNode.html()!=firstdiv.html()){
				delNode.remove();
			}
					
	}
</script>
    
</body>
</html>
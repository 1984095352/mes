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
                <td><input type="text" class="form-control" name="client" value=""/></td>
              
                <td><label for="exampleInputName2">计划单号</label></td>
                <td><input type="text" class="form-control" name="plan_no" value=""/></td>           
              
                <td><label for="exampleInputName2">物料号</label></td>
                <td><input id="wl" type="text" class="form-control" name="wuliaohao"  value="${wuliaohao }"></td>
              
              
                <td><label for="exampleInputName2">产品名称</label></td>
                <td><input type="text" class="form-control" name="chanpinmc" value=""/></td>
              </tr>
              <tr>
                <td><label for="exampleInputName2">材料炉批号</label></td>  
                <td><input  type="text" class="form-control" name="lupihao" value=""/></td>           
              
                <td><label for="exampleInputName2">产品号</label></td>
                <td><input  type="text" class="form-control" name="product_no"  value="${wuliaohao }"></td>
              	
              	<td><label for="exampleInputName2">产品描述</label></td>
                <td><input  type="text" class="form-control" name="product_des"  value="${wuliaohao }"></td>
                
                <td><label for="exampleInputName2">产品图号</label></td>
                <td><input  type="text" class="form-control" name="product_fig" value=""/></td>
              </tr>
              <tr>
                <td><label for="exampleInputName2">材料牌号规则</label></td>  
                <td><input  type="text" class="form-control" name="material_spec" value=""/></td>           
              
                <td><label for="exampleInputName2">材料批次号</label></td>
                <td><input  type="text" class="form-control" name="material_batch_no" value=""/></td>
              	
              	<td><label for="exampleInputName2">生产指令</label></td>
                <td><input  type="text" class="form-control" name="production_order" value=""/></td>
                
                
              </tr>
            
          </table>
        <h4>生产车间计划安排</h4>
        <div id="div" class="form-group">
        
        	<jsp:include page="genzongdandiv.jsp"></jsp:include>
         
        </div>
               
           
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
					 	 url:"${pageContext.request.contextPath}/plan/genzongdanAjax.action",						 
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
				var shop_name = produce_date.parent().next().children().first();
				shop_name.attr("name","shop_name" + j);
				var gongxu =shop_name.parent().next().children().first();
				gongxu.attr("name","gongxu" + j);
				var gongjia =gongxu.parent().next().children().first();
				gongjia.attr("name","gongjia" + j);
				var caozuogong =gongjia.parent().next().children().first();
				caozuogong.attr("name","caozuogong" + j);
				var lingliaoshu =caozuogong.parent().next().children().first();
				lingliaoshu.attr("name","lingliaoshu" + j);
				var hegeshu = caozuogong.parent().parent().next().children().first().children().first();
				hegeshu.attr("name","hegeshu" + j);
				var liaofeishu = hegeshu.parent().next().children().first();
				liaofeishu.attr("name","liaofeishu" + j);
				var gongfeishu =liaofeishu.parent().next().children().first();
				gongfeishu.attr("name","gongfeishu" + j);
				var zijianbhgs =gongfeishu.parent().next().children().first();
				zijianbhgs.attr("name","zijianbhgs" + j);
				var buhegezt =zijianbhgs.parent().next().children().first();
				buhegezt.attr("name","buhegezt" + j);
				var beizhu =buhegezt.parent().next().children().first();
				beizhu.attr("name","beizhu" + j);
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
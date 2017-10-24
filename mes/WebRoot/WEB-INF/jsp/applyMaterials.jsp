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
    <h4>订单详细信息</h4>
        <form id="form" class="form-inline">
            
             

                <label for="exampleInputName2">&nbsp;&nbsp;客户&nbsp;&nbsp;&nbsp;&nbsp;</label>
                <input type="text" class="small-input" name="client"  value=""/>
                           
              	<label for="exampleInputName2">订划单号</label>   
                <input type="text" class="form-control" name="plan_no"  value=""/>
                
                <label for="exampleInputName2">物料号</label>
                <input type="text" class="form-control" name="wuliaohao"  value=""/>
              
                <label for="exampleInputName2">产品名称</label>
                <input type="text" class="form-control" name="chanpin" value=""/>
           
              	<label for="exampleInputName2">车间名称</label>
                <input type="text" class="small-input" name="chejian" value=""/>
            
               <br /><br />
         
        <h4>制定生产计划</h4>
          
            <div class="pull-right">
                <button id="jia" type="button" class="btn btn-default" >增加</button>
                <button id="jian" type="button" class="btn btn-default">删除</button>
            </div>
            
            <div id="div_1" class="form-group used">
         
                材料名称：<select  name="cailiaomc1" class="big-input">
                    <option value="1">外协</option>
                    <option value="2">冲压工段</option>
                    <option value="3">仪表工段</option>
                    <option value="4">焊接班组</option>
                    <option value="5">打磨</option>
                    <option value="6">外协电泳件</option>
                    <option value="7">检验班组</option>
                </select>
                材料数量：<input class="mini-input" name="cailiaosl1" type="text" value=""/>
                单位：<input class="mini-input" name="danwei1" type="text" value=""/>
               备注：<input class="mini-input" name="beizhu1" type="text" value=""/>
              <br /><br /> 
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
        
<script type="text/javascript" >//$(document).ready(function(){
	//window.onload = orderjs();
	$(function(){
		var i = 1;
		var len=$(".used").length;
			i=len;	
		$("#jia").click(function(){
			i++;
			var sourceNode = $("#div_1");
			var cloneNode = sourceNode.clone();
			cloneNode.attr("id", "div_" + i);
			sourceNode.parent().append(cloneNode);
			$("#div_" + i).addClass("used");
			
		});
		$("#jian").click(function() {

			if(i > len) {
				i--;
				var form = document.getElementById("form");
				form.removeChild(form.childNodes[form.childNodes.length - 1]);
			}
		});

		$("#tijiao").click(function() {
			var j=1;
			$(".used").each(function(){
				$(this).attr("id","div_"+j);
				var cailiaomc = $(this).children().first();				
				var cailiaosl =cailiaomc.next();
				var danwei =cailiaosl.next();
				var beizhu =danwei.next();				
				cailiaomc.attr("name","cailiaomc" + j);
				cailiaosl.attr("name","cailiaosl" + j);
				danwei.attr("name","danwei" + j);
				beizhu.attr("name","beizhu" + j);
				j++;
			});
			var formParam1 = $("form").serialize();
			var formParam2 = $("form").serializeArray();
			alert(formParam1);
			console.info(formParam2);
		});
	

	});
</script>
    
</body>
</html>
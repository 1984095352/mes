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
            <table class="table table-hover">
              <tr>

                <td><label for="exampleInputName2">客户</label></td>
                <td><input type="text" class="form-control" name="client" value=""/></td>
             
             	<td><label for="exampleInputName2">下单日期</label></td>
                <td><div class="input-group date form_date"  data-date-format="yyyy-mm-dd">
                            <input class="form-control" size="16" type="text" name="jiaofu_date" value=""/>
                            <span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
                </div></td>
              
              	<td><label for="exampleInputName2">订划单号</label></td>    
                <td><input type="text" class="form-control" name="plan_no" value=""/></td>
                
                <td><label for="exampleInputName2">物料号</label></td>
                <td><input type="text" class="form-control" name="wuliaohao" value=""/></td>
              </tr>
              <tr>
                <td><label for="exampleInputName2">产品名称</label></td>
                <td><input type="text" class="form-control" name="chanpinmc" value=""/></td>
              
              
            
                <td><label for="exampleInputName2">计划数量</label></td>
                <td><input type="text" class="form-control" name="plan_name" value=""/></td>         
          
                <td><label for="exampleInputName2">订单交付日期</label></td>
                <td><div class="input-group date form_date"  data-date-format="yyyy-mm-dd">
                            <input class="form-control" size="16" type="text" name="jiaofu_date" value=""/>
                            <span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
                </div></td>
          
                <td><label for="exampleInputName2">月计划数量</label></td>
                <td><input type="text" class="form-control" name="month_plan_num" value=""/></td>
          
             </tr>
             <tr>
          
                <td><label for="exampleInputName2">发货周数</label></td>
                <td><input type="text" class="form-control" name="zhoushu" value=""/></td>
                           
                
                <td><label for="exampleInputName2">周计划下单日期</label></td>
                <td><div class="input-group date form_date"  data-date-format="yyyy-mm-dd">
                            <input class="form-control" size="16" type="text" name="zhou_plan_date" value=""/>
                            <span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
                </div></td>
          
            
          
            <td><label for="exampleInputName2">原材料库存数量</label></td>
            <td><input type="text" class="form-control" name="yuancailiaokucunshu" value=""/></td>
          
          
            <td><label for="exampleInputName2">成品库存数量</label></td>
            <td><input type="text" class="form-control" name="chengpinkucunshu" value=""/></td>
          	
          	</tr>
            <tr>
            
          	<td><label for="exampleInputName2">半成品库存数量</label></td>
            <td><input type="text" class="form-control" name="banchengpinkucunshu" value=""/></td>
            
            <td><label for="exampleInputName2">采购承诺到货日期</label></td>
            <td><div class="input-group date form_date"  data-date-format="yyyy-mm-dd">
                            <input class="form-control" size="16" type="text" name="chengnuodaohuoriqi" value=""/>
                            <span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
            </div></td>
          
            <td><label for="exampleInputName2">实际到货日期</label></td>
            <!--<td><input type="text" class="form-control" name="shijidaohuo_date" placeholder="jh7683236"></td>-->
            <td><div class="input-group date form_date"  data-date-format="yyyy-mm-dd">
                            <input class="form-control" size="16" type="text" name="shijidaohuoriqi" value=""/>
                            <span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
            </div></td>
          

            <td><label for="exampleInputName2">实际发货数量</label></td>
            <td><input type="text" class="form-control" name="shijifahuoshu" value=""/></td>
          
          	</tr>
             <tr>
          
            <td><label for="exampleInputName2">实际发货日期</label></td>
             <td><div class="input-group date form_date"  data-date-format="yyyy-mm-dd">
                            <input class="form-control" size="16" type="text" name="shijifahuoriqi" value=""/>
                            <span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
            	 </div>
             </td>
          
            <td><label for="exampleInputName2">欠货数量</label></td>
            <td><input type="text" class="form-control" name="qianhuoshu" value=""/></td>
            
            <td><label for="exampleInputName2">多发货数量</label></td>
            <td><input type="text" class="form-control" name="duofahuoshu" value=""/></td>
          
            <td><label for="exampleInputName2">&nbsp;&nbsp;&nbsp;&nbsp;备注</label></td>
            <td><input type="text" class="form-control" name="remark" value=""/></td>
          
          </tr>
          </table>
        <h4>制定生产计划</h4>
          
            <div class="pull-right">
                <button id="jia" type="button" class="btn btn-default" >增加</button>
                <button id="jian" type="button" class="btn btn-default">删除</button>
            </div>
            
            <div id="div_1" class="form-group used">
         <table class="table table-hover">
         <tr>
                <td>生产工艺安排：<select  name="chejian1" class="big-input">
                    <option value="1">外协</option>
                    <option value="2">冲压工段</option>
                    <option value="3">仪表工段</option>
                    <option value="4">焊接班组</option>
                    <option value="5">打磨</option>
                    <option value="6">外协电泳件</option>
                    <option value="7">检验班组</option>
                </select></td>
                <td>交付数量：<input class="mini-input" name="jiaofu_num1" type="text" value=""/></td>
                
               <td> 交付日期：<div class="input-group date form_date"  data-date-format="yyyy-mm-dd">
                            <input class="form-control" size="16" type="text" name="jiaofu_date1" value=""/> 
                            <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
                            <span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
              </div></td>
           </tr> 
           <tr>  
              <td>计划完成日期：<div class="input-group date form_date"  data-date-format="yyyy-mm-dd">
                            <input class="form-control" size="16" type="text" name="plan_finish_date1" value=""/> 
                            <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
                            <span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
                        </div></td>
                
      	<td>实交数量：<input class="mini-input" name="shijiao_num1" type="text" value=""/></td>
                
                <td>实交日期：<div class="input-group date form_date"  data-date-format="yyyy-mm-dd">
                            <input class="form-control" size="16" type="text" name="shijiao_date1" value=""/> 
                            <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
                            <span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
              </div></td>
              </tr>
            </table>   
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
			$(".form_date").each(function() {
				$(this).datetimepicker({
					language: 'zh-CN',
					weekStart: 0,
					todayBtn: 1,
					autoclose: 1,
					todayHighlight: 1,
					startView: 3,
					minView: 2,
					forceParse: 0
				});
			});
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
				var chejian = $(this).children().children().children().children().children().first();				
				var jiaofu_num =chejian.parent().next().children().first();
				var div_date =jiaofu_num.parent().next().children().first();
				chejian.attr("name","chejian" + j);
				jiaofu_num.attr("name","jiaofu_num" + j);
				var jiaofu_date = div_date.children().first();
				jiaofu_date.attr("name","jiaofu_date" + j);
				var div_date2 =div_date.parent().parent().next().children().children().first();
				var plan_finish_date = div_date2.children().first();
				plan_finish_date.attr("name","plan_finish_date" + j);
				var shijiao_num=div_date2.parent().next().children().first();
				shijiao_num.attr("name","shijiao_num" + j);
				var div_date3=shijiao_num.parent().next().children().first();
				var shijiao_date=div_date3.children().first();
				shijiao_date.attr("name","shijiao_date" + j);
				j++;
			});
			var formParam1 = $("form").serialize();
			var formParam2 = $("form").serializeArray();
			alert(formParam1);
			console.info(formParam2);
		});
	
		$('.date').datetimepicker({
			language: 'zh-CN',
			weekStart: 0,
			todayBtn: 1,
			autoclose: 1,
			todayHighlight: 1,
			startView: 3,
			minView: 2,
			forceParse: 0
		});

	});
</script>
    
</body>
</html>
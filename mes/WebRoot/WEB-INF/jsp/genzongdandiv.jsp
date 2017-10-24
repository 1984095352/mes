<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()+ path + "/";
%>

	<c:forEach items="${data}" var="item">
	<h5>跟踪卡</h5>
	<table class="table table-hover used ">
	
         <tr>
                <td>生产日期：<input  type="text" name="produce_date" value=""/> </td>
                <td>车间名称：<input  name="shop_name" type="text" value=""/></td>
               <td>工序：<input  name="gongxu" type="text" value=""/> </td>
               <td>工价：<input  name="gongjia" type="text" value=""/> </td>
              <td>操作工：<input  name="caozuogong" type="text" value=""/></td>
              <td>领料数：<input  name="lingliaoshu" type="text" value=""/> </td>
            </tr> 
           <tr> 
            <td>合格数：<input  name="hegeshu" type="text" value=""/> </td>
             <td>料废次品数：<input  name="liaofeishu" type="text" value=""/> </td>    
              <td>工废次品数：<input  name="gongfeishu" type="text" value=""/></td>
              <td>自检不合格数：<input  name="zijianbhgs" type="text" value=""/> </td>
              <td>不合格状态：<input  name="buhegezt" type="text" value=""/> </td>
             <td>备注：<input  name="beizhu" type="text" value=""/> </td>
            </tr>
          </table> 
      
     </c:forEach>
     
<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()+ path + "/";
%>

	<c:forEach items="${listTask}" var="item">
	<div id="div_1" class="used">
	  
                工序：<input  class="mini-input" name="gongxu1" type="text" value="${item.processName }"/>
	      设备：<select  name="shebei1" class="form-control" >
	      <c:choose>
	      <c:when test="${item.asset=='外协' }"><option value="外协" selected="selected">外协</option></c:when>
          <c:otherwise ><option value="外协" >外协</option></c:otherwise>  </c:choose>         
                    <option value="冲压工段">冲压工段</option>
                    <option value="仪表工段">仪表工段</option>
                    <option value="焊接班组">焊接班组</option>
                    <option value="打磨">打磨</option>
                    <option value="外协电泳件">外协电泳件</option>
                    <option value="检验班组">检验班组</option>
                </select>          
	      操作工：<select  name="caozuogong1" class="form-control">
                    <option value="1">外协</option>
                    <option value="2">冲压工段</option>
                    <option value="3">仪表工段</option>
                    <option value="4">焊接班组</option>
                    <option value="5">打磨</option>
                    <option value="6">外协电泳件</option>
                    <option value="7">检验班组</option>
                </select> &nbsp;&nbsp;&nbsp;&nbsp;       
      <button  type="button" class="btn btn-default" onclick="jia(this)">插入</button>&nbsp;
      <button  type="button" class="btn btn-default" onclick="jian(this)">删除</button>
                <br /><br /> 
               
      </div>
      
     </c:forEach>
<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()+ path + "/";
%>

	<c:forEach items="${data}" var="item">
	<div  class="used">	   
	   <h5>详细记录</h5>
             <table class="table table-hover">
	
         <tr>
                <td>生产日期：<input  type="text" name="produce_date" value=""/> </td>
                <td>工序：<input   name="gongxu" type="text" value=""/> </td>
               <td>标准值：<input   name="biaozhunzhi" type="text" value=""/></td>
               <td>测量值1：<input   name="clz1" type="text" value=""/></td>
              <td>测量值2：<input   name="clz2" type="text" value=""/></td>
              <td>测量值3：<input   name="clz3" type="text" value=""/></td>
            </tr> 
           <tr> 
            <td>测量值4：<input   name="clz4" type="text" value=""/></td>
             <td>测量值5：<input   name="clz5" type="text" value=""/></td>    
              <td>操作工：<input  name="caozuogong" type="text" value=""/></td>
              <td>批号：<input   name="pihao" type="text" value=""/></td>
              <td>判定：<input   name="panding" type="text" value=""/></td>
             <td> <input  type="button" class="btn btn-default" onclick="jia(this)" value="插入"/>&nbsp;&nbsp;&nbsp;
     		 <input  type="button" class="btn btn-default" onclick="jian(this)" value="删除"/></td>
            </tr>
          </table> 
        
      </div>         
      
     </c:forEach>
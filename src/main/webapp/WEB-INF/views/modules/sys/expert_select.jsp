<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    <%@ page import="org.apache.shiro.web.filter.authc.FormAuthenticationFilter"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
<head>
<meta charset="utf-8" />
<title><c:out value="${industry}"/>实时监控平台</title>
<link rel="shortcut icon" type="image/png" HREF="${ctxStatic}/img/favicons/favicon.png"/>
<link rel="icon" type="image/png" HREF="${ctxStatic}/img/favicons/favicon.png"/>
<link rel="apple-touch-icon" HREF="${ctxStatic}/img/favicons/apple.png" />
<!-- Main Stylesheet --> 
<script src="${ctxStatic}/js/jquery-1.9.1.min.js" type="text/javascript"></script>
<link rel="stylesheet" type="text/css" href="${ctxStatic}/css/expert_select.css">
<link rel="stylesheet" href="${ctxStatic}/css/custom.css" type="text/css" />
<link rel="stylesheet" href="${ctxStatic}/css/style.css" type="text/css" />
<link rel="stylesheet" type="text/css" href="${ctxStatic}/css/expert_select.css">
<link href="${ctxStatic}/common/jeesite.css" type="text/css" rel="stylesheet" />
<link href="${ctxStatic}/bootstrap/2.3.1/css_cerulean/bootstrap.min.css" type="text/css" rel="stylesheet" />
<script src="${ctxStatic}/bootstrap/2.3.1/js/bootstrap.min.js" type="text/javascript"></script>
<script type="text/javascript">
window.onload=function(){

    var right_h=document.getElementById('se_right').offsetHeight;
    var left_h=document.getElementById('se_left').offsetHeight;
    document.getElementById('se_left').style.height=right_h-2+"px";
}
</script>
<script type="text/javascript">
function move(e1,e2)
{
 var con_data=[];
 for(var i=0;i<e1.length;i++)
 {
  if(e1.options[i].selected)
   con_data[con_data.length]=[e1.options[i].value,e1.options[i].text];
 }
 
 e2.length=e2.length;
 for(var i=0;i<con_data.length;i++)
 {
  var con_fla=true;
  for(var k=0;k<e2.length;k++)
  {
   if(con_data[i][0]==e2.options[k].value)
    con_fla=false;
  }
  if(con_fla)
   e2.options[e2.length]=new Option(con_data[i][1],con_data[i][0]);
 }
}

function del(e2)
{
 var index_data=[];
 for(var i=0;i<e2.length;i++)
 {
  if(e2.options[i].selected)
   index_data[index_data.length]=[i];
 }
 for(var i=index_data.length-1;i>=0;i--)
 {
  e2.removeChild(e2.options[index_data[i]]);
 }
}

function getvalue(){
	var v1=document.getElementById('cycle_right');
	var v2=document.getElementById('para_right');
 var list1 ="";
 var sub1 =document.getElementById('submitlist1');
 for(i=0;i<v1.length;i++){
   list1 += v1.options[i].value+".";
 }
 sub1.value=list1;

  var list2 ="";
  var sub2 =document.getElementById('submitlist2');
  for(i=0;i<v2.length;i++){
   list2 += v2.options[i].value+".";
 }
 sub2.value =list2;
 alert(document.getElementById('submitlist1').value+'|'+document.getElementById('submitlist2').value);
document.getElementById('submit').submit();
 
}
</script>

</style>
</head>
<body >
  <ul class="nav nav-tabs">
		<li class="active"><a href="${ctx}/expert/findPlantList.do?base_id=1">专家配置</a></li>
		<shiro:hasPermission name="sys:user:edit"><li><a href="${ctx}/expert/findAllValue.do?base_id=1&plant_id=5">专家修改</a></li></shiro:hasPermission>
	</ul>
	<!-- Page content -->
	<div id="content" class="content">
		<!-- Wrapper -->
		<div class="bin" style="border:1px solid #ccc;">

		  <!-- left column/section -->
				<div class="se_left" id="se_left">
					<div id="industry" class="industry">
					  <h2 class="industry_select">请选择作物</h2>
						<ul>
			                
			                <c:forEach items="${plantlist}" var="i">	                
			                 <li><a style="color: #333;" href="/createbling/a/expert/findParamCycleList.do?plant_id=${i.id}&base_id=${base_id}"><c:out value="${i.name}"/></a></li>
			                 </c:forEach>		                 
			                 
		                </ul>
					</div>
				</div>
				<!-- End of left column/section -->

				<!--right column/section -->
				<div class="se_right" id="se_right">

				  <div class="se_right_title">           <!--修改了-->
				    <ul>
				    	<li class="choose_can"><a href="javascript:void(0);">环境参数</a></li>
				    	<li class="choose_zhou"><a href="javascript:void(0);">生长周期</a></li>
				    </ul>
				  </div>

				  <div class="se_right_content">
				  	
				  <div class="chooselist" id="chooselist_zhou" style="display:block;">         
				  	<div class="mainlist">
				      <h2><c:out value="${plant.name}"/>的生长时期可选项</h2>
				      <div class="inbox">
				       <select multiple id="cycle_left" name="cycle_left">
                            <c:forEach items="${timelist}" var="t">	   
                               <option value="${t.id}"><c:out value="${t.name}"/></option>
                       		</c:forEach>     
                      </select>
				   	  </div>
				   </div>

				   <div class="middle">
				     	<a href="javascript:void(0);" onclick="move(document.getElementById('cycle_left'), document.getElementById('cycle_right'))">添加</a>
                       <a href="javascript:void(0);" onclick="del(document.getElementById('cycle_right'))">删除</a>
				   </div>

				   <div class="showlist" id="showlist">
				   	  <h2><c:out value="${plant.name}"/>的生长时期已选项</h2>
				   	  <div class="inbox">
				   	  	<select style="width:100%" multiple id="cycle_right" name="cycle_right" >
                        </select>
				   	  </div>
				   </div>   

				 </div>      <!--周期选择结束-->

				 <div id="chooselist_can" class="chooselist" style="display:none;">
				 	<div class="mainlist" id="mainlist">
				      <h2><c:out value="${plant.name}"/>的环境参数可选项</h2>
				      <div class="inbox">
				       <select multiple id="para_left" name="para_left">
                               <c:forEach items="${paramlist}" var="p">	   
                               <option value="${p.id}"><c:out value="${p.name}"/></option>
                       </c:forEach>
                      </select>
				   	  </div>
				   </div>

				   <div class="middle">
				   	   <a href="javascript:void(0);" onclick="move(document.getElementById('para_left'), document.getElementById('para_right'))">添加</a>
                       <a href="javascript:void(0);" onclick="del(document.getElementById('para_right'), document.getElementById('para_left'))">删除</a>
				   </div>

				   <div class="showlist" id="showlist">
				   	<h2><c:out value="${plant.name}"/>的环境参数已选项</h2>
				   	  <div class="inbox">
				   	  	<select style="width:100%" multiple id="para_right" name="para_right" >
                        </select>
				   	  </div>
				   </div>  
				 </div>        <!--参数选择结束-->
				  </div>        <!--右边内容结束-->

				 <div class="sub_con">
			   	    <form id="submit" action="/createbling/a/expert/addSelectedExpert.do?plant_id=${plant.id}" method="POST">  <!--提交表单-->
				   <input type="text" id="submitlist1" name="time" value="" style="display:none;" />
				   <input type="text" id="submitlist2" name="param" value="" style="display:none;" />
				   <button onclick="getvalue();">提 交</button>
				   </form>
				</div>
				 
				</div>
				<!-- End of right column/section -->
			
		</div>
		<!-- End of Wrapper -->
	</div>
	
	<!-- End of Page content -->
	
	<!-- Scroll to top link -->
	<a href="#" id="totop">^ 返回顶部</a>

<!-- Admin template javascript load -->
<script type="text/javascript" SRC="${ctxStatic}/js/backoffice/administry.js"></script>
    <script type="text/javascript">
    $(function(){
    	$('li:contains("${industry}")').addClass('aa');
     $("#se_left li").click(function(){ 
        $("li[class='aa']").removeAttr("class");
        $(this).addClass("aa");
      });
    });
</script>
<script type="text/javascript">
	$(".choose_can").click(function(){
		$('.choose_zhou').css({"background":"#cc3366"});
		$(this).css({"background":"#3CB1E7"});
      $('#chooselist_zhou').hide();
      $('#chooselist_can').show();
	})
	$(".choose_zhou").click(function(){
		$('.choose_can').css({"background":"#cc3366"});
		$(this).css({"background":"#3CB1E7"});
      $('#chooselist_can').hide();
      $('#chooselist_zhou').show();
	})
</script>
</body>
</html>
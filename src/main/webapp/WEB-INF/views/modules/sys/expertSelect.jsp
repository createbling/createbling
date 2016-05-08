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

</style>
</head>
<body >
<%--   <ul class="nav nav-tabs">
		<li class="active"><a href="${ctx}/sys/expert/select">专家配置</a></li>
		<shiro:hasPermission name="sys:expert:edit"><li><a href="${ctx}/sys/expert/modify">专家修改</a></li></shiro:hasPermission>
	</ul> --%>
	<!-- Page content -->
	<div id="content" class="content">
		<!-- Wrapper -->
		<div class="bin" style="border:1px solid #ccc;">



				<!--right column/section -->
				<div class="se_right" id="se_right">

				  <div class="se_right_title">           <!--修改了-->
				    <ul id="choose" style="margin-bottom:0px;margin-left:30px;width: 400px;">
				        <li class="choose_zhou on"><a href="javascript:void(0);">生长周期</a></li>
				    	<li class="choose_can"><a href="javascript:void(0);">环境参数</a></li>
				    	
				    </ul>
				  </div>

				  <div class="se_right_content">
				  	
				  <div class="chooselist" id="chooselist_zhou" style="display:block;">         
				  	<div class="mainlist">
				      <h2><c:out value="${plant.name}"/>的生长周期可选项</h2>
				      <div class="inbox">
				       <ul id="cycle_left" style="margin-left:0;">
                            <c:forEach items="${timelist}" var="t">	   
                               <li value="${t.id}"><c:out value="${t.name}"/></li>
                       		</c:forEach>     
                      </ul>
				   	  </div>
				   </div>

				   <div class="middle">
				     	<a href="javascript:void(0);" id="cycle_add">添加>></a>
                       <a href="javascript:void(0);" id="cycle_del">&lt;&lt;删除</a>
				   </div>

				   <div class="showlist" id="showlist">
				   	  <h2><c:out value="${plant.name}"/>的生长周期已选项</h2>
				   	  <div class="inbox">
				   	  	<ul id="cycle_right" >
                        </ul>
				   	  </div>
				   </div>   

				 </div>      <!--周期选择结束-->

				 <div id="chooselist_can" class="chooselist" style="display:none;">
				 	<div class="mainlist" id="mainlist">
				      <h2><c:out value="${plant.name}"/>的环境参数可选项</h2>
				      <div class="inbox">
				       <ul id="para_left">
                               <c:forEach items="${paramlist}" var="p">	   
                               <li value="${p.id}"><c:out value="${p.name}"/></li>
                       </c:forEach>
                      </ul>
				   	  </div>
				   </div>

				   <div class="middle">
				   	   <a href="javascript:void(0);" id="para_add">添加>></a>
                       <a href="javascript:void(0);" id="para_del">&lt;&lt;删除</a>
				   </div>

				   <div class="showlist" id="showlist">
				   	<h2><c:out value="${plant.name}"/>的环境参数已选项</h2>
				   	  <div class="inbox">
				   	  	<ul id="para_right">
                        </ul>
				   	  </div>
				   </div>  
				 </div>        <!--参数选择结束-->
				  </div>        <!--右边内容结束-->

				 <div class="sub_con">
			   	    <form id="submit" action="${ctx}/sys/expert/addSelectedExpert?plant_id=${plant.id}" method="POST">  <!--提交表单-->
				   <input type="text" id="submitlist1" name="time" value="" style="display:none;" />
				   <input type="text" id="submitlist2" name="param" value="" style="display:none;" />
				   <a href="javascript:void(0);" id="btn_submit">提 交</a>
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
<script type="text/javascript">
	$(function(){
		$('#choose').find('li').click(function(){
			$(this).addClass('on');
			$(this).siblings().removeClass('on');
			if ($(this).index()==1) {
				$('#chooselist_zhou').hide();
				$('#chooselist_can').fadeIn(500);
				
			}
			else{
				$('#chooselist_can').hide();
				$('#chooselist_zhou').fadeIn(500);
			}
		})
	})
</script>

<!-- 周期 -->
<script type="text/javascript">
		$('#cycle_left').on("click","li",function(){
			var li=$(this);
			li.stop();
			li.css("background","#3CB1E7").css("color","#fff");
			$('#cycle_add').one("click",function(){
				var clone=li.clone();
               $('#cycle_right').append(clone);
               //alert(clone.text());
               li.remove();  
			})
            
		})
	$('#cycle_right').stop().on('click','li',function(){
		//alert("en");
            var ri=$(this);
            ri.css("background","none").css("color","#333");
            $('#cycle_del').one("click",function(){
            	var clone=ri.clone();
        		$('#cycle_left').append(clone);
        		ri.remove();
            })
        	
		})
</script>

<!--参数-->
<script type="text/javascript">
		$('#para_left').on("click","li",function(){
			var li=$(this);
			li.stop();
			li.css("background","#3CB1E7").css("color","#fff");
			$('#para_add').one("click",function(){
				var clone=li.clone();
               $('#para_right').append(clone);
               //alert(clone.text());
               li.remove();  
			})
            
		})
	$('#para_right').stop().on('click','li',function(){
		//alert("en");
            var ri=$(this);
            ri.css("background","none").css("color","#333");
            $('#para_del').one("click",function(){
            	var clone=ri.clone();
        		$('#para_left').append(clone);
        		ri.remove();
            })
        	
		})
</script>

<!--传值-->
<script type="text/javascript">
	$('#btn_submit').click(function(){
		var list1=""
        var sub1 =$('#submitlist1');
        var cycle_li=$('#cycle_right').find('li');
        for (var i = 0; i < cycle_li.length; i++) {
        	list1+=cycle_li[i].value+",";
        };
        sub1.val(list1);

        var list2="";
        var sub2 =$('#submitlist2');
        var para_li=$('#para_right').find('li');
        for (var j = 0; j < para_li.length; j++) {
        	list2+=para_li[j].value+",";
        };
        sub2.val(list2);

        //alert(sub1.val()+'|'+sub2.val());
       $('#submit').submit();
	})
</script>



</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
       <%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>

<meta charset="utf-8" />
<title><c:out value="${base}"/>实时监控平台</title>
<link rel="shortcut icon" type="image/png" HREF="${ctxStatic}/img/favicons/favicon.png"/>
<link rel="icon" type="image/png" HREF="${ctxStatic}/img/favicons/favicon.png"/>
<link rel="apple-touch-icon" HREF="${ctxStatic}/img/favicons/apple.png" />
<!-- Main Stylesheet --> 
<link rel="stylesheet" href="${ctxStatic}/css/style.css" type="text/css" />
<link rel="stylesheet" href="${ctxStatic}/css/custom.css" type="text/css" />
<link rel="stylesheet" type="text/css" href="${ctxStatic}/css/expert_select.css">
<link href="${ctxStatic}/common/jeesite.css" type="text/css" rel="stylesheet" />
<link href="${ctxStatic}/bootstrap/2.3.1/css_cerulean/bootstrap.min.css" type="text/css" rel="stylesheet" />
<script src="${ctxStatic}/bootstrap/2.3.1/js/bootstrap.min.js" type="text/javascript"></script>
<script src="${ctxStatic}/js/jquery-1.9.1.min.js" type="text/javascript"></script>
<script type="text/javascript">
window.onload=function(){
    var table_h=document.getElementById('zhuanjia').offsetHeight;
    var left_h=document.getElementById('se_left').offsetHeight;
    document.getElementById('se_left').style.height=table_h-3+"px";
}
</script>
<style type="text/css">
	#zhuanjia{
	border-collapse:collapse;
	border-left: 1px solid #ccc;
	border-bottom: 1px solid #ccc;
	width: 100%;
	height: 400px;
	font-weight: normal;
}
#zhuanjia tr{border-top: 1px solid #ccc; vertical-align: middle;}
#zhuanjia th,td{border-right: 1px solid #ccc; vertical-align: middle;}
#zhuanjia th a img{vertical-align: middle; float: right;margin-right: 4px;margin-top: 4px;}
#zhuanjia th a{font-size: 12px;text-decoration: none;}
.table_add{width: 100%; height: 30px; margin:15px 0 0;}
.table_add a{
	display: block;
	width: 45px;
	height: 30px;
	line-height: 30px;
	margin-left: 20px;
	float: right;
	font-size: 12px;
	text-align: center;
	color: #3CB1E7;
	border: 1px solid #3CB1E7;
	border-radius: 3px;
}
.table_add a:hover{background: #3cb1e7;color: #fff;}
a.modif{color: #3CB1E7;}
a.modif:hover{text-decoration: underline;}
.formodif{
	width: 1200px;
	height: 100px;
	background: #fff;
	margin: 0px auto 0;
	display: none;
	z-index: 999;
	position: absolute;
	border:1px solid #ccc;
}
.formodif table{width: 95%;margin:20px auto 0; }
.formodif tr.tr_modif{border-top: 1px solid #ccc; border-bottom: 1px solid #ccc; border-left: 1px solid #ccc;}
.formodif tr.tr_modif th.th_modif{border-right: 1px solid #ccc;}
.formodif input[type='text']{border: none; width: 95%;height: 100%;padding-left: 5px;}
.formodif a.sub_modif{
	display: block;
	width: 45px;
	height: 30px;
	line-height: 30px;
	margin-top: 20px;
	margin-left: 20px;
	float: right;
	font-size: 12px;
	text-align: center;
	color: #3CB1E7;
	border: 1px solid #3CB1E7;
	border-radius: 3px;
}
a.sub_modif_r{margin-right: 30px;}
#overlay {
    background: #000;
    filter: alpha(opacity=50); /* IE的透明度 */
    opacity: 0.5;  /* 透明度 */
    position: absolute;
    top: 0px;
    left: 0px;
    width: 100%;
    height: 100%;
    z-index: 100; /* 此处的图层要大于页面 */
    display:none;
}
</style>
</head>
<body>
<div id="overlay"></div>
 <ul class="nav nav-tabs">
		<li ><a href="${ctx}/expert/findPlantList.do?base_id=1">专家配置</a></li>
		<li class="active"><a href="${ctx}/expert/findAllValue.do?base_id=1&plant_id=5">专家修改</a></li>
	</ul>
<div class="formodif" id="formodif">
      <form id="table" action="" method="post">
		<table class="table_modif">
			<tr class="tr_modif" id="tr">
				<th class='th_modif'><input type='text' name='min' value='请输入改后最小值' /></th>
				<th class='th_modif'><input type='text' name='max' value='请输入改后最大值' /></th>
			</tr>
		</table>
		</form>
		<a class="sub_modif sub_modif_r" href="javascript:void(0);" onclick="hideOverlay();">取消</a>
		<a class="sub_modif" onclick="submit();">确定</a> <!--在此修改行-->
</div>

<div id="content" class="content">
		<!-- Wrapper -->
		<div class="bin">

		  <!-- left column/section -->
				<div class="se_left" id="se_left">
					<div id="industry" class="industry">
					  <h2 class="industry_select">请选择作物</h2>
						<ul>
			                 <c:forEach items="${plantlist}" var="i">	                
			                 <li><a style="color: #333;" href="/createbling/a/expert/findAllValue.do?plant_id=${i.id}&base_id=${base_id}"><c:out value="${i.name}"/></a></li>
			                 </c:forEach>		
		                </ul>
					</div>
				</div>
				<!-- End of left column/section -->

				<!--right column/section -->
				<div class="se_right" id="se_right" style="border:none;">
				<h1 align='center' font-size=50px><c:out value="${plantName}专家值一览表"/></h1>
   <table id="zhuanjia">
		<tr>
			<th>环境参数</th><th>生长时期</th><th>最小值</th><th>最大值</th><th>操作</th>
		</tr>
		<c:forEach var="e" items="${eList}">
			<tr>
                 <td align="center"><c:out value="${e[0]}"/></td> <td align="center"><c:out value="${e[1]}"/></td> <td align="center"><c:out value="${e[2]}"/></td> <td align="center"><c:out value="${e[3]}"/></td> <td align="center"><a class='modif' href='javascript:void(0);' onclick='getTop(this);' id='${e[4]}'>修改</a></td>
			</tr>
		</c:forEach>
	</table>

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
    	$('li:contains("${industry}")').addClass('aa');
     $("#se_left li").click(function(){ 
        $("li[class='aa']").removeAttr("class");
        $(this).addClass("aa");
      });
    });
</script>
<script type="text/javascript">
    $(function(){
    	$("a[class=modif]").each(function(){
    		$(this).click(function(){
    			
    			showOverlay();

    		})
    	})
    })
    function getTop(e){
    	$("#overlay").height(pageHeight());
        $("#overlay").width(pageWidth());
        $("#overlay").fadeTo(200, 0.5);
        $('#formodif').fadeIn("farst");
       var brother1=e.id;
       $("#table").attr("action","/createbling/a/expert/updateExpertValue.do?plant_id=${plant_id}&base_id=${base_id}&id="+brother1); 
       
    }
    function submit(){
    	document.getElementById("table").submit();
    }
    function showOverlay(){
    	$("#overlay").height(pageHeight());
        $("#overlay").width(pageWidth());
    // fadeTo第一个参数为速度，第二个为透明度
    // 多重方式控制透明度，保证兼容性，但也带来修改麻烦的问题
       $("#overlay").fadeTo(200, 0.5);
       $('#formodif').fadeIn("farst");
    }
    function showOver(){
    	$("#overlay").height(pageHeight());
        $("#overlay").width(pageWidth());
    // fadeTo第一个参数为速度，第二个为透明度
    // 多重方式控制透明度，保证兼容性，但也带来修改麻烦的问题
       $("#overlay").fadeTo(200, 0.5);
       $('#formodify').fadeIn("farst");
    }  
    /* 隐藏覆盖层 */
 function show(){
    	$("#overlay").height(pageHeight());
        $("#overlay").width(pageWidth());
    // fadeTo第一个参数为速度，第二个为透明度
    // 多重方式控制透明度，保证兼容性，但也带来修改麻烦的问题
       $("#overlay").fadeTo(200, 0.5);
       $('#formodi').fadeIn("farst");
    }   
 function hideOverlay() {
	    $("#overlay").fadeOut(200);
	    $("#formodif").hide();
	    $("#formodif").find('input').each(function(){$(this).attr('value','');})
	}
function hideOver() {
    $("#overlay").fadeOut(200);
    $("#formodify").hide();
    $("#formodify").find('input').each(function(){$(this).attr('value','');})
}
function hide() {
    $("#overlay").fadeOut(200);
    $("#formodi").hide();
    $("#formodi").find('input').each(function(){$(this).attr('value','');})
}
function pageHeight() {
    return document.body.scrollHeight;
}
function pageWidth() {
    return document.body.scrollWidth;
}
</script>
<script type="text/javascript">    //弹出层居中
	$(document).ready(function(){
		var modif=$('#formodif');
       var w = modif.width();
       var h = modif.height();  
       var t = scrollY() + (windowHeight()/2) - (h/2);
       if(t < 0) t = 0;    
       var l = scrollX() + (windowWidth()/2) - (w/2);
       if(l < 0) l = 0;      
       modif.css({left: l+'px', top: t+'px'});      
       var modi=$('#formodi');
       var a = modi.width();
       var b = modi.height();   
       var c = scrollY() + (windowHeight()/2) - (b/2);
       if(c < 0) c = 0;   
       var d = scrollX() + (windowWidth()/2) - (a/2);
       if(d < 0) d = 0;      
       modi.css({left: d+'px', top: c+'px'});      
       var modify=$('#formodify');
       var e = modify.width();
       var f = modify.height();  
       var g = scrollY() + (windowHeight()/2) - (f/2);
       if(g < 0) g = 0;  
       var i = scrollX() + (windowWidth()/2) - (e/2);
       if(i < 0) i = 0;      
       modify.css({left: i+'px', top: g+'px'});
	})
	function windowHeight() {
    var de = document.documentElement;
    return self.innerHeight || (de && de.clientHeight) || document.body.clientHeight;
}
//浏览器视口的宽度
function windowWidth() {
    var de = document.documentElement;
    return self.innerWidth || (de && de.clientWidth) || document.body.clientWidth
}
function scrollY() {
    var de = document.documentElement;
    return self.pageYOffset || (de && de.scrollTop) || document.body.scrollTop;
}

/* 浏览器水平滚动位置 */
function scrollX() {
    var de = document.documentElement;
    return self.pageXOffset || (de && de.scrollLeft) || document.body.scrollLeft;
}
</script>

  </script>
</body>
</html>
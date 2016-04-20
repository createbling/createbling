<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.util.List" %>
<%@ page import="club.bling.domain.IndustryPostion" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport" content="initial-scale=1.0, user-scalable=no" />
<!-- <style type="text/css">@import url(/web/css/gis.css)</style> -->
<link rel="stylesheet" type="text/css" href="${web}/css/gis.css">
<script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=90pIG6bfMS6vGipBc8m7lukE">
</script>

<title>菌类大棚实时监控平台</title>
</head>
<body>
<%
    List<IndustryPostion> industryPosList = (List<IndustryPostion>)request.getAttribute("industryPosList");
%>
    <div class="header">
         <div class="logo"><img src="${web}/img/logo.png" width="40px" height="40px"></div><h1 class="title">精细农业实时监控平台</h1>
                  <div class="login">
    	     <div class="denglu"><a>点击地图登录</a></div>
         </div>
    </div>

	<div id="allmap"></div>
	<script type="text/javascript"> <%--设置地图高度--%>
	window.onload=function(){
		var map=document.getElementById('allmap');
		var celientheight=document.documentElement.clientHeight;
		var h=map.offsetHeight;<%--//获得原始高--%>
         map.style.height=celientheight-80+'px';<%--//设置高度--%>
	}
  </script>
	<script type="text/javascript">
	<%--百度地图API功能 --%>
	var map = new BMap.Map("allmap");
	var point = new BMap.Point(108.303999,22.890883);
	map.centerAndZoom(point,12);
	
	function addMarker(point,text){
	  //var te = text;
	  var marker = new BMap.Marker(point);
	  marker.setAnimation(BMAP_ANIMATION_BOUNCE); 
	  <%--鼠标移动鼠标移出显示信息 --%>	  
	  marker.addEventListener("mouseover",function(e){  	<%--鼠标移入时间--%>
	        var infoWindow = new BMap.InfoWindow(text);  <%-- 创建信息窗口对象--%>
	        marker.openInfoWindow(infoWindow,point); <%--开启信息窗口--%>
	  });  
	        marker.addEventListener("mouseout",function(e){
	        marker.closeInfoWindow();		<%--鼠标移出关闭信息窗--%>
	  });
	  <%--给地图上的点注册事件，点击进入gisLogin页面判断 */--%>
	  marker.addEventListener("click",forward);
	  map.addOverlay(marker);
	}
	<%--获取被点击的经纬度并传参给后台*/--%>
	function forward(e,infoWindow){
	  <%--用e.target获取点击的目标*/--%>
	  var p = e.target;
	  <%--传递覆盖物点的坐标*/--%>
	  location.href="/web/gisLogin.htm?lng="+ p.getPosition().lng + "&lat=" + p.getPosition().lat;
	}


	<%--/*添加多个点，显示跳动的坐标*/--%>
	<% for(int i=0;i<industryPosList.size();i++){%>
    var point_<%=i%> = new BMap.Point(<%=industryPosList.get(i).getLongitude() %>,<%=industryPosList.get(i).getLatitude() %>);
	var text_<%=i%> = '行业：<%=industryPosList.get(i).getName()%>'+'<br />'+'地点：<%=industryPosList.get(i).getPosition()%>';
    addMarker(point_<%=i%>,text_<%=i%>);
    <% }%>
	
    <%-- 添加带有定位的导航控件--%>
    var navigationControl = new BMap.NavigationControl({
    // 靠左上角位置
    anchor: BMAP_ANCHOR_TOP_LEFT,
    // LARGE类型
    type: BMAP_NAVIGATION_CONTROL_LARGE,
    // 启用显示定位
    enableGeolocation: true
    });
    map.addControl(navigationControl);
    // 添加定位控件
    var geolocationControl = new BMap.GeolocationControl();
    geolocationControl.addEventListener("locationSuccess", function(e){
    // 定位成功事件
    var address = '';
    address += e.addressComponent.province;
    address += e.addressComponent.city;
    address += e.addressComponent.district;
    address += e.addressComponent.street;
    address += e.addressComponent.streetNumber;
    alert("当前定位地址为：" + address);
    });
    geolocationControl.addEventListener("locationError",function(e){
    // 定位失败事件
    alert(e.message);
    });
    map.addControl(geolocationControl);

</script>
	<script type="text/javascript" src="${web}/js/zDrag.js"></script>
    <script type="text/javascript" src="${web}/js/zDialog.js"></script>
	<script type="text/javascript">
	  function open5(){
      var diag = new Dialog();
	  diag.Width = 500;
	  diag.Height = 420;
	  diag.Title = "登陆、注册";
	  diag.URL = "/web/gisLogin.htm";
	  diag.okEvent=function(){};
	  diag.show();
	}
	</script>
</body>
</html>
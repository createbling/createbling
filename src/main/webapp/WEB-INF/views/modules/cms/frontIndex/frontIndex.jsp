<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<%@ page import="java.util.List"%>
<%@ page import="com.createbling.modules.sys.entity.BaseDetail"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html class="cufon-active cufon-ready"
	xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>index</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="initial-scale=1.0, user-scalable=no" />
<link href="${cmsStatic}/favicao.ico" type="image/x-icon"
	rel="shortcut icon" />
<link href="${cmsStatic}/css/style.css" rel="stylesheet" type="text/css">
<link href="${cmsStatic}/css/iconfont.css" rel="stylesheet"
	type="text/css">
<script type="text/javascript"
	src="http://api.map.baidu.com/getscript?v=2.0&amp;ak=90pIG6bfMS6vGipBc8m7lukE&amp;services=&amp;t=20160422121526"></script>
</script>
</head>
<body>
	<%
    List<BaseDetail> baseDetailList = (List<BaseDetail>)request.getAttribute("baseDetailList");
%>
	<!--背景图片，兼容IE-->
	<img class="bgimg" src="${cmsStatic}/images/bodybg.png" />

	<div class="main">
		<!--头部-->
		<div class="header">

			<div class="header_resize">
				<!--logo，标题-->
				<div class="logo">
					<div class="logoimg">
						<img src="${cmsStatic}/images/logo.png" />
					</div>
					<div class="logoname">
						<h2>精细农业实时监控平台</h2>
					</div>
				</div>
				<!--导航条-->
				<div class="menu_nav">
					<ul>
						<li class="active"><a href="${frx}">首页</a></li>
						<li><a href="${frx}/warning.htm">报警</a></li>
						<li><a href="${frx}/comparison.htm">对比分析</a></li>
						<li><a href="${frx}/forecast.htm">预测</a></li>
						<li><a href="${frx}/program.htm">智能方案</a></li>
						<shiro:hasPermission name="admin">
							<li><a href="${ctx}">后台登陆</a></li>
						</shiro:hasPermission>
					</ul>
				</div>

			</div>
			<!--header_resize end-->

		</div>
		<!--header end-->
		<!--头部 结束-->

		<!--主体-->
		<div class="content">

			<div class="content_top">
				<!--日期时间-->
				<div class="time" id="time">
					<ul>
						<li id="time_1" class="calendar"></li>
						<li id="time_2" class="calendar"></li>
						<li id="time_3" class="calendar"></li>
						<li class="calendar"><iframe style="margin-top: -5px;"
								width="160" scrolling="no" height="20" frameborder="0"
								allowtransparency="true"
								src="http://i.tianqi.com/index.php?c=code&id=1&color=%23cccccc&bdc=%23&icon=1&py=nanning&wind=0&num=1"></iframe></li>
					</ul>
				</div>
				<!--用户信息-->
				<div class="user">
					<div class="user_name">
						<p>
							<a href="${frx}/logout">退出</a>
						</p>
					</div>
					<div class="user_name">
						<p>
							Hello! <span>${fns:getUser().name}</span>
						</p>
					</div>
					<div class="user_portrait">
						<img src="${cmsStatic}/images/user_portrait.jpg" />
					</div>
				</div>
			</div>
			<!--content_top end-->

			<div class="content_main">
				<!--基地简介与地图outbox-->
				<div class="outbox">
					<!--基地简介-->
					<div class="introduce">
						<!--基地简介条smallbox-->
						<div class="smallbox">
							<div class="intro_icon">
								<i class="iconfont icon_base">&#xe602;</i>
							</div>
							<div class="intro_content">
								<p class="p_title">
									<span>基地名称</span>
								</p>
								<p class="p_content">广西南宁伊岭岩蘑菇种植基地</p>
							</div>
						</div>

						<div class="smallbox">
							<div class="intro_icon">
								<i class="iconfont icon_base">&#xe618;</i>
							</div>
							<div class="intro_content">
								<p class="p_title">
									<span>作物种类</span>
								</p>
								<p class="p_content">大豆，高粱，水稻，蘑菇</p>
							</div>
						</div>

						<div class="smallbox">
							<div class="intro_icon">
								<i class="iconfont icon_base">&#xe721;</i>
							</div>
							<div class="intro_content">
								<p class="p_title">
									<span>监测参数</span>
								</p>
								<p class="p_content">温度，湿度，CO2</p>
							</div>
						</div>

						<div class="smallbox no-border">
							<div class="intro_icon">
								<i class="iconfont icon_base">&#xe756;</i>
							</div>
							<div class="intro_content">
								<p class="p_title">
									<span>当前时期</span>
								</p>
								<p class="p_content">蘑菇收货期</p>
							</div>
						</div>

					</div>
					<!--基地简介 end-->
					<!--地图-->
					<div class="map" id="allmap"></div>
				</div>
				<!--outbox end-->
				<!--选择作物-->
				<!--作物选择 end-->

				<!--温度-->
				<div class="databox">
					<!--温度数据监测信息-->
					<div class="data left">
						<div class="data_top">
							<p>实时温度</p>
						</div>
						<div class="data_main" id="temp"></div>
					</div>
					<!--温度监控设备信息-->
					<div class="equipment right">
						<div class="data_top">
							<p>温度传感器电压</p>
						</div>
						<div class="equip_main">
							<!--标准值-->
							<div class="valuebox">
								<p>
									<span>电压标准值</span>
								</p>
								<div class="value">
									<i class="iconfont">&#xe601;</i> <span>45</span> <b>/V</b>
								</div>
							</div>
							<!--当前值-->
							<div class="valuebox">
								<p>
									<span class="b_qing">当前电压值</span>
								</p>
								<div class="value qing">
									<i class="iconfont qing">&#xe601;</i> <span class="qing"
										id="temvol">43</span> <b class="qing">/V</b>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!--温度 end-->

				<!--湿度-->
				<div class="databox">
					<!--湿度数据监测信息-->
					<div class="data right">
						<div class="data_top">
							<p>实时湿度</p>
						</div>
						<div class="data_main" id="humidity"></div>
					</div>
					<!--湿度监控设备信息-->
					<div class="equipment left">
						<div class="data_top">
							<p>湿度传感器电压</p>
						</div>
						<div class="equip_main">
							<!--标准值-->
							<div class="valuebox">
								<p>
									<span>标准值</span>
								</p>
								<div class="value">
									<i class="iconfont">&#xe601;</i><span>45</span><b>/V</b>
								</div>
							</div>
							<!--当前值-->
							<div class="valuebox">
								<p>
									<span class="b_qing">当前值</span>
								</p>
								<div class="value qing">
									<i class="iconfont qing">&#xe601;</i><span class="qing"
										id="humvol">43</span><b class="qing">/V</b>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!--湿度 end-->

				<!--CO2-->
				<div class="databox">
					<!--CO2数据监测信息-->
					<div class="data left">
						<div class="data_top">
							<p>实时co2</p>
						</div>
						<div class="data_main" id="co2"></div>
					</div>
					<!--CO2监控设备信息-->
					<div class="equipment right">
						<div class="data_top">
							<p>co2传感器电压</p>
						</div>
						<div class="equip_main">
							<!--标准值-->
							<div class="valuebox">
								<p>
									<span>标准值</span>
								</p>
								<div class="value">
									<i class="iconfont">&#xe601;</i><span>45</span><b>/V</b>
								</div>
							</div>
							<!--当前值-->
							<div class="valuebox">
								<p>
									<span class="b_qing">当前值</span>
								</p>
								<div class="value qing">
									<i class="iconfont qing">&#xe601;</i><span class="qing"
										id="c02vol">43</span><b class="qing">/V</b>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!--CO2 end-->

			</div>
			<!--content_main end-->

		</div>
		<!--content end-->
		<!--主体 结束-->

		<div class="clr"></div>
		<!--尾部-->
		<div class="footer">
			<div class="footer_resize">
				<p>© 版权所有 广西大学精细农业研究室</p>
				<div class="clr"></div>
			</div>
		</div>
		<!--尾部 结束-->
	</div>
	<!--main end-->

	<script type="text/javascript"
		src="${cmsStatic}/js/jquery-1.9.1.min.js"></script>
	<script type="text/javascript" src="${cmsStatic}/js/date.js"></script>
	<script src="${cmsStatic}/js/highcharts.js"></script>
	<!--图表-->
	<script type="text/javascript">
$(function () {
  $.getJSON('http://www.highcharts.com/samples/data/jsonp.php?filename=aapl-c.json&callback=?', function (data) {

    $('#temp').highcharts({
            chart:{
              backgroundColor:'#F5F5F5'
            },
            title : {
                text : '节点一'
            },
            credits:{
                enabled:false
            },  
            yAxis: {
            max:Math.round(133+(133/7)),
            min:0,
            tickInterval:(133/7),
            title: {
                text: 'Temperature (°C)'
            }
        },

            series : [{
                name : '温度',
                data : data,
                type : 'area',
                threshold : null,
                tooltip : {
                    valueDecimals : 2
                },
                fillColor : {
                    linearGradient : {
                        x1: 0,
                        y1: 0,
                        x2: 0,
                        y2: 1
                    },
                    stops : [
                        [0, Highcharts.getOptions().colors[0]],
                        [1, Highcharts.Color(Highcharts.getOptions().colors[0]).setOpacity(0).get('rgba')]
                    ]
                }
            }]
 
    });});});//图表1
</script>

	<script type="text/javascript">
$(function () {
  $.getJSON('http://www.highcharts.com/samples/data/jsonp.php?filename=aapl-c.json&callback=?', function (data) {

    $('#humidity').highcharts({
            chart:{
              backgroundColor:'#F5F5F5'
            },
            title : {
                text : '节点一'
            },
            credits:{
                enabled:false
            },
            yAxis: {
            max:Math.round(133+(133/7)),
            min:0,
            tickInterval:(133/7),
            title: {
                text: 'Temperature (°C)'
            }
        },

            series : [{
                name : '温度',
                data : data,
                type : 'area',
                threshold : null,
                tooltip : {
                    valueDecimals : 2
                },
                fillColor : {
                    linearGradient : {
                        x1: 0,
                        y1: 0,
                        x2: 0,
                        y2: 1
                    },
                    stops : [
                        [0, Highcharts.getOptions().colors[0]],
                        [1, Highcharts.Color(Highcharts.getOptions().colors[0]).setOpacity(0).get('rgba')]
                    ]
                }
            }]
 
    });});});//图表2
</script>

	<script type="text/javascript">
$(function () {
  $.getJSON('http://www.highcharts.com/samples/data/jsonp.php?filename=aapl-c.json&callback=?', function (data) {

    $('#co2').highcharts({
            chart:{
              backgroundColor:'#F5F5F5'
            },
            title : {
                text : '节点一'
            },
            credits:{
                enabled:false
            },
            yAxis: {
            max:Math.round(133+(133/7)),
            min:0,
            tickInterval:(133/7),
            title: {
                text: 'Temperature (°C)'
            }
        },

            series : [{
                name : '温度',
                data : data,
                type : 'area',
                threshold : null,
                tooltip : {
                    valueDecimals : 2
                },
                fillColor : {
                    linearGradient : {
                        x1: 0,
                        y1: 0,
                        x2: 0,
                        y2: 1
                    },
                    stops : [
                        [0, Highcharts.getOptions().colors[0]],
                        [1, Highcharts.Color(Highcharts.getOptions().colors[0]).setOpacity(0).get('rgba')]
                    ]
                }
            }]
 
    });});});//图表3
</script>

	<!--地图-->
	<script type="text/javascript">
	<%--百度地图API功能 --%>
	var map = new BMap.Map("allmap");
	var point = new BMap.Point(108.279388,23.01462);
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
	<% for(int i=0;i<baseDetailList.size();i++){%>
    var point_<%=i%> = new BMap.Point(<%=baseDetailList.get(i).getLongitude() %> ,<%=baseDetailList.get(i).getLatitude() %>);
	var text_<%=i%> = '行业：<%=baseDetailList.get(i).getText()%>'+'<br />'+'地点：<%=baseDetailList.get(i).getText() %>'+'<br />'+'<%=baseDetailList.get(i).getAk() %>';
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
	<!--电压变化-->
	<script type="text/javascript">
  $(function(){
    
    function change(){
      var temvol=$('#temvol');
      var humvol=$('#humvol');
      var co2vol=$('#co2vol');
      var num1=Math.round(Math.random()+43);
      var num2=Math.round(Math.random()+43);
      var num3=Math.round(Math.random()+43);
      temvol.html(num1);
      humvol.html(num2);
      co2vol.html(num3);
      setTimeout(change,3000);
    }
    change();
  })
</script>
</body>
</html>
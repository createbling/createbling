<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html class="cufon-active cufon-ready"
	xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>报警</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${cmsStatic}/favicao.ico" type="image/x-icon"
	rel="shortcut icon" />
<link href="${cmsStatic}/css/style.css" rel="stylesheet" type="text/css">
<link href="${cmsStatic}/css/bootstrap.min.css" rel="stylesheet">
<link href="${cmsStatic}/css/style.min.css" rel="stylesheet">
<!-- CuFon ends -->

</head>
<body>

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
						<li><a href="${frx}">首页</a></li>
						<li class="active"><a href="${frx}/warning.htm">报警</a></li>
						<li><a href="${frx}/comparison.htm">对比分析</a></li>
						<li><a href="${frx}/forecast.htm">预测</a></li>
						<li><a href="${frx}/program.htm">智能方案</a></li>
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

			<div class="row">

				<div class="col-lg-9 col-md-12">

					<div class="panel panel-default">

						<div class="panel-heading">
							<i class="fa fa-refresh red"></i>
							<h2>
								<strong></strong>
							</h2>

							<div class="panel-actions">
								<a href="index.html#" class="btn-setting"><i
									class="fa fa-rotate-right"></i></a> <a href="index.html#"
									class="btn-minimize"><i class="fa fa-chevron-up"></i></a> <a
									href="index.html#" class="btn-close"><i class="fa fa-times"></i></a>
							</div>
						</div>

						<div class="panel-body">
							</br/>
							<div id="realtime-update" style="height: 400px; color: #484848;">

								<div id="container" style="min-width: 700px; height: 400px"></div>
							</div>
						</div>
					</div>
				</div>
				<!--/col-->
				<div class="col-lg-3 col-md-12" style="padding-left: 0px">
					<div class="panel panel-default">
						<div class="panel-body white-bg">
							</br/>
							<div class="graph-container text-center">
								<div id="hero-donut" class="graph" style="height: 436px;"></div>
							</div>
						</div>
					</div>
				</div>
				<!--/.col-->

			</div>
			<!--/.row-->

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
	</div>

	<script src="${cmsStatic}/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="${cmsStatic}/js/exporting.js"></script>
	<script type="text/javascript"
		src="${cmsStatic}/js/jquery-1.9.1.min.js"></script>
	<script type="text/javascript" src="${cmsStatic}/js/highcharts.js"></script>
	<script type="text/javascript" src="${cmsStatic}/js/date.js"></script>
	<!--日期、星期-->
	<script type="text/javascript">
  $(function () {
    
    $('#container').highcharts({
        title: {
            text: 'Monthly Average Temperature',
            x: -20 //center
        },
        subtitle: {
            text: 'Source: WorldClimate.com',
            x: -20
        },
        xAxis: {
            categories: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun','Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']
        },
        yAxis: {
            title: {
                text: 'Temperature (°C)'
            },
            plotLines: [{
                value: 0,
                width: 1,
                color: '#808080'
            }]
        },
        tooltip: {
            valueSuffix: '°C'
        },
        legend: {
            layout: 'vertical',
            align: 'right',
            verticalAlign: 'middle',
            borderWidth: 0
        },
        series: [{
            name: 'Tokyo',
            data: [7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6]
        }, {
            name: 'New York',
            data: [-0.2, 0.8, 5.7, 11.3, 17.0, 22.0, 24.8, 24.1, 20.1, 14.1, 8.6, 2.5]
        }, {
            name: 'Berlin',
            data: [-0.9, 0.6, 3.5, 8.4, 13.5, 17.0, 18.6, 17.9, 14.3, 9.0, 3.9, 1.0]
        }, {
            name: 'London',
            data: [3.9, 4.2, 5.7, 8.5, 11.9, 15.2, 17.0, 16.6, 14.2, 10.3, 6.6, 4.8]
        }]
    });
});
				
</script>
	<script type="text/javascript">
$(function () {

    $(document).ready(function () {

        // Build the chart
        $('#hero-donut').highcharts({
            chart: {
                plotBackgroundColor: null,
                plotBorderWidth: null,
                plotShadow: false,
                type: 'pie'
            },
            title: {
                text: 'Browser market shares January, 2015 to May, 2015'
            },
            tooltip: {
                pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>'
            },
            plotOptions: {
                pie: {
                    allowPointSelect: true,
                    cursor: 'pointer',
                    dataLabels: {
                        enabled: false
                    },
                    showInLegend: true
                }
            },
            series: [{
                name: "Brands",
                colorByPoint: true,
                data: [{
                    name: "Microsoft Internet Explorer",
                    y: 56.33
                }, {
                    name: "Chrome",
                    y: 24.03,
                    sliced: true,
                    selected: true
                }, {
                    name: "Firefox",
                    y: 10.38
                }, {
                    name: "Safari",
                    y: 4.77
                }, {
                    name: "Opera",
                    y: 0.91
                }, {
                    name: "Proprietary or Undetectable",
                    y: 0.2
                }]
            }]
        });
    });
});
    </script>
</body>
</html>
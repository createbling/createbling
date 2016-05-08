<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html class="cufon-active cufon-ready" xmlns="http://www.w3.org/1999/xhtml"><head>
<title>对比分析</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${cmsStatic}/favicao.ico" type="image/x-icon" rel="shortcut icon"  />
<link href="${cmsStatic}/css/style.css" rel="stylesheet" type="text/css">
<link href="${cmsStatic}/css/comparison.css" rel="stylesheet" type="text/css"  />
<script type="text/javascript" src="${cmsStatic}/js/jquery-1.9.1.min.js"></script>
<script src="${ctxStatic}/common/mustache.min.js" type="text/javascript"></script>
<script src="${ctxStatic}/treeTable/jquery.treeTable.min.js" type="text/javascript"></script>
<script type="text/javascript">
		$(function() {
			//alert('h');
			var areaListMap = '${areaListMap}';
			var tpl = $("#treeTableTpl").html().replace(/(\/\/\<!\-\-)|(\/\/\-\->)/g,"");
			var data = ${fns:toJson(areaListMap)}, rootId = "${not empty area.id ? area.id : '0'}";/////
			var length = data.length;
			//alert(length);
			//alert(data[0].pId);
			addRow("#treeTableList", tpl, data, rootId, true);
			$("#treeTable").treeTable({expandLevel : 5});
		});
		function addRow(list, tpl, data, pid, root){
			for (var i=0; i<data.length; i++){
				var row = data[i];
				if ((${fns:jsGetVal('row.pId')}) == pid){
					//alert("hah"+pid);
					$(list).append(Mustache.render(tpl, {
						pid: (root?0:pid), row: row
					}));
					addRow(list, tpl, data, row.id);
				}
			}
		}
	</script>
</head>
<body>
<!--背景图片，兼容IE-->
<img class="bgimg" src="${cmsStatic}/images/bodybg.png" />

<div class="main">
<!--头部-->
  <div class="header">

    <div class="header_resize">
<!--logo，标题-->
      <div class="logo">
        <div class="logoimg"><img src="${cmsStatic}/images/logo.png" /></div>
        <div class="logoname"><h2>精细农业实时监控平台</h2></div>
      </div>
<!--导航条-->
      <div class="menu_nav">
        <ul>
          <li><a href="${frx}">首页</a></li>
          <li><a href="${frx}/warning.htm">报警</a></li>
          <li class="active"><a href="${frx}/comparison.htm">对比分析</a></li>
          <li><a href="${frx}/forecast.htm">预测</a></li>
          <li><a href="${frx}/program.htm">智能方案</a></li>
          <shiro:hasPermission name="admin">
              <li><a href="${ctx}">后台登陆</a></li>
          </shiro:hasPermission>
        </ul>
      </div>

    </div><!--header_resize end-->

  </div><!--header end-->
<!--头部 结束-->

<!--主体-->
  <div class="content">

    <div class="content_top">
<!--日期时间-->    
      <div class="time" id="time" >
        <ul>
          <li id="time_1" class="calendar"></li>
          <li id="time_2" class="calendar"></li>
          <li id="time_3" class="calendar"></li>
          <li class="calendar"><iframe style="margin-top:-5px;" width="180" scrolling="no" height="20" frameborder="0" allowtransparency="true" src="http://i.tianqi.com/index.php?c=code&id=1&color=%23cccccc&bdc=%23&icon=1&py=nanning&wind=0&num=1"></iframe></li>
        </ul>
      </div>
<!--用户信息-->
      <div class="user">
        <div class="user_name"><p><a href="${frx}/logout">退出</a></p></div>
        <div class="user_name"><p>Hello! <span>${fns:getUser().name}</span></p></div>
        <div class="user_portrait"><img src="${cmsStatic}/images/user_portrait.jpg" /></div>
      </div>
    </div><!--content_top end-->

    <div class="content_main">
              <div class="con_left" id="con_left" style="margin-top:20px;">
         
        <div class="tr_on" id="tr_on"></div>
        <div class="tr_dec" id="tr_dec"></div>

         <table id="treeTable" class="">

             <tbody id="treeTableList">
               
             </tbody>
         </table>
         <script type="text/template" id="treeTableTpl">
		 <tr id="{{row.id}}" pId="{{pid}}">
			<td>{{row.name}}</td>
		</tr>
	</script>
	
	<script type="text/javascript">
	 $(function(){
		 var con_left=document.getElementById('con_left');
		 //var plant=con_left.getElementsByTagName('tr');
		 var area=$('tr[pid=0]');
		 //alert(area.length);
		 var allPlant=$('tr[depth=2]');
		 allPlant.hide();
		 for(var i=0; i<area.length; i++){
			 $(area[i]).click(function(){
				 allPlant.hide();
				 var areaId=$(this).attr('id');
				 //alert(areaId);
				 var plant=$("tr[pid="+areaId+"]");
				 //alert(plant.text());
				 plant.slideDown(500);
			 })
		 }
		 
	 })
	</script>

        
    </div><!--左侧 end-->
    <!--右侧-->
    <div class="con_right">
        <ul class="cbp_tmtimeline">
          <li>
            <time class="cbp_tmtime" datetime="2013-04-10 18:30"><span>
            专家提醒您：</span> <span>杏鲍菇和凤尾菇可统一管理</span></time>
            <div class="cbp_tmicon cbp_tmicon-phone"></div>
            <div class="cbp_tmlabel" id="high1"></div>
          </li>

          <li>
            <time class="cbp_tmtime" datetime="2013-04-11T12:04"><span>
            专家提醒您：</span> <span>杏鲍菇和凤尾菇可统一管理</span></time>
            <div class="cbp_tmicon cbp_tmicon-screen"></div>
            <div class="cbp_tmlabel" id="high2"></div>
          </li>

          <li>
            <time class="cbp_tmtime" datetime="2013-04-13 05:36"><span>
            专家提醒您：</span> <span>杏鲍菇和凤尾菇可统一管理</span></time>
            <div class="cbp_tmicon cbp_tmicon-mail"></div>
            <div class="cbp_tmlabel" id="high3"></div>
          </li>

          <li>
            <time class="cbp_tmtime" datetime="2013-04-15 13:15"><span>
            专家提醒您：</span> <span>杏鲍菇和凤尾菇可统一管理</span></time>
            <div class="cbp_tmicon cbp_tmicon-phone"></div>
            <div class="cbp_tmlabel"></div>
          </li>
          
        </ul>
        </div>
    </div><!--content_main end-->

  </div><!--content end-->
<!--主体 结束-->

  <div class="clr"></div>
<!--尾部-->
  <div class="footer">
    <div class="footer_resize">
      <p>© 版权所有  ${fns:getConfig('productName')}</p>
      <div class="clr"></div>
    </div>
  </div>
<!--尾部 结束-->
</div>
<!--main end-->

<script type="text/javascript" src="${cmsStatic}/js/date.js"></script>
<script src="${cmsStatic}/js/modernizr.custom.js"></script>
<script src="${cmsStatic}/js/highcharts.js"></script>

<!--con_left 到顶后fixed-->
<script type="text/javascript">
$(function() {
    var elm = $('#con_left');
    var startPos = $(elm).offset().top;
    $.event.add(window, "scroll", function() {
        var p = $(window).scrollTop();
        $(elm).css('position',((p) > startPos) ? 'fixed' : 'relative');
        $(elm).css('top',((p) > startPos) ? '0px' : '');
    });
});

</script>

<script type="text/javascript">
  $(function () {
	  $.getJSON("/createbling/f/comparison?base_id=${base_id}", function (data){
		  var objs=eval(data);   
			
		  $('#high1').highcharts({
        title: {
            text: '温度对比分析',
            x: -20 //center
        },
        credits: {
            text: 'CreateBling.com',
            href: 'http://www.CreateBling.com'
        },
        subtitle: {
            text: '杏鲍菇和凤尾菇温度走势比较接近',
            x: -20
        },
        xAxis: {
            categories: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun',
                'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']
        },
        yAxis: {
            title: {
                text: '温度 (°C)'
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
        series: [objs[0],objs[1],objs[2]]
    });

$('#high2').highcharts({
        title: {
            text: '湿度对比分析',
            x: -20 //center
        },
        credits: {
            text: 'CreateBling.com',
            href: 'http://www.CreateBling.com'
        },
        subtitle: {
            text: '杏鲍菇和凤尾菇湿度变化趋势基本吻合',
            x: -20
        },
        xAxis: {
            categories: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun',
                'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']
        },
        yAxis: {
            title: {
                text: '湿度 (%)'
            },
            plotLines: [{
                value: 0,
                width: 1,
                color: '#808080'
            }]
        },
        tooltip: {
            valueSuffix: '%'
        },
        legend: {
            layout: 'vertical',
            align: 'right',
            verticalAlign: 'middle',
            borderWidth: 0
        },
        series: [objs[3],objs[4],objs[5]]
    });

$('#high3').highcharts({
        title: {
            text: 'CO2浓度对比分析',
            x: -20 //center
        },
        credits: {
            text: 'CreateBling.com',
            href: 'http://www.CreateBling.com'
        },
        subtitle: {
            text: '杏鲍菇和凤尾菇对CO2浓度的要求接近',
            x: -20
        },
        xAxis: {
            categories: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun',
                'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']
        },
        yAxis: {
            title: {
                text: 'CO2浓度 (%)'
            },
            plotLines: [{
                value: 0,
                width: 1,
                color: '#808080'
            }]
        },
        tooltip: {
            valueSuffix: '%'
        },
        legend: {
            layout: 'vertical',
            align: 'right',
            verticalAlign: 'middle',
            borderWidth: 0
        },
        series: [objs[6],objs[7],objs[8]]
    });

	  })
});
  
</script>




</body>
</html>
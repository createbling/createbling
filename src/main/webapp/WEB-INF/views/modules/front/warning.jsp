<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html class="cufon-active cufon-ready" xmlns="http://www.w3.org/1999/xhtml"><head>
<title>报警</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${cmsStatic}/favicao.ico" type="image/x-icon" rel="shortcut icon"  />
<link href="${cmsStatic}/css/style.css" rel="stylesheet" type="text/css">
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
<style>
.con_left{
height:450px;
}
  .content_right{
  width:80%;
  float:right;
  padding-bottom:20px;
  overflow:hidden;
  }
  .warningbox1{
    width:70%;
    float:left;
  }
  .warningbox2{
  width:28%;
  float:right;
  }
  .box_top{
  width:99%;
  height:40px;
  background:#f5f5f5;
  }
  .box_top p{
  }
  .box_main{
  width:100%;
  height:450px;
  }
</style>

</head>
<body>

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
          <li class="active"><a href="${frx}/warning.htm">报警</a></li>
          <li><a href="${frx}/comparison.htm">对比分析</a></li>
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

  <div class="content">

    <div class="content_top">
<!--日期时间-->    
      <div class="time" id="time" >
        <ul>
          <li id="time_1" class="calendar"></li>
          <li id="time_2" class="calendar"></li>
          <li id="time_3" class="calendar"></li>
          <li class="calendar"><iframe style="margin-top:-5px;" width="160" scrolling="no" height="20" frameborder="0" allowtransparency="true" src="http://i.tianqi.com/index.php?c=code&id=1&color=%23cccccc&bdc=%23&icon=1&py=nanning&wind=0&num=1"></iframe></li>
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
       
       <div class="con_left" id="con_left">
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
    
    <div class="content_right">
    
       <div class="warningbox1">
         <!-- <div class="box_top"><p>很好</p></div> -->
         <div class="box_main" id="container"></div>
       </div>
       
       <div class="warningbox2">
         <!-- <div class="box_top"><p>很好</p></div> -->
         <div class="box_main" id="hero-donut"></div>
       </div>
    </div><!-- right end -->
    

    </div><!-- content_main end -->

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
</div>

<script src="${cmsStatic}/js/bootstrap.min.js"></script>	
<script type="text/javascript" src="${cmsStatic}/js/exporting.js"></script> 

<script type="text/javascript" src="${cmsStatic}/js/highcharts.js"></script>
<script type="text/javascript" src="${cmsStatic}/js/date.js"></script>

<script type="text/javascript">
<!-- Ajax获取数据 -->
$(function(){
	var result="";
 	$.ajax({  
      	 url: '${frx}'+'/loadPageData',  
      	 type: 'get',  
      	 data: 'id=',
      	 async: false,
      	 dataType: "json",  
         contentType: "application/json;charset=UTF-8",   
      	 beforeSend: LoadFunction, //加载执行方法    
      	 error: erryFunction,  //错误执行方法    
      	 success: succFunction //成功执行方法    
      	 });  
 	
 	//alert();
      	function LoadFunction() {  
      		$("#list").html('加载中...');  }  
      	function erryFunction() {  
      		alert("error");}  
      	function succFunction(data) { 
      		
    		}
})
</script>

<script type="text/javascript">
  $(function () {
    
    $('#container').highcharts({
    	   credits: {
               text: 'CreateBling.com',
               href: 'http://www.CreateBling.com'
           },
        title: {
            text: '2015年度每月报警次数统计图',
            x: -20 //center
        },
        subtitle: {
            text: '',
            x: -20
        },
        xAxis: {
            categories: ['1月', '2月', '3月', '4月', '5月', '6月','7月', '8月', '9月', '10月', '11月', '12月']
        },
        yAxis: {
            title: {
                text: '报警次数'
            },
            plotLines: [{
                value: 0,
                width: 1,
                color: '#808080'
            }]
        },
        tooltip: {
            valueSuffix: '次'
        },
        legend: {
            layout: 'vertical',
            align: 'right',
            verticalAlign: 'middle',
            borderWidth: 0
        },
        series: [{
            name: '温控设备',
            data: [7, 6, 9, 14, 18, 21, 25, 26, 23, 18, 13, 9]
        }, {
            name: '供水设备',
            data: [11, 8, 7, 11, 17, 22, 24, 24, 20, 14, 8, 5]
        }, {
            name: '加湿设备',
            data: [9, 6, 5, 8, 13, 17, 18, 17, 14, 9, 3, 6]
        }, {
            name: '光控设备',
            data: [9, 4, 7, 8, 11, 15, 17, 16, 14, 10, 6,8]
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
            credits: {
                text: 'CreateBling.com',
                href: 'http://www.CreateBling.com'
            },
            title: {
                text: '各设备报警次数百分比统计图'
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
                name: "百分比",
                colorByPoint: true,
                data: [{
                    name: "温控设备",
                    y: 30.91,
                    sliced: true,
                    selected: true
                }, {
                    name: "光控设备",
                    y: 20.03
                }, {
                    name: "供水设备",
                    y: 28.09
                }, {
                    name: "加湿设备",
                    y: 21.97
                }]
            }]
        });
    });
});
    </script>
</body>
</html>
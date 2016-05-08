<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<%@ page import="java.util.List" %>
<%@ page import="com.createbling.modules.sys.entity.BaseDetail" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html class="cufon-active cufon-ready" xmlns="http://www.w3.org/1999/xhtml"><head>
<title>index</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="initial-scale=1.0, user-scalable=no" />
<link href="${cmsStatic}/favicao.ico" type="image/x-icon" rel="shortcut icon"  />
<link href="${cmsStatic}/css/style.css" rel="stylesheet" type="text/css">
<link href="${cmsStatic}/css/iconfont.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="${cmsStatic}/js/jquery-1.9.1.min.js"></script>
<script src="${ctxStatic}/common/mustache.min.js" type="text/javascript"></script>
	<script type="text/javascript" src="http://api.map.baidu.com/getscript?v=2.0&amp;ak=90pIG6bfMS6vGipBc8m7lukE&amp;services=&amp;t=20160422121526"></script>
</script>
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
<%--
    List<BaseDetail> baseDetailList = (List<BaseDetail>)request.getAttribute("baseDetailList");
--%>
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
          <li class="calendar"><iframe style="margin-top:-5px;" width="160" scrolling="no" height="20" frameborder="0" allowtransparency="true" src="http://i.tianqi.com/index.php?c=code&id=1&color=%23cccccc&bdc=%23&icon=1&py=nanning&wind=0&num=1"></iframe></li>
        </ul>
      </div>
<!--用户信息-->
      <div class="user">
        <div class="user_name"><p><a href="${frx}/logout">退出</a></p></div>
        <div class="user_name"><p>Hello! <span>${fns:getUser().name}</span></p></div>
        <div class="user_portrait"><img src="${fns:getUser().photo}" /></div>
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
<!--右侧-->
    <div class="con_right">
  <!--基地简介与地图outbox-->
      <div class="outbox">
 <!--基地简介-->
        <div class="introduce">
<!--基地简介条smallbox-->
          <div class="smallbox">
            <div class="intro_icon"><i class="iconfont icon_base">&#xe602;</i></div>
            <div class="intro_content">
              <p class="p_title"><span>基地名称</span></p>
              <p class="p_content" id="area_name">广西南宁伊岭岩蘑菇种植基地</p>
            </div>
          </div>

          <div class="smallbox">
            <div class="intro_icon"><i class="iconfont icon_base">&#xe618;</i></div>
            <div class="intro_content">
              <p class="p_title"><span>作物种类</span></p>
              <p class="p_content" id="plant_name">大豆，高粱，水稻，蘑菇</p>
            </div>
          </div>

          <div class="smallbox">
            <div class="intro_icon"><i class="iconfont icon_base">&#xe721;</i></div>
            <div class="intro_content">
              <p class="p_title"><span>监测参数</span></p>
              <p class="p_content" id="param_name">温度，湿度，CO2</p>
            </div>
          </div>

          <div class="smallbox no-border">
            <div class="intro_icon"><i class="iconfont icon_base">&#xe756;</i></div>
            <div class="intro_content">
              <p class="p_title"><span>当前时期</span></p>
              <p class="p_content" id="cycle_name">蘑菇收货期</p>
            </div>
          </div>

        </div> <!--基地简介 end-->
<!--地图-->
        <div class="map" id="allmap"></div>
      </div><!--outbox end-->

      <%--这里的内容应该与后台配置相匹配 --%>


      <!--作物选择-->
       <div class="crop_chose" id="crop_chose">
         <div class="chosetitle">请选择参数：</div>
         <div class="chose_con" id="chose_con">
           
         </div>
       </div>
       <!--作物选择 end-->
      
     

      <div class="databox">
          <div class="data left">
            <div class="data_top"><p id="data_top"></p></div>
            <div class="data_main" id="container"></div>
          </div>
          <div class="equipment right">
            <div class="data_top"><p id="voltage_top"></p></div>
            <div class="equip_main">
              <div class="valuebox">
                <p><span>电压标准值</span></p>
                <div class="value">
                   <i class="iconfont">&#xe601;</i>
                   <span>45</span>
                   <b>/V</b>
                </div>
              </div>
              <div class="valuebox">
                <p><span class="b_qing">当前电压值</span></p>
                <div class="value qing">
                  <i class="iconfont qing">&#xe601;</i>
                  <span class="qing" id="temvol">43</span>
                  <b class="qing">/V</b>
                </div>
              </div>
            </div>
          </div>
      </div>
  </div><!--con_right end-->


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

<!--地图-->
<script type="text/javascript">
	<%--百度地图API功能 --%>
	var map = new BMap.Map("allmap");
	function addMarker(point,text){
		
		//var point = new BMap.Point(108.279388,23.01462);
		map.centerAndZoom(point,12);
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
	  //location.href="/web/gisLogin.htm?lng="+ p.getPosition().lng + "&lat=" + p.getPosition().lat;
	}
	
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

<script type="text/javascript">
<!-- Ajax获取数据 -->
$(function(){
	ajax("");
	function ajax(dataajax){
		var result="";
	 	$.ajax({  
	      	 url: '${frx}'+'/loadPageData',  
	      	 type: 'get',  
	      	 data: 'id='+dataajax,
	      	 async: false,
	      	 dataType: "json",  
	         contentType: "application/json;charset=UTF-8",   
	      	 beforeSend: LoadFunction, //加载执行方法    
	      	 error: erryFunction,  //错误执行方法    
	      	 success: succFunction //成功执行方法    
	      	 });  
	 	
	}

      	function LoadFunction() {  
      		$("#list").html('加载中...');  }  
      	function erryFunction() {  
      		alert("error");}  
      	function succFunction(data) { 
      		var area_name=$('#area_name');
      		var plant_name=$('#plant_name');
      		var param_name=$('#param_name');
      		var cycle_name=$('#cycle_name');
      		area_name.text(data.base.name);
      		plant_name.text(data.plant.name);
      		//监测的参数
      		var paramNameList="";
      		$('.crop_box').remove(); //先删除先前创建的参数选择框
      		if(data.paramList.length==0){
      			$('.databox').hide();
      			var height_outbox=$('.outbox').height();
      		    $('#con_left').css("height",height_outbox+"px");
      		}
      		else{
      			$('.databox').show();
      			$('#con_left').css("height","570px");
      		  for(var i=0;i<data.paramList.length; i++){
      			paramNameList = paramNameList + data.paramList[i].name +",";
      			$("<div class=\"crop_box\">"+data.paramList[i].name+"</div>").appendTo($('#chose_con'));
      			
      		  }
      		param_name.text(paramNameList);
      		}
      	//当前时期
      		var cycleNameList="";
      		for(var i=0;i<data.cycleList.length; i++){
      			cycleNameList = cycleNameList + data.cycleList[i].name +",";
      		}
      		cycle_name.text(cycleNameList);
      	//地图坐标更新
      	map.clearOverlays();
      	var newpoint= new BMap.Point(data.base.longitude ,data.base.latitude);
    	var text = '基地：'+data.base.name+'<br />'+'地点：'+data.base.location;
        addMarker(newpoint,text);
      	//参数列表点击显示相应图表
	       result=data.paramList;
      		$('#data_top').text('实时'+result[0].name);
 	       $('#voltage_top').text(result[0].name+"传感器电压");
 	       newChart(result[0].name);
    		}
    
 //参数选择     	
 $(document).on('click','.crop_box',function(){
      		//alert('haha');
      		//样式变化
      		$(this).siblings().removeClass('crop_active');
      		$(this).addClass('crop_active');
      		//变更参数信息
      		var index=$(this).index();
      		var chartTitle=result[index].name; //
      		if(chartTitle){
      		//图表框头部标题
      		$('#data_top').text('实时'+chartTitle);
      		//电压头部标题
      		$('#voltage_top').text(chartTitle+"传感器电压");
      		//更新图表
      		 newChart(chartTitle);
      		}
      	})
 //作物选择
$('tr[depth=2]').click(function(){
			 $(this).siblings().removeClass('tr_active');
			 $(this).addClass('tr_active');
			 var plantid=$(this).attr('id');
			 //var area=$(this).prevAll('tr[id='+plantPid+']');
			 //var areaId=area.attr('id');
			 //alert(typeof(areaId));
			 ajax(plantid);
		 })
  	
})  


 function newChart(indexTitle){
	  //var Title=result[0].name;
                  Highcharts.setOptions({
                      global: {
                          useUTC: false
                      },
                      colors: ['#24CBE5','#DDDF00','#ED561B', '#64E572', '#FF9655', '#FFF263', '#6AF9C4','#058DC7','#50B432']
                  });
				
              	$('#container').highcharts({
                      credits: {
                          enabled: false
                      },
                      lang:{
                          contextButtonTitle:"图表导出菜单",
                          decimalPoint:".",
                          downloadJPEG:"下载JPEG图片",
                          downloadPDF:"下载PDF文件",
                          downloadPNG:"下载PNG文件",
                          downloadSVG:"下载SVG文件",
                          drillUpText:"返回 {series.name}",
                          loading:"加载中",
                          months:["一月","二月","三月","四月","五月","六月","七月","八月","九月","十月","十一月","十二月"],
                          noData:"没有数据",
                          numericSymbols: [ "千" , "兆" , "G" , "T" , "P" , "E"],
                          printChart:"打印图表",
                          resetZoom:"恢复缩放",
                          resetZoomTitle:"恢复图表",
                          shortMonths: [ "Jan" , "Feb" , "Mar" , "Apr" , "May" , "Jun" , "Jul" , "Aug" , "Sep" , "Oct" , "Nov" , "Dec"],
                          thousandsSep:",",
                          weekdays: ["星期一", "星期二", "星期三", "星期三", "星期四", "星期五", "星期六","星期天"]
                       },
                      chart: {
                          renderTo: 'container',
                          type: 'spline',
                          animation: Highcharts.svg, // don't animate in old IE
                          marginRight: 10,
                          borderWidth: 0,
                          borderRadius: 15,
                          plotBackgroundColor: null,
                          plotShadow: false,
                          plotBorderWidth: 0,
						  events: {                                                           
                              load: function() {                                                                                                                                                         var series = this.series[0];                                
                                  setInterval(function() {                                    
                                  var x = (new Date()).getTime(), y = Math.floor(Math.random()*(40-20+1)+20);                            
                                  series.addPoint([x, y], true, true);                    
                          }, 1000); }} 
                      },
                      title: {
                          text: indexTitle,
                          style: { color: '#333333', fontSize: '18px' }
                      },
                      xAxis: {
                          title: {
                              text: '当前时间(s)',
                              style: { color: '#333' }
                          },  
                          type: 'datetime',
                          tickPixelInterval: 150,
                          labels: {
                              //style: { color: '#FFE4B5' }
                          },
                          gridLineWidth: 1,
                      },
                      yAxis: {
                          title: {
                              text: indexTitle,
                              style: { color: '#333' }
                          },
                          plotLines: [{
                              value: 0,
                              width: 1,
                             //color: '#808080'
                          }],
                          
                          labels: {
                              //style: { color: '#FFE4B5' }
                          },
                          //设置y轴最大最小值
                          max:50,
                          min:8,
                          tickInterval:6,
                          plotLines:[{
                              color:'red',            //线的颜色，定义为红色
                              dashStyle:'solid',//标示线的样式，默认是solid（实线），这里定义为长虚线
                              value : 20,                //定义在哪个值上显示标示线，这里是在x轴上刻度为3的值处垂直化一条线
                              width:1,                 //标示线的宽度，2px
                              label:{
                                  text:'最小值为'+20,     //标签的内容
                                  align:'left',                //标签的水平位置，水平居左,默认是水平居中center
                                  //x:10,                         //标签相对于被定位的位置水平偏移的像素，重新定位，水平居左10px
                                  style:{color : 'black'},
                                  zIndex:999,
                              }
                          },{
                              color:'red',            //线的颜色，定义为红色
                              dashStyle:'solid',//标示线的样式，默认是solid（实线），这里定义为长虚线
                              value:40,                //定义在哪个值上显示标示线，这里是在x轴上刻度为3的值处垂直化一条线
                              width:1,                 //标示线的宽度，2px
                              label:{
                                  text:'最大值为'+40,     //标签的内容
                                  align:'left',                //标签的水平位置，水平居左,默认是水平居中center
                                  //x:10,                         //标签相对于被定位的位置水平偏移的像素，重新定位，水平居左10px
                                  style:{color : 'black'},
                                  zIndex:999,
                              }
                          }],
                      },
                      tooltip: {
                          formatter: function () {
                              return "<b>"+indexTitle+"为：" + Highcharts.numberFormat(this.y, 2) + '</b><br/>'
                              + '测试时间：' + Highcharts.dateFormat('%Y-%m-%d %H:%M:%S', this.x)

                          },
                           crosshairs: true
                      },
                      plotOptions: {
                          spline: {
                              marker: {
                                  radius: 4,
                                  lineColor: '#666666',
                                  lineWidth: 1
                              }
                          }
                      },
                      legend: {
                          enabled: true,
                          itemStyle: {
                              color: '#24CBE5',
                              fontWeight: 'bold'
                          }
                      },
                      exporting: {
                          enabled: true
                      },
                      //数据初始化0，通过y的值来设置，时间为当前时间
            series: [{                                                              
                name: indexTitle+"实时数据",                                                
                data: (function() {                                                 
                    // generate an array of random data                             
                    var data = [],                                                  
                        time = (new Date()).getTime(),                              
                        i;                                                          
                                                                                    
                    for (i = -19; i <= 0; i++) {                                    
                        data.push({                                                 
                            x: time + i * 1000,                                     
                            y: Math.floor(Math.random()*(40-20+1)+20)                                    
                        });                                                         
                    }                                                               
                    return data;                                                    
                })()                                                                
            }]  
                  });
	  }
              //--------------------------------------------------------
//
 </script>
</body>
</html>
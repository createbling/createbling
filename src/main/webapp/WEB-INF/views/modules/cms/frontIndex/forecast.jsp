<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html class="cufon-active cufon-ready" xmlns="http://www.w3.org/1999/xhtml"><head>
<title>预测</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${cmsStatic}/favicao.ico" type="image/x-icon" rel="shortcut icon"  />
<link href="${cmsStatic}/css/style.css" rel="stylesheet" type="text/css">
<link href="${cmsStatic}/css/iconfont.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="${cmsStatic}/css/fore.css">
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
          <li><a href="${frx}/comparison.htm">对比分析</a></li>
          <li class="active"><a href="${frx}/forecast.htm">预测</a></li>
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
        <div class="user_portrait"><img src="${cmsStatic}/images/user_portrait.jpg" /></div>
      </div>
    </div><!--content_top end-->

    <div class="content_main">
    <div class="forecast"> 
       <!--作物选择-->
       <div class="crop_chose" id="crop_chose">
         <div class="chosetitle">请选择作物：</div>
         <div class="chose_con">
           <div class="crop_box crop_active">杏鲍菇</div>
           <div class="crop_box">猴头菇</div>
           <div class="crop_box">巴西蘑菇</div>
           
         </div>
       </div>
       <!--作物选择 end-->

       <!--预测图与专家提醒盒子-->
       <div class="forebox" style="display:block;">
         <!--专家提醒-->
         <div class="forewarn">
            <div class="ftop">
              <p>专家提醒</p>
            </div>
            <div class="p_warn">
              <p>要根据温度变化适当增减草帘的铺盖厚度，降温剧烈时要及时采用炉子、暖风炉等设施加温，防止冻害。</p>
            </div>
         </div>
         <!--warn end-->
         <!-- 图表-->
         <div class="forechart">
           <div class="ftop">
              <p>趋势分析</p>
           </div>
           <div class="curve" id="curve_1"></div>
         </div>
         <!--forechart end-->
         <!--柱状图-->
         <div class="column_box">
           <div class="column" id="column_1"></div>
           <div class="column" id="column_2"></div>
           <div class="column" id="column_3"></div>
         </div><!--column_box end-->
       </div>
       <!--forebox end-->


       <div class="forebox" id="forebox">
         <!--专家提醒-->
         <div class="forewarn">
            <div class="ftop">
              <p>专家提醒</p>
            </div>
            <div class="p_warn">
              <p>要防止久阴乍晴后温室温度回升过快造成植株萎蔫而引发大面积死苗</p>
            </div>
         </div>
         <!--warn end-->
         <!-- 图表-->
         <div class="forechart">
           <div class="ftop">
              <p>趋势分析</p>
           </div>
           <div class="curve" id="curve_2"></div>
         </div>
         <!--forechart end-->
         <!--柱状图-->
         <div class="column_box">
           <div class="column" id="column_4"></div>
           <div class="column" id="column_5"></div>
           <div class="column" id="column_6"></div>
         </div><!--column_box end-->
       </div>
       <!--forebox end-->


       <div class="forebox">
         <!--专家提醒-->
         <div class="forewarn">
            <div class="ftop">
              <p>专家提醒</p>
            </div>
            <div class="p_warn">
              <p>注意棚内温湿度的调节，及时关闭风口；夏收作物可在降温发生前采用覆盖秸秆、薄膜，喷施植物防冻剂，熏烟等方法增加田间温度、降低霜冻伤害。</p>
            </div>
         </div>
         <!--warn end-->
         <!-- 图表-->
         <div class="forechart">
           <div class="ftop">
              <p>趋势分析</p>
           </div>
           <div class="curve" id="curve_3"></div>
         </div>
         <!--forechart end-->
         <!--柱状图-->
         <div class="column_box">
           <div class="column" id="column_7"></div>
           <div class="column" id="column_8"></div>
           <div class="column nth" id="column_9"></div>
         </div><!--column_box end-->
       </div>
       <!--forebox end-->

    </div><!--forecast end-->
    </div><!--content_main end-->
  </div><!--content主体结束-->

   <div class="clr"></div>
<!--尾部-->
  <div class="footer">
    <div class="footer_resize">
      <p>© 版权所有 广西大学精细农业研究室</p>
      <div class="clr"></div>
    </div>
  </div>

  </div><!--main end-->

<script type="text/javascript" src="${cmsStatic}/js/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="${cmsStatic}/js/date.js"></script>
<script src="${cmsStatic}/js/highcharts.js"></script>
<script type="text/javascript">
  $(function () {
    $('#curve_1').highcharts({
        chart: {
            type: 'spline',
            backgroundColor:'#f5f5f5',
            color:'#fff'
        },
        colors: ['#FF6B6B', '#45B6B0','#DDDF00'],
        title: {
            text: '预测曲线图'
        },
        credits:{
          enabled:false
        },
        xAxis: {
            categories: ['一天','二天','三天','四天','五天'],
            title:{
              text:'时间'
            }
        },
        yAxis: {
            title: {
                text: '参数值'
            },
            min: 0
        },
        tooltip: {
            headerFormat: '<b>{series.name}</b><br>',
            pointFormat: '{point.x:%e. %b}: {point.y:.2f} m'
        },

        plotOptions: {
            spline: {
                marker: {
                    enabled: true
                }
            }
        },

        series: [{
            name: "温度",
            // Define the data points. All series have a dummy year
            // of 1970/71 in order to be compared on the same x axis. Note
            // that in JavaScript, months start at 0 for January, 1 for February etc.
            data: [
                2,4,2,3,2
            ]
        }, {
            name: "湿度",
            data: [
                4,2,4,2,4
            ]
        }, {
            name: "CO2",
            data: [
                3,3,3,4,3
            ]
        }]
    });
});

//$(function () {
    $('.crop_box').eq(1).click(function(){
    $('#curve_2').highcharts({
        chart: {
            type: 'spline',
            backgroundColor:'#f5f5f5',
            color:'#fff'
        },
        colors: ['#FF6B6B', '#45B6B0','#DDDF00'],
        title: {
            text: '预测曲线图'
        },
        credits:{
          enabled:false
        },
        xAxis: {
            categories: ['一天','二天','三天','四天','五天'],
            title:{
              text:'时间'
            }
        },
        yAxis: {
            title: {
                text: '参数值'
            },
            min: 0
        },
        tooltip: {
            headerFormat: '<b>{series.name}</b><br>',
            pointFormat: '{point.x:%e. %b}: {point.y:.2f} m'
        },

        plotOptions: {
            spline: {
                marker: {
                    enabled: true
                }
            }
        },

        series: [{
            name: "温度",
            // Define the data points. All series have a dummy year
            // of 1970/71 in order to be compared on the same x axis. Note
            // that in JavaScript, months start at 0 for January, 1 for February etc.
            data: [
                4,2,4,2,4
            ]
        }, {
            name: "湿度",
            data: [
                2,4,2,3,2
                
            ]
        }, {
            name: "CO2",
            data: [
                3,3,3,4,3
            ]
        }]
    });
})
//});

//$(function () {
  $('.crop_box').eq(2).click(function(){
    $('#curve_3').highcharts({
        chart: {
            type: 'spline',
            backgroundColor:'#f5f5f5',
            color:'#fff'
        },
        colors: ['#FF6B6B', '#45B6B0','#DDDF00'],
        title: {
            text: '预测曲线图'
        },
        credits:{
          enabled:false
        },
        xAxis: {
            categories: ['一天','二天','三天','四天','五天'],
            title:{
              text:'时间'
            }
        },
        yAxis: {
            title: {
                text: '参数值'
            },
            min: 0
        },
        tooltip: {
            headerFormat: '<b>{series.name}</b><br>',
            pointFormat: '{point.x:%e. %b}: {point.y:.2f} m'
        },

        plotOptions: {
            spline: {
                marker: {
                    enabled: true
                }
            }
        },

        series: [{
            name: "温度",
            // Define the data points. All series have a dummy year
            // of 1970/71 in order to be compared on the same x axis. Note
            // that in JavaScript, months start at 0 for January, 1 for February etc.
            data: [
                3,3,3,4,3
            ]
        }, {
            name: "湿度",
            data: [
                4,2,4,2,4
            ]
        }, {
            name: "CO2",
            data: [
                2,4,2,3,2
            ]
        }]
    });
})
//});
</script>

<script type="text/javascript">
  $(function () {
    $('#column_1').highcharts({
        chart: {
            type: 'column',
            backgroundColor:'#f5f5f5',
            borderRadius:'3px'
        },
        colors: ['#FF6B6B', '#45B6B0'],
        title: {
            text: '温度预测(℃)'
        },
        credits:{
          enabled:false
        },
        xAxis: {
            categories: [
                '一天',
                '二天',
                '三天',
                '四天',
                '五天'
            ],
            crosshair: true
        },
        yAxis: {
            min: 0,
            title: {
                text: '参数值'
            }
        },
        tooltip: {
            headerFormat: '<span style="font-size:10px">{point.key}</span><table>',
            pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
                '<td style="padding:0"><b>{point.y:.1f} mm</b></td></tr>',
            footerFormat: '</table>',
            shared: true,
            useHTML: true
        },
        plotOptions: {
            column: {
                pointPadding: 0.2,
                borderWidth: 0,
                dataLabels:{
                  enabled:true
                }
            }
        },
        series: [{
            name: '温度',
            data: [49.9, 71.5, 106.4, 129.2, 144.0]

        }]
    });
});

$(function () {
    $('#column_2').highcharts({
        chart: {
            type: 'column',
            backgroundColor:'#f5f5f5',
            borderRadius:'3px'
        },
        colors:['#45B6B0'],
        title: {
            text: '湿度预测(%)'
        },
        credits:{
          enabled:false
        },
        xAxis: {
            categories: [
                '一天',
                '二天',
                '三天',
                '四天',
                '五天'
            ],
            crosshair: true
        },
        yAxis: {
            min: 0,
            title: {
                text: '参数值'
            }
        },
        tooltip: {
            headerFormat: '<span style="font-size:10px">{point.key}</span><table>',
            pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
                '<td style="padding:0"><b>{point.y:.1f} mm</b></td></tr>',
            footerFormat: '</table>',
            shared: true,
            useHTML: true
        },
        plotOptions: {
            column: {
                pointPadding: 0.2,
                borderWidth: 0,
                dataLabels:{
                  enabled:true
                }
            }
        },
        series: [{
            name: '湿度',
            data: [83.6, 78.8, 98.5, 93.4, 106.0]

        }]
    });

});

$(function () {
    $('#column_3').highcharts({
        chart: {
            type: 'column',
            backgroundColor:'#f5f5f5',
            borderRadius:'3px'
        },
        colors: ['#FF6B6B'],

        title: {
            text: 'CO2浓度预测(%)'
        },
        credits:{
          enabled:false
        },
        xAxis: {
            categories: [
                '一天',
                '二天',
                '三天',
                '四天',
                '五天'
            ],
            crosshair: true
        },
        yAxis: {
            min: 0,
            title: {
                text: '参数值'
            }
        },
        tooltip: {
            headerFormat: '<span style="font-size:10px">{point.key}</span><table>',
            pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
                '<td style="padding:0"><b>{point.y:.1f} mm</b></td></tr>',
            footerFormat: '</table>',
            shared: true,
            useHTML: true
        },
        plotOptions: {
            column: {
                pointPadding: 0.2,
                borderWidth: 0,
                dataLabels:{
                  enabled:true
                }
            }
        },
        series: [{
            name: 'co2',
            data: [83.6, 78.8, 98.5, 93.4, 106.0]

        }]
    });
});
</script>

<script type="text/javascript">
//  $(function () {
    $('.crop_box').eq(1).click(function(){
    $('#column_4').highcharts({
        chart: {
            type: 'column',
            backgroundColor:'#f5f5f5',
            borderRadius:'3px'
        },
        colors: ['#FF6B6B', '#45B6B0'],
        title: {
            text: '温度预测(℃)'
        },
        credits:{
          enabled:false
        },
        xAxis: {
            categories: [
                '一天',
                '二天',
                '三天',
                '四天',
                '五天'
            ],
            crosshair: true
        },
        yAxis: {
            min: 0,
            title: {
                text: '参数值'
            }
        },
        tooltip: {
            headerFormat: '<span style="font-size:10px">{point.key}</span><table>',
            pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
                '<td style="padding:0"><b>{point.y:.1f} mm</b></td></tr>',
            footerFormat: '</table>',
            shared: true,
            useHTML: true
        },
        plotOptions: {
            column: {
                pointPadding: 0.2,
                borderWidth: 0,
                dataLabels:{
                  enabled:true
                }
            }
        },
        series: [{
            name: '温度',
            data: [83.6, 78.8, 98.5, 93.4, 106.0]

        }]
    });
})
//});

//$(function () {
  $('.crop_box').eq(1).click(function(){
    $('#column_5').highcharts({
        chart: {
            type: 'column',
            backgroundColor:'#f5f5f5',
            borderRadius:'3px'
        },
        colors:['#45B6B0'],
        title: {
            text: '湿度预测(%)'
        },
        credits:{
          enabled:false
        },
        xAxis: {
            categories: [
                '一天',
                '二天',
                '三天',
                '四天',
                '五天'
            ],
            crosshair: true
        },
        yAxis: {
            min: 0,
            title: {
                text: '参数值'
            }
        },
        tooltip: {
            headerFormat: '<span style="font-size:10px">{point.key}</span><table>',
            pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
                '<td style="padding:0"><b>{point.y:.1f} mm</b></td></tr>',
            footerFormat: '</table>',
            shared: true,
            useHTML: true
        },
        plotOptions: {
            column: {
                pointPadding: 0.2,
                borderWidth: 0,
                dataLabels:{
                  enabled:true
                }
            }
        },
        series: [{
            name: '湿度',
            data: [59.9, 81.5,129.2, 144.0,106.4]

        }]
    });
})
//});

//$(function () {
  $('.crop_box').eq(1).click(function(){
    $('#column_6').highcharts({
        chart: {
            type: 'column',
            backgroundColor:'#f5f5f5',
            borderRadius:'3px'
        },
        colors: ['#FF6B6B'],

        title: {
            text: 'CO2浓度预测(%)'
        },
        credits:{
          enabled:false
        },
        xAxis: {
            categories: [
                '一天',
                '二天',
                '三天',
                '四天',
                '五天'
            ],
            crosshair: true
        },
        yAxis: {
            min: 0,
            title: {
                text: '参数值'
            }
        },
        tooltip: {
            headerFormat: '<span style="font-size:10px">{point.key}</span><table>',
            pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
                '<td style="padding:0"><b>{point.y:.1f} mm</b></td></tr>',
            footerFormat: '</table>',
            shared: true,
            useHTML: true
        },
        plotOptions: {
            column: {
                pointPadding: 0.2,
                borderWidth: 0,
                dataLabels:{
                  enabled:true
                }
            }
        },
        series: [{
            name: 'co2',
            data: [84.2,78.8,90.2,110.4,128.2]

        }]
    });
})
//});
</script>

<script type="text/javascript">
 // $(function () {
    $('.crop_box').eq(2).click(function(){
    $('#column_7').highcharts({
        chart: {
            type: 'column',
            backgroundColor:'#f5f5f5',
            borderRadius:'3px'
        },
        colors: ['#FF6B6B', '#45B6B0'],
        title: {
            text: '温度预测(℃)'
        },
        credits:{
          enabled:false
        },
        xAxis: {
            categories: [
                '一天',
                '二天',
                '三天',
                '四天',
                '五天'
            ],
            crosshair: true
        },
        yAxis: {
            min: 0,
            title: {
                text: '参数值'
            }
        },
        tooltip: {
            headerFormat: '<span style="font-size:10px">{point.key}</span><table>',
            pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
                '<td style="padding:0"><b>{point.y:.1f} mm</b></td></tr>',
            footerFormat: '</table>',
            shared: true,
            useHTML: true
        },
        plotOptions: {
            column: {
                pointPadding: 0.2,
                borderWidth: 0,
                dataLabels:{
                  enabled:true
                }
            }
        },
        series: [{
            name: '温度',
            data: [60.2,76.4,129.5,90.4,72.8]

        }]
    });
})
//});

//$(function () {
  $('.crop_box').eq(2).click(function(){
    $('#column_8').highcharts({
        chart: {
            type: 'column',
            backgroundColor:'#f5f5f5',
            borderRadius:'3px'
        },
        colors:['#45B6B0'],
        title: {
            text: '湿度预测(%)'
        },
        credits:{
          enabled:false
        },
        xAxis: {
            categories: [
                '一天',
                '二天',
                '三天',
                '四天',
                '五天'
            ],
            crosshair: true
        },
        yAxis: {
            min: 0,
            title: {
                text: '参数值'
            }
        },
        tooltip: {
            headerFormat: '<span style="font-size:10px">{point.key}</span><table>',
            pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
                '<td style="padding:0"><b>{point.y:.1f} mm</b></td></tr>',
            footerFormat: '</table>',
            shared: true,
            useHTML: true
        },
        plotOptions: {
            column: {
                pointPadding: 0.2,
                borderWidth: 0,
                dataLabels:{
                  enabled:true
                }
            }
        },
        series: [{
            name: 'co2',
            data: [ 78.8, 98.5, 120.4, 106.0,96.9]

        }]
    });
})
//});

//$(function () {
  $('.crop_box').eq(2).click(function(){
    $('#column_9').highcharts({
        chart: {
            type: 'column',
            backgroundColor:'#f5f5f5',
            borderRadius:'3px'
        },
        colors: ['#FF6B6B'],

        title: {
            text: 'CO2浓度预测(%)'
        },
        credits:{
          enabled:false
        },
        xAxis: {
            categories: [
                '一天',
                '二天',
                '三天',
                '四天',
                '五天'
            ],
            crosshair: true
        },
        yAxis: {
            min: 0,
            title: {
                text: '参数值'
            }
        },
        tooltip: {
            headerFormat: '<span style="font-size:10px">{point.key}</span><table>',
            pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
                '<td style="padding:0"><b>{point.y:.1f} mm</b></td></tr>',
            footerFormat: '</table>',
            shared: true,
            useHTML: true
        },
        plotOptions: {
            column: {
                pointPadding: 0.2,
                borderWidth: 0,
                dataLabels:{
                  enabled:true
                }
            }
        },
        series: [{
            name: '湿度',
            data: [83.6, 78.8, 98.5, 93.4, 106.0]

        }]
    });
})
//});
</script>
<!--选项卡-->
<script type="text/javascript">
    $(function(){
    var boxs= $(".crop_box");
    var divs= $(".forebox");
    //alert(boxs.length);alert(divs.length);
    if (boxs.length!=divs.length) {return;}
    for(var i=0; i<boxs.length; i++){
      boxs[i].id=i;
      boxs[i].onclick=function(){
        for (var j = 0; j < boxs.length; j++) {
          boxs[j].className="crop_box";
          divs[j].style.display="none";
        }
        this.className="crop_box crop_active";
        divs[this.id].style.display="block";
      }
    }
  })
</script>


</body>
</html>

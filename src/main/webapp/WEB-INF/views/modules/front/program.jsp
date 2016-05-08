<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html class="cufon-active cufon-ready" xmlns="http://www.w3.org/1999/xhtml"><head>
<title>智能方案</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${cmsStatic}/favicao.ico" type="image/x-icon" rel="shortcut icon"  />
<link href="${cmsStatic}/css/style.css" rel="stylesheet" type="text/css">
<link href="${cmsStatic}/css/pro.css" rel="stylesheet" type="text/css">
<link href="${cmsStatic}/css/iconfont.css" rel="stylesheet" type="text/css">
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
          <li><a href="${frx}/forecast.htm">预测</a></li>
          <li class="active"><a href="${frx}/program.htm">智能方案</a></li>
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
    
<!--主体内容区-->
    <div class="content_main">
       <div class="program">
         <div class="pro_title"><h2>选择参数生成智能方案</h2></div>
         <div class="pro_con">
           <div class="pro_input">
            <div class="pro_top"><p>选择方案条件</p></div>

            <div class="inputbox">
              <div class="inputbox_left">选择作物:</div>
              <div class="inputbox_right">
                 <div class="nice-select" name="nice-select">
                      <input name="crop" id="input" type="text"  value="==选择作物==" readonly />
                      <ul>
                        <li data-value="1">杏鲍菇</li>
                        <li data-value="2">猴头菇</li>
                        <li data-value="3">巴西蘑菇</li>
                        <li data-value="4">凤尾菇</li>
                      </ul>
                 </div> 
              </div>    
          </div>

          <div class="inputbox">
              <div class="inputbox_left">种植数量:</div>
              <div class="inputbox_right">
                 <div class="nice-select" name="nice-select">
                      <input name="num" type="text" value="==选择数量范围==" readonly />
                      <ul>
                        <li data-value="1">0~500</li>
                        <li data-value="2">500~1000</li>
                        <li data-value="3">1000~1500</li>
                        <li data-value="4">1500~2000</li>
                      </ul>
                 </div> 
              </div>    
          </div>

          <div class="inputbox">
              <div class="inputbox_left">种植基地:</div>
              <div class="inputbox_right">
                 <div class="nice-select" name="nice-select">
                      <input name="area" type="text" value="==选择基地==" readonly />
                      <ul>
                        <li data-value="1">伊岭岩一号基地</li>
                        <li data-value="2">伊岭岩二号基地</li>
                        <li data-value="3">伊岭岩三号基地</li>
                        <li data-value="4">伊岭岩四号基地</li>
                      </ul>
                 </div> 
              </div>    
          </div>

          <div class="inputbox">
              <div class="inputbox_left">预算费用:</div>
              <div class="inputbox_right">
                 <div class="nice-select" name="nice-select">
                      <input name="money" type="text" value="==选择预算范围==" readonly />
                      <ul>
                        <li data-value="1">500~1000元</li>
                        <li data-value="2">1000~1500元</li>
                        <li data-value="3">1500~2000元</li>
                        <li data-value="4">2500~3000元</li>
                      </ul>
                 </div> 
              </div>    
          </div>

          <a href="javascript:void(0);" class="submit" id="submit">提交</a>
               
            </div><!--pro_input end-->
<!--
            <div class="pro_middle">
              <div class="pro_top" style="margin-bottom:10px;"></div>
              <div class="cut"></div>
            </div>
-->
<!--右侧智能方案-->
            <div class="pro_result">
            <!--
              <div class="pro_top" style="margin-bottom:0">
                <p>生成智能方案</p>
              </div>
            -->
              <!--<div class="meg">请在左侧填写条件生成智能方案</div>-->
              <div class="result_box pink">
                <p><span class="b_pink">温度设置</span><span class="close">×</span></p>
               <div class="package">
                  <div class="val_icon"><i class="iconfont">&#xe609;</i></div>
                  <div class="val">24</div>
                  <div class="val_unit"><span>/°C</span></div>
               </div>
               <div class="placeholder">选择参数生成方案</div>
              </div>

              <div class="result_box cray">
                <p><span class="b_cray">土壤PH值设置</span><span class="close">×</span></p>
               <div class="package">
                  <div class="val_icon"><i class="iconfont">&#xe629;</i></div>
                  <div class="val">7.5</div>
                  <div class="val_unit"><span>/ph</span></div>
               </div>
               <div class="placeholder">选择参数生成方案</div>
              </div>

              <div class="result_box pink nth">
                <p><span class="b_pink">湿度设置</span><span class="close">×</span></p>
               <div class="package">
                  <div class="val_icon"><i class="iconfont">&#xe6bb;</i></div>
                  <div class="val 45b0b5">72</div>
                  <div class="val_unit"><span>%</span></div>
               </div>
               <div class="placeholder">选择参数生成方案</div>
              </div>

              <div class="result_box yellow">
               <p><span class="b_yellow">CO2浓度设置</span><span class="close">×</span></p>
               <div class="package">
                  <div class="val_icon"><i class="iconfont">&#xe8c2;</i></div>
                  <div class="val">640</div>
                  <div class="val_unit"><span>/ppm</span></div>
               </div>
               <div class="placeholder">选择参数生成方案</div>
              </div>

              <div class="result_box pink">
                <p><span class="b_pink">种植密度</span><span class="close">×</span></p>
               <div class="package">
                 <div class="val_icon"><i class="iconfont">&#xe610;</i></div>
                 <div class="val">10</div>
                 <div class="val_unit"><span>棵/㎡</span></div>
               </div>
               <div class="placeholder">选择参数生成方案</div>
              </div>

              <div class="result_box blue nth">
                <p><span class="b_blue">布局情况</span><span class="close">×</span></p>
               <div class="package">
                 <div class="val_icon"><i class="iconfont">&#xe618;</i></div>
                 <div class="val">45</div>
                 <div class="val_unit"><span>/㎡</span></div>
               </div>
               <div class="placeholder">选择参数生成方案</div>
              </div>

            </div><!--pro_result end-->
           </div><!--pro_con end-->
           
         </div>
       </div>
    </div><!--content_main end-->

  </div><!--content end-->
<!--主体 结束-->

  <div class="clr"></div>
<!--尾部-->
  <div class="footer">
    <div class="footer_resize">
      <p>© 版权所有    ${fns:getConfig('productName')}</p>
      <div class="clr"></div>
    </div>
  </div>
<!--尾部 结束-->
</div>
<!--main end-->

<script type="text/javascript" src="${cmsStatic}/js/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="${cmsStatic}/js/date.js"></script>
<!--下拉框-->
<script>  
$('[name="nice-select"]').click(function(e){
  $('[name="nice-select"]').find('ul').hide();
  $(this).find('ul').show();
  e.stopPropagation();
});
$('[name="nice-select"] li').hover(function(e){
  $(this).toggleClass('on');
  e.stopPropagation();
});
$('[name="nice-select"] li').click(function(e){
  var val = $(this).text();
  var dataVal = $(this).attr("data-value");
  $(this).parents('[name="nice-select"]').find('input').val(val);
  $('[name="nice-select"] ul').hide();
  e.stopPropagation();
  //alert($(this).parents('[name="nice-select"]').find('input').val());
});
$(document).click(function(){
  $('[name="nice-select"] ul').hide();
});
</script>

<script type="text/javascript">
  var submit=$('#submit');
  submit.click(function(){
    //各参数先隐藏
    $('.package').fadeOut(100);
    //添加参数
     Addval();
  })

  function Addval(){
	  //判断条件是否选全
   var crop=$("input[name='crop']");
   var num=$("input[name='num']");
   var area=$("input[name='area']");
   var money=$("input[name='money']");
   if (crop.val()=="==选择作物==") {alert("请选择作物");return false;};
   if (num.val()=="==选择数量范围==") {alert("请选择数量");return false;};
   if (area.val()=="==选择基地==") {alert("请选择基地");return false;};
   if (money.val()=="==选择预算范围==") {alert("请选择预算范围");return false;};
   //显示正在计算
    $('.placeholder').text("正在计算，请稍后...");
//延迟1300毫秒后计算参数并显示
  setTimeout(calculate,1300);
}

function calculate(){
//定义方案值数组
  var newArray=[
Math.round(Math.random()+24),
fomatFloat((Math.random()+7),1), //保留一位小数
Math.round(Math.random()+72),
Math.round(Math.random()+640),
Math.round(Math.random()+10),
Math.round(Math.random()+45)
];
//为每个参数填入值
 var val=$('.pro_result').find('.val');
  for (var i = 0; i < val.length; i++) {
    $(val[i]).text(newArray[i]);
  }
//显示智能方案 
   $('.package').fadeIn(1000);
}


//保留小数
//src:原始数据；pos：要保留的位数
function fomatFloat(src,pos){     
             return Math.round(src*Math.pow(10, pos))/Math.pow(10, pos);     
        }
</script>

</body>
</html>
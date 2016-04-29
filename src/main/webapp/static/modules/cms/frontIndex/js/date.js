$(function(){
    var weeks= new Array('星 期 日','星 期 一','星 期 二','星 期 三','星 期 四','星 期 五','星 期 六')
    var mydate=new Date();
    var year= mydate.getFullYear();
    var month= mydate.getMonth()+1;
    var date= mydate.getDate();
    var day= mydate.getDay();
    month=checkTime(month);
    date=checkTime(date);
    var fullDate=year+ " 年 "+ month+" 月 "+date+" 日 ";
    var week=weeks[day];
    $("#time_1").html(fullDate);
    $("#time_2").html(week);
    time();
  })
//时间
function time(){
    var mydate=new Date();
    var hour=mydate.getHours();
    var minute=mydate.getMinutes();
    var second=mydate.getSeconds();
    hour=checkTime(hour);
    minute=checkTime(minute);
    second=checkTime(second);
    $("#time_3").html(hour+' : '+minute+' : '+second);
    t=setTimeout('time()',500);
  }
//天数等小于10时，加0；
function checkTime(i){
    if (i<10) {i="0"+i;}
    return i;
  }
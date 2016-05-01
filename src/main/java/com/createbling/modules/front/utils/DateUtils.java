package com.createbling.modules.front.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	
	 private static ThreadLocal<DateFormat> DateFormatter = new ThreadLocal<DateFormat>();
     public   static  int Minute=60*1000;
	 
	/**
	 * 获取当前日期String
	 * @return
	 */
	public static String getNow() {
			Date date = new Date();
			 DateFormat df = DateFormatter.get();
		        if (df == null) {
		            df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		            DateFormatter.set(df);
		        }
		        return df.format(date);
		}

	/**
	 * 取出当前日期
	 * @return
	 */
	public static Date getNowDate() {
		Date date = new Date();
	    return date;
	}
	
	
	/**
     * 在现在时间点基础上减少多少天
     * @param days
     * @return 字符串
     */
    public static String cutDaysToNowString(int days){
	    DateFormat df = DateFormatter.get();
	      if (df == null) {
	          df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	          DateFormatter.set(df);
	      }
        long times= System.currentTimeMillis() - days*24*60*60*1000;
        return df.format(new Date(times));
    }
	
	/**
     * 在现在时间点基础上减少多少天
     * @param days
     * @return 字符串
     */
    public static Date cutDaysToNowDate(int days){
        long times= System.currentTimeMillis() - days*24*60*60*1000;
        return new Date(times);
    }
    
    /**
     * 在现在时间点基础上减少多少秒
     * @param minute
     * @return 字符串
     */
    public static String cutSecondsToNowString(int seconds){
	    DateFormat df = DateFormatter.get();
	      if (df == null) {
	          df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	          DateFormatter.set(df);
	      }
        long times= System.currentTimeMillis() - seconds*1000;
        return df.format(new Date(times));
    }
	
    /**
     * 在现在时间点基础上减少多少分钟
     * @param minute
     * @return 字符串
     */
    public static String cutMinutesToNowString(int minutes){
	    DateFormat df = DateFormatter.get();
	      if (df == null) {
	          df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	          DateFormatter.set(df);
	      }
        long times= System.currentTimeMillis() - minutes*60*1000;
        return df.format(new Date(times));
    }
	
    /**
     * 在现在时间点基础上减少多少秒
     * @param minute
     * @return 日期
     */
    public static Date cutSecondsToNowDate(int seconds){
        long times= System.currentTimeMillis() - seconds*1000;
        return new Date(times);
    }
	
    /**
     * 在现在时间点基础上减少多少分钟
     * @param minute
     * @return 日期
     */
    public static Date cutMinutesToNowDate(int minutes){
        long times= System.currentTimeMillis() - minutes*60*1000;
        return new Date(times);
    }
    
    /**
     * 
     * @param date
     * @param minutes
     * @return
     */
    public static Date cutMinutesToOneDate(Date date,int minutes){
        long times= date.getTime() - minutes*60*1000;
        return new Date(times);
    }
    
    /**
     * 
     * @param date
     * @param minutes
     * @return
     */
    public static Date cutSecondsToOneDate(Date date,int seconds){
        long times= date.getTime() - seconds*1000;
        return new Date(times);
    }
    /**
     * 
     * @param date
     * @param minutes
     * @return
     */
    public static Date addSecondsToOneDate(Date date,int seconds){
        long times= date.getTime() + seconds*1000;
        return new Date(times);
    }
    
    /**
     * 
     * @param String
     * @param minutes
     * @return
     */
    public static Date addSecondsToOneString(String dateString,int seconds){
    	Date date = getDateFromStr(dateString,"yyyy-MM-dd HH:mm:ss");
        long times= date.getTime() + seconds*1000;
        return new Date(times);
    }
    
    //获得一周前的日期
    public static String lastWeek(){
        Date date = new Date();
        int year=Integer.parseInt(new SimpleDateFormat("yyyy").format(date));
        int month=Integer.parseInt(new SimpleDateFormat("MM").format(date));
        int day=Integer.parseInt(new SimpleDateFormat("dd").format(date))-6;

        if(day<1){
            month-=1;
            if(month==0){
                year-=1;month=12;
            }
            if(month==4||month==6||month==9||month==11){
                day=30+day;
            }else if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
            {
                day=31+day;
            }else if(month==2){
                if(year%400==0||(year %4==0&&year%100!=0))day=29+day;
                else day=28+day;
            }
        }
        String y = year+"";String m ="";String d ="";
        if(month<10) m = "0"+month;
        else m=month+"";
        if(day<10) d = "0"+day;
        else d = day+"";
        return y+"-"+m+"-"+d;
    }

    //获得一月前的日期
    public static String  lastMonth(){
        Date date = new Date();

        int year=Integer.parseInt(new SimpleDateFormat("yyyy").format(date));
        int month=Integer.parseInt(new SimpleDateFormat("MM").format(date))-1;
        int day=Integer.parseInt(new SimpleDateFormat("dd").format(date));
        if(month==0){
            year-=1;month=12;
        }
        else if(day>28){
            if(month==2){
                if(year%400==0||(year %4==0&&year%100!=0)){
                    day=29;
                }else day=28;
            }else if((month==4||month==6||month==9||month==11)&&day==31)
            {
                day=30;
            }
        }
        String y = year+"";String m ="";String d ="";
        if(month<10) m = "0"+month;
        else m=month+"";
        if(day<10) d = "0"+day;
        else d = day+"";
        return y+"-"+m+"-"+d;
    }

    /**
     * 根据时间字符串获取 Date 对象
     * @param dateStr
     * @param dateFormat
     * @return 转换失败返回 null
     */
    public static Date getDateFromStr(String dateStr,String dateFormat){
        SimpleDateFormat sdf=new SimpleDateFormat(dateFormat);
        try {
          return   sdf.parse(dateStr);
        } catch (ParseException e) {
          return  null;
        }
    }

    /**
     * 返回指定时间相对于现在逝去的分钟总数
     * @param dateOne
     * @param dateTow
     * @return
     */
    public static long getEscapeMinutes(Date dateOne,Date dateTow){
        return  (dateOne.getTime()-dateTow.getTime())/DateUtils.Minute;
    }

    /**
     * 获取指定日期的指定格式
     * @param date
     * @param dateFormat
     * @return
     */
    public static String getStrFromDate(Date date,String dateFormat){
      SimpleDateFormat sdf=new SimpleDateFormat(dateFormat);
      return sdf.format(date);
    }


    /**
     * 在现在时间点基础上增加多少分钟
     * @param minute
     * @return
     */
    public static Date addMinutesToNow(int minute){
        long times= System.currentTimeMillis() + minute*60*1000;
        return new Date(times);
    }

     public static void main(String args[]){
    	 //System.out.println(DateUtils.getNow());
         /*System.out.println(DateUtils.lastWeek());
         System.out.println(DateUtils.lastMonth());
         System.out.println(DateUtils.getStrFromDate(new Date(),"MM-dd hh:mm:ss"));
         System.out.println(DateUtils.getStrFromDate(DateUtils.getDateFromStr("2013-05-29 00:00:00","yyyy-MM-dd HH:mm:ss"),"yyyy-MM-dd HH:mm:ss"));

         System.out.println(DateUtils.getStrFromDate(DateUtils.addMinutesToNow(30),"yyyy-MM-dd HH:mm:ss"));
         
         System.out.println(DateUtils.getDateFromStr("2013/2/16 5:36:40", "yyyy/MM/dd HH:mm:ss").toString());
*/     }
}

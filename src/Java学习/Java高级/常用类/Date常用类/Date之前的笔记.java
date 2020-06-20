package Java学习.Java高级.常用类.Date常用类;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * 一、 date()  返回 - 到现在经历的毫秒数： 1587645939814
 * 二、 date(1000*60*60*24L) 重创建日期到1天 后的时间Fri Jan 02 08:00:00 CST 1970
 * 三、 时间格式化现在时间： new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss").format(到1970毫秒数)
 * 四、 获取某个时区是时间: ...
 */
public class Date之前的笔记 {
    public static void main(String[] args) {

        //object date
        Date date = new Date();
        System.out.println("new Date(): "+date);
        //经历毫秒数的方法
        long value = date.getTime();
        System.out.println("到现在经历的毫秒数： " + value);
        //传入指定经历的秒数
        //一天的 毫秒数
        long time = 1000 * 60 * 60 * 24 * 1;
        Date date2 = new Date(time);
        //object of 重创建日期到time 后的时间
        System.out.println("重创建日期到time 后的时间" + date2);
        System.out.println("------------Dateformat日期格式化类-----------");
        /*
         * y  年
         * M 月
         * d 天数
         * E 星期数
         * a 上下午
         * H 小时
         * m 分钟
         * s 秒数
         */
        //创建时间对象
        Date date3 = new Date();
        //class DateFormat object
        DateFormat df;
        df = new SimpleDateFormat("yyyy-MM-dd");
        //syso object.method()
        System.out.println(df.format(date3));
        df = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
        System.out.println(df.format(date3));
        df = new SimpleDateFormat("yyyy-MM-dd E HH:mm:ss");
        System.out.println(df.format(date3));
        System.out.println("-------时区TimeZone--------");
        //TimeZone 赋值，zone 时区
        TimeZone tz = TimeZone.getTimeZone("GMT+8");
        //obj.method();
        df.setTimeZone(tz);
        //输出
        System.out.println("北京时间为： " + df.format(new Date()));
        TimeZone tz2 = TimeZone.getTimeZone("GMT+9");
        df.setTimeZone(tz2);
        System.out.println("东京时间为： " + df.format(new Date()));
    }
}

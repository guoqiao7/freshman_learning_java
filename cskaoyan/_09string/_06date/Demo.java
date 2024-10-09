package com.cskaoyan._09string._06date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/10 10:56
 **/

public class Demo {
    public static void main(String[] args) throws ParseException {
        // 日期类Date
        Date date = new Date();
        System.out.println(date);
        // Wed Jan 10 11:01:10 CST 2024
        // 日期格式化
        // yyyy--->年
        // MM----->月
        // dd----->日
        // HH---->时
        // mm---->分
        // ss---->秒
        // 使用格式化日期类
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // Date对象--->String
        String format = sdf.format(date);
        System.out.println(format);
        // String---->Date
        String time = "2024-01-11 08:55:00";
        Date date1 = sdf.parse(time);
        System.out.println(date1);

        // 通过Date对象获取当前的时间戳
        long time1 = date1.getTime();
        // 通过时间戳构建一个Date对象
        Date date2 = new Date(1704934663932L);
    }
}

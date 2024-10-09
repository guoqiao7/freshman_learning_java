package com.cskaoyan._09string._03api;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/9 17:02
 **/
/*
课堂练习：
	1:字符串helloWORLD
	2:第一个字符转为大写,其余字符转为小写     →   Helloworld
 */
public class Ex2 {
    public static void main(String[] args) {
        String s = "helloWORLD";
        // 把代码片段抽取成方法 ctrl+alt+m
        // test1(s);
        String newStr = s.substring(0, 1).toUpperCase()
                .concat(s.substring(1).toLowerCase());
        System.out.println(newStr);

    }

    private static void test1(String s) {
        // 把首个字符取出来 变成大写的
        String head = s.substring(0, 1);
        String headStr = head.toUpperCase();
        // 把剩余的字符串取出来 变成小写的
        String remind = s.substring(1);
        String remindStr = remind.toLowerCase();
        // 重写进行字符串拼接
        String str = headStr + remindStr;
        System.out.println(str);
    }
}

package com.cskaoyan._01basic._08operator;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/29 15:32
 **/

/*
比较运算符
== != >= <=
 */
public class Demo5 {
    public static void main(String[] args) {
        // 基本数据类型的比较
        int a = 1;
        int b = 2;
        System.out.println(a==b);
        // 引用数据类型的比较
        String s1 = "abc";
        String s2 = "abcd";
        // 跟equals方法不同
        System.out.println(s1 == s2);
    }
}

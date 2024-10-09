package com.cskaoyan._02method._04overload;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/30 10:51
 **/
/*
使用方法重载，控制台输出各种数据类型。
 */
public class Demo4 {
    public static void printElement(byte a) {
        System.out.println(a);
    }
    public static void printElement(short a) {
        System.out.println(a);
    }

    public static void printElement(double a) {
        System.out.println(a);
    }

    public static void printElement(String a) {
        System.out.println(a);
    }
}

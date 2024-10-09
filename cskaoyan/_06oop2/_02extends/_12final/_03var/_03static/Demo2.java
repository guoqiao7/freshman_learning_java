package com.cskaoyan._06oop2._02extends._12final._03var._03static;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/8 10:07
 **/

public class Demo2 {
    public static void main(String[] args) {
        System.out.println(A.NUM);
        // A static block没有输出
        // 不是一个完整的类加载
    }
}

class A{
    // 全局常量
    public static  final int NUM = 100;
    // 静态代码块
    static {
        System.out.println("A static block");
    }
}
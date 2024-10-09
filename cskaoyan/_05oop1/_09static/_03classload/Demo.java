package com.cskaoyan._05oop1._09static._03classload;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/3 15:54
 **/
/*
总结，到目前学习过的类加载时机：
1. new直接创建该类的对象。(**首次**)
2. 启动该类中的main方法。
3. 访问该类的静态成员（方法和变量) (**首次**)
 */
public class Demo {
    public static void main(String[] args) {
        A.m1();
        // System.out.println(A.a);
    }
}

class A{
    static int a = 1;

    static void m1() {

    }
}
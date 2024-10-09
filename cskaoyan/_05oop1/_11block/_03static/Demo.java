package com.cskaoyan._05oop1._11block._03static;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/4 9:07
 **/
/*
静态代码块:
    位置: 成员位置
    语法: static{ }
    作用:在类加载过程中,给静态成员变量赋值
    理解:在类加载过程中,自动执行的一个静态方法
 */
public class Demo {
    int a = 1;
    static int b = 1;
    // 成员位置
    static {
        // 静态代码块
        // 静态上下文
        // Non-static field 'a' cannot be referenced from a static context
        // System.out.println(a);
        // normalMethod();
        System.out.println(b);
        staticMethod();
        b = 2;
    }

    public void normalMethod() {

    }

    public static void staticMethod(){};
}

package com.cskaoyan._03array._07vp;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/2 8:45
 **/
/*
注意事项：

1. 调用方法时，如果有一个固定参数的方法匹配的同时，也可以与可变参数的方法匹配，则选择固定参数的方法。

2. 调用方法时，如果出现两个可变参数的方法都能匹配，则报错，这两个方法都无法调用了。
 */
public class Demo2 {
    public static void main(String[] args) {
        m1(1);

        // Ambiguous method call
        // m1(1,1);
    }

    public static void m1(int a) {

    }
    public static void m1(int... args) {

    }
    public static void m1(int a,int... args) {

    }
}

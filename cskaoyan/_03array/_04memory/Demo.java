package com.cskaoyan._03array._04memory;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/30 15:23
 **/

public class Demo {
    public static void main(String[] args) {
        // 局部位置
        // 局部变量
        int a = 1;
        int b = 1;
        test1();
    }

    public static void test1() {
        int a = 1;
        test2();
    }
    public static void test2() {
        int a = 1;
        test3();
    }
    public static void test3() {
        int a = 1;
    }
}

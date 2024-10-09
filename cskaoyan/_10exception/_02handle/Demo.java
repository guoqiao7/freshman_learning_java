package com.cskaoyan._10exception._02handle;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/11 9:39
 **/
/*
JVm默认处理流程
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("main start");
        m1();
        System.out.println("main end");
    }

    public static void m1() {
        System.out.println("m1 start");
        System.out.println(10/0);
        System.out.println("m1 end");

    }
}

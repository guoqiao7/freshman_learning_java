package com.cskaoyan._05oop1._13access._02member.anoter;

import com.cskaoyan._05oop1._13access._02member.one.Demo;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/5 9:04
 **/

public class DemoTest {
    public static void main(String[] args) {
        Demo demo = new Demo();
        // 访问普通成员
        // 只有public能访问
        System.out.println(demo.a);
        //System.out.println(demo.b);
        //System.out.println(demo.c);
        demo.m1();
        //demo.m2();
        //demo.m3();

        // 访问静态成员
        System.out.println(Demo.aa);
        //System.out.println(Demo.bb);
        //System.out.println(Demo.cc);
        Demo.m4();
        //Demo.m5();
        //Demo.m6();
    }
}

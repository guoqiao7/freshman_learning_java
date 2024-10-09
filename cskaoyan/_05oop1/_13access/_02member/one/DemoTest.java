package com.cskaoyan._05oop1._13access._02member.one;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/5 8:55
 **/

public class DemoTest {
    public static void main(String[] args) {
        // 同包不同类中进行测试能否访问
        Demo demo = new Demo();
        // 访问普通成员
        System.out.println(demo.a);
        System.out.println(demo.b);
        //c' has private access in 'com.cskaoyan._05oop1._13access._02member.one.Demo'
        // System.out.println(demo.c);
        demo.m1();
        demo.m2();
        //m3()' has private access in 'com.cskaoyan._05oop1._13access._02member.one.Demo
        //demo.m3();

        // 访问静态成员
        System.out.println(Demo.aa);
        System.out.println(Demo.bb);
        // private权限
        // System.out.println(Demo.cc);
        Demo.m4();
        Demo.m5();
        // private权限
        // Demo.m6();
    }
}

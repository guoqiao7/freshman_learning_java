package com.cskaoyan._05oop1._13access._02member.one;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/5 8:52
 **/

public class Demo {
    // 定义成员变量
    public int a = 1;
    int b = 2;
    private int c = 3;

    // 定义成员方法
    public void m1() {
        System.out.println("m1");
    }
    void m2() {
        System.out.println("m2");
    }
    private void m3() {
        System.out.println("m3");
    }

    // 定义静态成员变量
    public static int aa = 10;
    static int bb = 10;
    private static int cc = 10;

    // 定义静态成员方法
    public static void m4() {

    }

    static void m5() {

    }
    private static void m6() {

    }


    // 在本类中进行测试 ---> 如果是本类中进行的访问操作 --->权限没有影响
    public void test() {
        // 访问成员变量
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        // 访问普通成员方法
        m1();
        m2();
        m3();
        // 访问静态成员
        System.out.println(Demo.aa);
        System.out.println(Demo.bb);
        System.out.println(Demo.cc);
        m4();
        m5();
        m6();
    }
}

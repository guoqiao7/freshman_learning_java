package com.cskaoyan._05oop1._11block._03static;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/4 9:12
 **/
/*
验证类是否加载

类加载时机:
   1.new对象 (首次)
   2.执行main
   3.访问类中的静态成员(2部分)
 */
public class Demo2 {
    static {
        System.out.println("Demo2类加载了");
    }
    public static void main(String[] args) {
        System.out.println("main方法开始执行了!");
        A a1 = new A();
        // A a2 = new A();

        System.out.println(B.b);

        C.m1();
    }
}
class A{
    static {
        System.out.println("A类加载了");
    }
}

class B{
    static int b = 1;
    static {
        System.out.println("B类加载了!");
    }
}

class C{
    static {
        System.out.println("C类加载了!");
    }

    static void m1() {
        System.out.println("C  m1方法执行了!");
    }

}
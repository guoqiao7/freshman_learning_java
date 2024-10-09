package com.cskaoyan._07oop3._02interface._04default;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/8 16:20
 **/

/*
// 默认方法的语法:
default 返回值类型 方法名(形参列表){
    //方法体
}
 */
public class Demo {
    public static void main(String[] args) {
        IA a = new A();
        a.m2();
        a.m1();
        // 调用静态方法
        IA.m3();
    }
}

interface IA {
    void m2();

    // 默认方法
    default void m1() {
        System.out.println("default m1");
    }

    static void m3() {
        System.out.println("static method");
    }
}
class A implements IA{

    @Override
    public void m2() {
        System.out.println("A中的实现");
    }
}

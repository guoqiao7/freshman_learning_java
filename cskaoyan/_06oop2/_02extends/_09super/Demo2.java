package com.cskaoyan._06oop2._02extends._09super;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/6 9:22
 **/
/*
super关键字: 把super近似的看做一个引用(其实不是),指向的是
子类对象中的父类成员区域

作用:
    1.super(实参) 调用父类的构造器
    2.super区分同名的父类类成员 super.访问的是父类的成员
 */
public class Demo2 {
    public static void main(String[] args) {

    }
}

class Animal{
    int a = 1;

    private int c = 11;

    public void  m1() {
        System.out.println("animal m1");
    }
}

class Dog extends Animal{
    int a = 10;

    private String name;

    public void  m1() {
        System.out.println("dog m1");
    }

    public void test() {
        // a
        // 直接访问是子类的成员
        System.out.println(a);
        // 想要使用父类中的a
        // 使用super
        System.out.println(super.a);
        // c' has private access in 'c
        // 受权限影响
        // System.out.println(super.c);

        m1();
        // 父类
        super.m1();

        System.out.println(this);
        System.out.println(this.name);

        // System.out.println(super);
    }
}
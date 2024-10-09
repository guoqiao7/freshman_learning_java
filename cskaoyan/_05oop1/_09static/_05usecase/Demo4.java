package com.cskaoyan._05oop1._09static._05usecase;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/3 16:22
 **/
/*
分析程序执行流程
1.类加载过程
    给类中的静态成员赋值:
    默认赋值
    显式赋值

2.创建对象过程
    给类中的普通成员变量赋值:
    默认赋值
    显示赋值
    构造器赋值
 */
public class Demo4 {
    static Cat cat = new Cat();
    Dog dog = new Dog();
    Dog dog2;
    static Dog dog3;

    public static void main(String[] args) {
        System.out.println("hello world!");
        Demo4 d = new Demo4();
    }

    public Demo4() {
        System.out.println("demo");
    }
}

class Cat {
    static Dog dog = new Dog();

    public Cat() {
        System.out.println("cat");
    }
}

class Dog {
    public Dog() {
        System.out.println("dog");
    }
}
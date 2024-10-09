package com.cskaoyan._05oop1._11block._04classload;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/4 10:07
 **/

public class Demo2 {
    static {
        System.out.println("Demo2类开始初始化步骤了!");
    }

    static Cat cat = new Cat();
    Dog dog = new Dog();

    public static void main(String[] args) {
        System.out.println("hello world!");
        Demo2 d = new Demo2();
    }

    public Demo2() {
        System.out.println("demo");
    }
}

class Cat {
    static {
        System.out.println("Cat类开始初始化步骤了!");
    }

    static Dog dog = new Dog();

    public Cat() {
        System.out.println("cat");
    }
}

class Dog {
    static {
        System.out.println("Dog类开始初始化步骤了!");
    }

    static Demo2 demo = new Demo2();

    public Dog() {
        System.out.println("dog");
    }
}

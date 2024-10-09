package com.cskaoyan._05oop1._09static._03classload;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/3 16:25
 **/
/*
类加载过程:
    静态的东西随着类的加载而加载
    静态成员变量的赋值:
    1.先默认赋值
    2.通过=赋值符号再显式赋值
 */
public class Demo2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
    }
}

class Dog{
    static String name = "Tom";
    static int age = 2;

    public Dog() {
    }
}
package com.cskaoyan._06oop2._02extends._03cast;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/5 14:59
 **/
/*
引用数据类型的类型转换:
1.自动类型转换  小--->大
2.强制类型转换  大--->小
 */
public class Demo {
    public static void main(String[] args) {
        // 基本数据
        // 自动类型转换 小--->大 不需要额外的代码
        byte a = 1;
        int b = a;
        // 强制类型转换 大---->小 需要写额外的代码
        byte b1 = (byte) b;

        // 引用数据类型的类型转换前提---->继承
        Dog dog1 = new Dog();
        // Cat cat = dog1;

        //自动类型转换  小--->大 (向上转型)
        Dog dog = new Dog();
        Animal animal = dog;

        // 强制类型转换  大--->小 (向下转型)
        Animal animal1 = new Animal();
        // 需要使用额外的代码
        // java.lang.ClassCastException 类型转换异常
        Cat cat = (Cat) animal1;


    }
}

class Animal{

}

class Dog extends Animal{

}

class Cat extends Animal{

}
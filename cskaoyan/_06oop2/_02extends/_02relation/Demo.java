package com.cskaoyan._06oop2._02extends._02relation;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/5 14:48
 **/
/*
子类 "is-a"父类。子类可以近似地看成是一个父类，子类可以当作父类来使用.
 */
public class Demo {
    public static void main(String[] args) {
        // Cat是Animal
        // Dog是Animal
        // 如果反过来就有问题
        // 动物是猫或者是狗


        // 代码角度
        // 创建谁的对象用谁的引用接收
        Father father = new Father();
        Son son = new Son();
        // 父类引用指向子类对象
        Father fs = new Son();
        // 把苹果当做水果来使用
        // Son sf = new Father();
    }
}

class Father{

}

class Son extends Father{

}

class Animal{

}

class Dog extends Animal{

}

class Cat extends Animal{

}

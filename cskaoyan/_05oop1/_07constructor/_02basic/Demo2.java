package com.cskaoyan._05oop1._07constructor._02basic;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/3 9:26
 **/
/*
成员变量的赋值顺序问题:
赋值手段:
    1.默认赋值
    2.显式赋值
    3.构造器赋值

===>构造器赋值最后一步,默认赋值是第一步
===>最终赋值顺序
    1.默认
    2.显式
    3.构造器
 */
public class Demo2 {
    public static void main(String[] args) {
        // 创建Person对象  通过构造器赋值
        Person person = new Person("ls", 20);
        System.out.println(person.age); // 20
        System.out.println(person.name); // ls
    }
}

class Person{
    String name = "zs";
    int age = 10;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }
}
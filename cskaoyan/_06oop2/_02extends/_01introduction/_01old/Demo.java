package com.cskaoyan._06oop2._02extends._01introduction._01old;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/5 14:30
 **/
/*
分别定义一个表示人和学生的类：
1. 人类：有姓名属性，以及吃饭这个行为
2. 教师类：有姓名，教师号两个属性，同时有吃饭，教学两种行为
3. 学生类：有姓名，学号两个属性，同时有吃饭，学习两种行为
 */
public class Demo {
}

class Person{
    String name;
    public void eat() {
        System.out.println("eat----");
    }
}
class Teacher{
    String name;
    int tId;
    public void eat() {
        System.out.println("eat----");
    }

    public void teach() {
        System.out.println("teach----");
    }
}

class Student{
    String name;
    int sId;
    public void eat() {
        System.out.println("eat----");
    }

    public void study() {
        System.out.println("study----");
    }
}
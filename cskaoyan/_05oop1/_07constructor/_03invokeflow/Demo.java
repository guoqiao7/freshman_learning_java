package com.cskaoyan._05oop1._07constructor._03invokeflow;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/3 9:36
 **/

public class Demo{
    public static void main(String[] args){

        Student stu = new Student(18,"王冰冰");

    }
}

class Student {
    int age = 10;
    String name = "张三";
    double a = 100;

    public Student(int age) {
        System.out.println("Student age");
        this.age = age;
    }

    public Student() {
    }

    public Student(int age, String name) {
        this(age);
        System.out.println("Student age，name");
        this.name = name;
    }
}
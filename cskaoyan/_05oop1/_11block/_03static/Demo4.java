package com.cskaoyan._05oop1._11block._03static;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/4 9:24
 **/

public class Demo4 {
    // 定义静态成员变量
    static Student[] students = new Student[3];

    // 静态代码块完成赋值初始化
    static {

        init();
    }

    // 静态方法
    public static void init() {
        // System.out.println("init ---");
        students[0] = new Student("zs", 20);
        students[1] = new Student("ls", 20);
        students[2] = new Student("ww", 20);
    }

    public static void main(String[] args) {

    }
}

class Student{
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
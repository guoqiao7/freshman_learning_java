package com.cskaoyan._05oop1._08game._04order;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/3 14:08
 **/

public class Demo {
    public static void main(String[] args) {
        Student s = new Student(18, "长风");
        System.out.println(s.age);
        System.out.println(s.name);
        System.out.println(s.var);
        System.out.println(s.cat.price);
    }
}
class Student {
    int age = 10;
    String name = "张三";
    double var = 20;

    public Student(int age) {
        System.out.println("Student age");
        this.age = age;
    }

    public Student() {
    }

    public Student(int age, String name) {
        this(age);
        System.out.println("Student age,name");
        this.name = name;
    }

    // 成员位置
    Cat cat = new Cat(1000);
    Cat c2;
}

class Cat {
    double price;

    public Cat() {
    }

    public Cat(double price) {
        System.out.println("Cat price");
        this.price = price;
    }
}
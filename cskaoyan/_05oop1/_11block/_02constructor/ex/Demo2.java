package com.cskaoyan._05oop1._11block._02constructor.ex;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/4 9:00
 **/

public class Demo2 {
    public static void main(String[] args) {
        Cat c = new Cat(28, "紫色");
        System.out.println(c.age);
        System.out.println(c.color);
    }
}

class Cat {
    {
        age = 18;
        System.out.println("age building block");
    }

    int age = 10;
    String color = "黄色";

    {
        color = "黑色";
        System.out.println("color building block");
    }

    public Cat() {
    }

    public Cat(int age) {
        System.out.println("age constructor");
        this.age = age;
    }

    public Cat(int age, String color) {
        this(age);
        System.out.println("age color constructor");
        this.color = color;
    }
}
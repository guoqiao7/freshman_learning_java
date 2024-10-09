package com.cskaoyan._05oop1._11block._02constructor;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/3 17:23
 **/

public class Demo2 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Teacher teacher1 = new Teacher("ls");
        Teacher teacher2 = new Teacher("ww", 25);
    }
}

class Teacher{

    String name = "zs";
    int age = 30;
    {
        // 构造代码块
        System.out.println(11111);
    }
    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Teacher() {
    }

    public Teacher(String name) {
        this.name = name;
    }
}
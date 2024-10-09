package com.cskaoyan._05oop1._04reference;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/2 15:55
 **/

public class Demo2 {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        Teacher t2 = t1;
        t2.name = "ls";
        t2.salary = 15000;
        Teacher t3 = new Teacher();
        t3.salary = 12000;


        System.out.println(t1.name);
        System.out.println(t2.name);
        System.out.println(t3.name);
        System.out.println(t1.salary);
        System.out.println(t2.salary);
        System.out.println(t3.salary);
    }
}

class Teacher{
    // 定义成员变量的时候通过=直接赋值 成员变量的显式赋值
    String name = "zs";
    double salary = 10000;
}
package com.cskaoyan._05oop1._09static._05usecase;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/3 16:08
 **/
/*
创建一个学生类,  有2个属性: 姓名String name , 学号int id
统计外部创建Student类对象的个数 假设给Student类的对象自动编号
这个编号第一次创建对象是10001 随后每创建一个新对象就+1
学号会自动增长
10001
10002
10003
 */
public class Demo2 {
    public static void main(String[] args) {
        Student2 s1 = new Student2("zs");
        Student2 s2 = new Student2("ls");
        Student2 s3 = new Student2("ww");

        System.out.println("一共创建了"+ Student2.count + "个学生对象");
        System.out.println(s1.id);
        System.out.println(s2.id);
        System.out.println(s3.id);
    }
}

class Student2{
    String name;
    int id;
    // 用于统计个数的静态成员变量
    static int count;

    // 初始学号
    static int initNumber = 10001;

    public Student2(String name) {
        this.name = name;
        count++;
        // 对学号进行赋值
        this.id = initNumber++;
    }
}
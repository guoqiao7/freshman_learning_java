package com.cskaoyan._05oop1._07constructor._01introduction;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/3 9:07
 **/
/*

注意:
    1.类中没有构造器,会有一个默认的无参构造器
    2.如果类中有构造器,就没有这个无参构造器了(只能自己添加一个无参构造)
 */
public class Demo3 {
    public static void main(String[] args) {
        // 创建Student对象
        Student student = new Student();

    }
}

class Student{
    String name;

    public Student(String name) {
        this.name = name;
    }

    public Student() {
    }
}
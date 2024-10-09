package com.cskaoyan._06oop2._02extends._12final._03var._02member;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/8 9:24
 **/
/*
final修饰成员变量---> 成员常量
    成员常量会有1个固定的值, 不能是默认值.
    需要进行初始化 ---> 赋值
    赋值方式:
        1.显式赋值
        2.构造代码块
        3.构造器来赋值
    注意:
        赋值的时候,只能选择上述的一种方式

 */
public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println(s1.age);
        System.out.println(s2.age);
        //Cannot assign a value to final variable 'age'
        // s1.age = 30;
    }
}

class Student{
    // 定义成员变量
    // Variable 'name' might not have been initialized
    final String name = "zs";
    final int age;

    {
        age = 20;
    }

    public Student() {
    }


}
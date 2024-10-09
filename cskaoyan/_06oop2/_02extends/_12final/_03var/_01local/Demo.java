package com.cskaoyan._06oop2._02extends._12final._03var._01local;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/8 9:13
 **/
/*
final修饰变量----> 常量
    常量的分类:
        1.字面值常量
            直接写在代码里面的额
            整数常量  1, 2,  4
            小数常量  1.1 2.2
            布尔常量  true  / false
            字符常量  'a'
            字符串常量 "abc" "你好"
            空常量  null
        2.自定义常量
            被final修饰的变量
    变量类型是基本数据类型
        值是常量,不能改变
    变量类型是引用数据类型
        引用的指向不能变

局部变量
成员变量
静态成员变量
 */
public class Demo {
    public static void main(String[] args) {
        // 局部位置
        // 基本数据类型局部变量
        final int a = 1; // 常量
        System.out.println(a);
        // 不能更改
        //Cannot assign a value to final variable 'a'
        // a++;


        //引用数据类型的局部变量
        final Student s1 = new Student("zs", 20);
        System.out.println(s1.age);
        System.out.println(s1.name);

        Student s2 = new Student("ls", 21);
        //Cannot assign a value to final variable 's1
        // s1 = s2;
    }

    public static void m1(final int a) {
        System.out.println(a);
        //Cannot assign a value to final variable 'a'
        // a = a+1;
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
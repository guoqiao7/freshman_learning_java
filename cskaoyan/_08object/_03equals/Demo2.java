package com.cskaoyan._08object._03equals;

import java.util.Objects;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/9 9:28
 **/

public class Demo2 {
    public static void main(String[] args) {
        Student s1 = new Student("zs", 20);
        Student s2 = new Student("zs", 20);
        // 如果要基于内容的比较 --->重写equals方法
        // 如果内容都相等--->这2个对象相等

        System.out.println(s1.equals(s2));

        Stu2 s3 = new Stu2("zs", 20);
        System.out.println(s1.equals(s3));
    }
}

class Student{
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // alt+insert重写equals方法

    //@Override
    //public boolean equals(Object o) {
    //    // 自反性
    //    if (this == o) return true;
    //    // 排他性
    //    if (o == null || getClass() != o.getClass()) return false;
    //    // 比较成员变量的取值
    //    Student student = (Student) o;
    //
    //    if (age != student.age) return false;
    //    return Objects.equals(name, student.name);
    //}


    @Override
    public boolean equals(Object o) {
        // 自反性
        if (this == o) return true;
        // 排他性 范围放宽 使用instanceof
        if (o == null || !(o instanceof Student)) return false;
        // 比较成员变量的取值
        Student student = (Student) o;

        if (age != student.age) return false;
        return Objects.equals(name, student.name);
    }
}

class Stu2 extends Student{

    public Stu2(String name, int age) {
        super(name, age);
    }
}
package com.cskaoyan._05oop1._13access._03notice;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/5 9:26
 **/

public class Student {
    String name;
    int age;

    private Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 提供一个给外界访问的入口 来获取对象的
    // 希望对象的年龄在[18,25]
    // 名字长度不超过5
    public static Student getInstance(String name,int age) {
        // do sth
        if (name.length() > 5 || (age < 18 || age > 25)) {
            // 抛出异常或者不给你返回对象
            return null;
        }
        return new Student(name, age);
    }
}

package com.cskaoyan._05oop1._13access._03notice;

import sun.applet.Main;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/5 9:27
 **/

public class StudentTest {
    public static void main(String[] args) {
        // 构造器私有 无法从外部创建对象
        // Student student = new Student("zs", 20);
        // 以XXXFactory 命名的类---->工厂类

        Student student = Student.getInstance("zszzzzz", 20);
        System.out.println(student);

        Student student1 = Student.getInstance("zs", 20);
        System.out.println(student1);
    }
}

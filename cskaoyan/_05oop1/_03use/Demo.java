package com.cskaoyan._05oop1._03use;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/2 14:26
 **/
/*
对象的创建与使用:
Scanner scanner = new Scanner();
new ---> 表示在堆上开辟空间 创建对象
语法:
类名 对象名 = new 类名();

使用对象:
    可以直接打印
    同过对象名.访问 或修改属性值
    通过对象名.成员方法名(实参) 来进行方法调用
 */
public class Demo {
    public static void main(String[] args) {
        // int[] arr = {1, 1, 1};
        // 类名 对象名 = new 类名();
        Student student = new Student();
        // 直接打印
        // com.cskaoyan._05oop1._03use.Student@677327b6
        // com.cskaoyan._05oop1._03use.Student--->全类名
        // @ 固定写法
        // 677327b6对象地址值
        System.out.println(student);
        // f:field --->成员变量
        // m:method--->方法
        // 通过对象名.成员变量名来访问
        System.out.println(student.age);// 0
        System.out.println(student.name);// null

        // 通过对象名.成员变量名来修改
        student.name = "zs";
        student.age = 20;
        System.out.println(student.age);
        System.out.println(student.name);

        // 通过对象名.方法名(实参)
        student.study();

    }
}

class Student{
    String name;
    int age;

    public void study() {
        System.out.println("study!");
    }

}
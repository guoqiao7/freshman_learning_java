package com.cskaoyan._05oop1._04reference;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/2 15:21
 **/
/*
数据类型:
    1.基本数据类型 4类8种
    2.引用数据类型
引用数据类型: 引用+对象
数据类型 : 数据的集合 + 操作的集合
延伸到class类型这里:
    1.成员变量(属性的集合,即数据的集合)
    2.成员方法(操作的集合)
===> 定义了一个class--->自定义了一种数据类型
比如int a = 1; 属于java内置的数据类型
自定义的class类型, JVM不认识的
---->让JVM认识了解咱们自己定义的class类型的过程
---->类加载

类加载时机(什么时候触发类的加载)
1.new创建对象之前(首次)
2.执行main方法前,加载main方法所在的这个类

 */
public class Demo {
    public static void main(String[] args) {
        // 创建Dog对象之前会触发Dog类的加载
        //Dog dog = new Dog();
        //Dog dog2 = new Dog();

        Student student = new Student();
        student.age = 20;
        student.name = "zs";

    }
}
class Dog{
    String name;
}

class Student{
    String name;
    int age;

}
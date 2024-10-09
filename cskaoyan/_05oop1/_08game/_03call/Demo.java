package com.cskaoyan._05oop1._08game._03call;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/3 14:03
 **/
/*
练习：
定义一个学生类，该类具有一个int属性age
1.在测试类中写一个方法，交换两个Student对象的age属性
		请问能够交换成功吗？原因是什么？

2.在测试类中写一个方法，交换两个Student对象的引用（地址）
		请问能够交换成功吗？原因是什么？
 */
public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student(10);

        Student s2 = new Student(20);
        System.out.println("-----交换之前----");
        System.out.println(s1.age);
        System.out.println(s2.age);

        // swap(s1, s2);
        swap2(s1, s2);

        System.out.println("-----交换之后----");
        System.out.println(s1.age);
        System.out.println(s2.age);
    }

    public static void swap(Student s1, Student s2) {
        // 交换age
        int temp = s1.age;
        s1.age = s2.age;
        s2.age = temp;
    }

    public static void swap2(Student s1, Student s2) {
        // 交换引用
        Student temp = s1;
        s1 = s2;
        s2 = temp;
    }

}

class  Student{
    int age;

    public Student(int age) {
        this.age = age;
    }
}
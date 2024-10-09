package com.cskaoyan._05oop1._06this;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/2 16:49
 **/
/*
注意:
1. this指向当前对象的隐含传参，必须是在普通成员方法中，加static的方法中，没有该this传参。（所以static方法不能直接访问类的成员，需要先创建对象才能访问。）
2. 既然this指向当前对象，那么不同的this指向的对象必然不同。
 */
public class Demo2 {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student);
        //com.cskaoyan._05oop1._06this.Student@677327b6

        student.print();

    }
}

class Student{
    String name;
    int age;
    public void print() {
        // this是一个引用指向的是地址(当前对象)
        System.out.println(this);
        //com.cskaoyan._05oop1._06this.Student@677327b6
    }

    public static void m1() {
        // Non-static field 'name' cannot be referenced from a static context
        // System.out.println(name);
        // print();
        // 在静态上下文中无法直接访问非静态的东西 没有this传参
        // 但是可以间接访问
        // 可以通过创建一个对象
        Student student = new Student();
        System.out.println(student.age);
        System.out.println(student.name);
        student.print();
    }
}

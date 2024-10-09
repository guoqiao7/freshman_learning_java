package com.cskaoyan._05oop1._11block._02constructor.ex;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/4 8:54
 **/
/*
创建一个类Student，类中有多个构造器，请写代码统计外部创建Student对象的次数。
 */
public class Demo {
    public static void main(String[] args) {
        Student student = new Student();
        Student student1 = new Student("zs");
        Student student2 = new Student("ls", 3);

        System.out.println("共创建了"+Student.count);
    }
}

class Student{
    String name;
    int id;
    static int count;
    {
     // 构造代码块
     count++;
    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        //count++;
    }

    public Student(String name) {
        this.name = name;
        //count++;
    }

    public Student() {
        //count++;
    }
}

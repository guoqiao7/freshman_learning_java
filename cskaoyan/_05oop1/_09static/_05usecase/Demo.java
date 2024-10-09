package com.cskaoyan._05oop1._09static._05usecase;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/3 16:02
 **/
/*
创建一个学生类，用来描述我们班全体同学
要求：
属性：姓名，性别，年龄，学号，学校信息
行为：吃饭，学习
我们简单思考可以知道, 无论你是张三或者李四, 学校信息这个属性实质上应该是被全体同学所共有的属性，而不是独属于某个对象的, 这种场景下就可以使用static 修饰学校信息
 */
public class Demo {
    public static void main(String[] args) {
        // Student s1 = new Student("zs", 20, 1, true, "计算机1班");
        // Student s2 = new Student("ls", 20, 2, true, "计算机1班");

        Student s1 = new Student("zs", 20, 1, true);
        Student s2 = new Student("ls", 20, 1, true);
        System.out.println(s1.name);
        System.out.println(Student.schoolInfo);
        System.out.println(s2.name);
        System.out.println(Student.schoolInfo);
    }
}

class Student{
    String name;
    int age;
    int id;
    boolean gender;
    static String schoolInfo = "计算机1班";

    //public Student(String name, int age, int id, boolean gender, String schoolInfo) {
    //    this.name = name;
    //    this.age = age;
    //    this.id = id;
    //    this.gender = gender;
    //    this.schoolInfo = schoolInfo;
    //}


    public Student(String name, int age, int id, boolean gender) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.gender = gender;
    }
}
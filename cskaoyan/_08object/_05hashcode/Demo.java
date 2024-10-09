package com.cskaoyan._08object._05hashcode;

import java.util.Objects;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/9 10:35
 **/
/*
源码:
public native int hashCode();
native : 本地方法
int : 哈希值
 */
public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        int i = s1.hashCode();
        int i2 = s1.hashCode();
        int i3 = s1.hashCode();
        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);

        Student s2 = new Student("zs", 20);
        Student s3 = new Student("zs", 20);
        System.out.println(s2.equals(s3));
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
    }
}

class Student{
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}
package com.cskaoyan._06oop2._02extends._06protected;

import com.cskaoyan._06oop2._02extends._06protected.two.Teacher;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/5 16:48
 **/

public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student = new Student();
        // Object有个方法 clone
        // clone()' has protected access
        student.clone();
        // Object 在java.lang
        // 当前包 com.cskaoyan._06oop2._02extends._06protected
        // 包不一样 只有创建Demo对象 才能访问
        Demo demo = new Demo();
        // Unhandled exception: java.lang.CloneNotSupportedException
        demo.clone();


        Teacher teacher = new Teacher();
        teacher.clone();
    }
}


class Student{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
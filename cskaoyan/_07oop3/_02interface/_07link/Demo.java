package com.cskaoyan._07oop3._02interface._07link;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/8 17:13
 **/

public class Demo {
    public static void main(String[] args) {
        //Student student = new Student();
        //Teacher teacher = student.getTeacher();
        //teacher.show();

        // 链式调用
        new Student().getTeacher().show();
    }
}

class Student{

    public Student getStudent(){
        return new Student();
    }

    public Teacher getTeacher(){
        return new Teacher();
    }
}
class Teacher{
    public void show(){
        System.out.println("秀一波~~~");
    }
}
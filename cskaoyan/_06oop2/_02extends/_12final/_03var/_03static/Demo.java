package com.cskaoyan._06oop2._02extends._12final._03var._03static;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/8 9:37
 **/
/*
final修饰静态成员变量--->全局常量
[访问权限修饰符] static final 数据类型 变量名;

要进行初始化, 不能是默认初始化
    赋值方式:
        1.显式赋值
        2.静态代码块
    注意: 只能选择上述其中1种方式

比如 int的最大值
Integer.MAX_VALUE
 */
public class Demo {
    public static void main(String[] args) {
        //Student.score = 100;
        //Student.score = 99;

        System.out.println(Student.STUDENT_NAME);
        // 不能修改
        // 源代码中的
        System.out.println(Integer.MAX_VALUE);
    }
}

class Student{
    // 静态成员变量
    final static String STUDENT_NAME = "zs";
    static final int AGE;
    // final static int score;
    // 通过静态代码块进行赋值
    static {
        AGE = 20;
    }
}
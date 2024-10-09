package com.cskaoyan._05oop1._13access._03notice;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/5 9:09
 **/

public class Demo {
    // 代码块不能使用权限修饰符
    //Modifier 'public' not allowed here
    //public {
    //    // 构造代码块
    //}

    //Modifier 'public' not allowed here
    //public static {
    //
    //}

    int a;
    public static void main(String[] args) {
        // 局部变量 不能使用权限修饰符
        // Modifier 'public' not allowed here
        // public int a = 1;
        // private int a = 1;

        Demo demo = new Demo();
        Demo demo1 = new Demo(1);
    }

    // 自动生成的构造器 默认是public的
    private Demo() {
    }

    public Demo(int a) {
        this.a = a;
    }
}

package com.cskaoyan._05oop1._02define;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/2 14:14
 **/

/*
类中结构的定义
    1.成员变量--->描述共有属性
    2.成员方法--->描述共有行为

成员变量(属性): 定义在成员位置的变量
什么是成员位置?
    --->类体中,方法外

语法:
    [修饰符列表] 数据类型 成员变量名;
作用域:
    在类中的所有成员方法中生效

成员方法:
    [访问权限修饰符] 返回值类型 方法名(形参列表){
  // 方法体 do sth
}
    跟之前讲的方法 区别是没有static
 */
public class Demo2 {
    // 成员位置
    int a = 1;
    public static void main(String[] args) {
        // Non-static field 'a' cannot be referenced from a static context
        // 在静态上下文中无法访问成员变量
        // System.out.println(a);
    }

    // 成员位置
    String s = "abc";
    public static void m1() {

    }
    // 成员位置
    int b;

    public void m2() {
        // 成员方法
    }

    public int m3() {
        // 成员方法
        return 1;
    }

    public int m4(int a, int b) {
        return a+b;
    }
}

class Student{
    // 定义成员变量(属性)
    int id;
    String name;
    boolean gender;
    int score;

    // 定义成员方法(行为)
    public void sleep() {
        System.out.println("sleep----");
    }
    public void eat() {
        System.out.println("eat----");
    }

    public void study() {
        System.out.println("我爱学习!");
    }
}
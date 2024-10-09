package com.cskaoyan._07oop3._01abstract._02basic;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/8 14:28
 **/
/*
抽象类的特点我们主要从以下角度：

1. 类名命名特点是什么?
    抽象类命名 ---> 遵循大驼峰
    一般以BaseXXX / AbstractXXX
2. 能用哪些修饰符？
    跟普通类一样 public/默认
3. 成员特点
   1. 普通成员--->OK
   2. 静态成员--->OK
   3. 抽象方法--->OK
4. 构造器--->OK
5. 代码块--->OK

结论:抽象类就是在普通类的基础上 加上了一个抽象方法
 */
public class Demo {
    public static void main(String[] args) {

    }
}

abstract class AbstractA{
    // 普通成员
    int a = 1;

    public void testA() {

    }

    // 静态成员
    static String name = "dog";
    public static void testB() {

    }

    // 定义抽象方法
    public abstract void testC();

    {
        // 构造代码块
    }
    static {
        // 静态代码块
    }

    public AbstractA() {
    }
}

//llegal combination of modifiers: 'final' and 'abstract'
//final abstract class AbstractB{
//
//}

//Modifier 'private' not allowed
//private abstract class AbstractB{
//
//}
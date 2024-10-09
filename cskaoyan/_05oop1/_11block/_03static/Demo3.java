package com.cskaoyan._05oop1._11block._03static;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/4 9:20
 **/
/*
静态成员的赋值:
1.默认赋值
2.显式赋值
3.静态代码块赋值

===>测试结论:
1.默认赋值
显式赋值与静态代码块赋值 看书写顺序  写在上面的结构先执行
 */
public class Demo3 {
    public static void main(String[] args) {
        System.out.println(Stu.a);
    }
}

class Stu{
    static {
        a = 2;
    }
    static int a = 1;
}
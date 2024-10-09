package com.cskaoyan._01basic._05varible;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/29 10:37
 **/

/*
局部变量的使用:
1. 声明局部变量
    数据类型 变量名;
2. 初始化局部变量
    给变量赋值的过程
 */
public class Demo2 {
    public static void main(String[] args) {
        int a;
        a = 1;
        // Variable 'a' might not have been initialized
        System.out.println(a);
        int b = 1;
        System.out.println(b);

        int c,d,e,f=1;
        c = 1;
        d = 2;
    }
}

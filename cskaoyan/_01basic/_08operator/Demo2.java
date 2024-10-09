package com.cskaoyan._01basic._08operator;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/29 14:42
 **/

public class Demo2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int c = 10;
        a = b++;  // b = 11 , a =10
        System.out.println(a);
        System.out.println(b);
        System.out.println("------");
        c = --a;  // c=9 a=9
        System.out.println(a);
        System.out.println(c);
        System.out.println("------");

        b = ++a; // a=10 b=10
        System.out.println(a);
        System.out.println(b);
        a = c--; // a=9  c=8
        System.out.println("a = " + a);//9
        System.out.println("b = " + b);//10
        System.out.println("c = " + c);//8
    }
}

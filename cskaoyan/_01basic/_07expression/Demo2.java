package com.cskaoyan._01basic._07expression;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/29 14:22
 **/

public class Demo2 {
    public static void main(String[] args) {
        System.out.println('a'); // a
        System.out.println('a' + 1);// 98
        System.out.println("hello" + 'a' + 1); //helloa1
        System.out.println('a' + 1 + "hello");// 98hello
        System.out.println("5 + 5 = " + 5 + 5);// "5 + 5 = 55"
        System.out.println(5 + 5 + " = 5 + 5");// 10=5+5
        System.out.println(5 + 5.0); //10.0
        System.out.println(5 + "5" + 5.0); // 555.0

        //long d = 11111111111L;
    }
}

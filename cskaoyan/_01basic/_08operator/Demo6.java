package com.cskaoyan._01basic._08operator;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/29 15:48
 **/

public class Demo6 {
    public static void main(String[] args) {
        //- 1、交换律 a^b^c = a^c^b
        int a = 5;
        int b = 8;
        int c = 13;
        System.out.println(a^b^c);
        System.out.println(a^c^b);
        //- 2、结合律 (a^b)^c == a^(b^c)
        System.out.println((a^b)^c);
        System.out.println(a^(b^c));
        //- 3、对于任何数x，都有 x^x=0，x^0=x
        //- 4、自反性: a^b^b=a^0=a;


        // 一个经典的问题：怎么算 2*16 最高效？可以采用移位运算
        // Math.pow()
        double result = Math.pow(2, 16);
        System.out.println("result = " + result);
        System.out.println(1<<16);
    }
}

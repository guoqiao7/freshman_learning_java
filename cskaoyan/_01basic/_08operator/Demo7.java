package com.cskaoyan._01basic._08operator;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/29 15:58
 **/
/*
三目运算符
(条件表达式) ? 表达式1 : 表达式2;
 */
public class Demo7 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        //int max = a > b ? a : b;
        //System.out.println();


        // 求三个数的最大值 别这样写
        int max = (a > b) ? (a > c) ? a : c : (b > c) ? b : c;
        boolean b1 = true ? false : true == true ? false : true;

    }
}

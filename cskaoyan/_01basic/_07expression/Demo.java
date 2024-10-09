package com.cskaoyan._01basic._07expression;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/29 14:14
 **/
/*
如果表达式当中存在多种数据类型 变量 参与运算，
由于表达式的运算结果是唯一的，所以结果 变量 的数据类型将会提升到"最大取值范围"的那个。
有以下规则：
1.  byte、short、char之间不互相转换，一旦发生运算，一律自动转换为int进行运算，结果是int
2.  byte、short、char任何数据类型与int进行计算，一律自动转换为int进行计算，结果是int
3.  byte、short、char、int任何数据类型与long进行计算，一律自动转换为long进行计算，结果是long
4.  byte、short、char、int、long任何数据类型与float进行计算，一律自动转换为float进行计算，结果是float
5.  byte、short、char、int、long、float任何数据类型与double进行计算，一律自动转换为double进行计算，结果是double
 */
public class Demo {
    public static void main(String[] args) {
        byte a = 1;
        byte a1 = 2;
        // byte+byte = int
        int a2 = a+a1;
        // int+byte  = int
        int a3 = a2 + a;
        long a4 = 1;
        // int +long = long
        long a5 = a3+a4;
        float a6 = 1.1F;
        // float + long = float
        float a7 = a5+a6;

        double a8 = 1.1;
        // 代码补全 alt+enter
        double v = a8 + a;


    }
}

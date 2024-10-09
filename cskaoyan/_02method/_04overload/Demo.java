package com.cskaoyan._02method._04overload;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/30 10:29
 **/
/*
引例，现在有三个需求，需要写三个方法完成：
1. 编写程序，计算两个int类型数据之和，并输出结果
2. 编写程序，计算两个double类型数据之和，并输出结果
3. 编写程序，计算两个long类型数据之和，并输出结果
 */
public class Demo {
    public static void main(String[] args) {

    }

    public static int getIntSum(int a, int b) {
        return a+b;
    }
    public static double getDoubleSum(double a, double b) {
        return a+b;

    }
    public static long getLongSum(long a, long b) {
        return a+b;
    }
}

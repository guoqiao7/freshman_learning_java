package com.cskaoyan._08object._03equals;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/9 10:21
 **/
/*
1. Float.compare(float a,float b)
2. Double.compare(double a,doublet b)

这两个方法在,a < b时返回-1(负数)，在a>b时，
返回1(正数)，只有在两个浮点数相等时，才会返回0
 */
public class Demo3 {
    public static void main(String[] args) {
       // System.out.println((1 - 0.9) == 0.1);
        double a = 1.0;
        double b = 0.9;
        int compare = Double.compare(a-b, 0.1);
        System.out.println(compare);
    }
}

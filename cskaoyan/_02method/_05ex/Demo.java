package com.cskaoyan._02method._05ex;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/30 10:19
 **/
/*
定义一个方法用于判断一个正整数的奇偶性，要求：
1. 奇数方法返回false
2. 偶数方法返回true


定义一个方法，求圆的面积：
1. 方法参数:半径 (radius)
2. 圆周率:3.14（获取用Math.PI获取）
 */
public class Demo {
    public static boolean judge(int n) {
        // do sth
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }

    public static boolean judge2(int n) {
        boolean flag = false;
        // do sth
        if (n % 2 == 0) {
            flag = true;
        }
        return flag;
    }

    public static double getArea(double r) {
        return Math.PI * r * r;
    }
}

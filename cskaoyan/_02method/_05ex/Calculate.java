package com.cskaoyan._02method._05ex;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/30 10:22
 **/
/*
定义一个计算器（Calculator）它的功能有：

1. 加，减，乘，除
2. 求平方
3. 求a的n次方
 */
public class Calculate {
    public static int getSum(int a,int b) {
        return a+b;
    }

    public static double getPow(double a,double n) {
        // 通过类名.方法名进行调用 静态方法
        return Math.pow(a, n);
    }
}

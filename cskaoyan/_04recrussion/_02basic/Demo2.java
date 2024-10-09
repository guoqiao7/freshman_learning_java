package com.cskaoyan._04recrussion._02basic;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/2 9:41
 **/
/*
案例2：使用递归计算N（N>=1）的阶乘**（factorial）**
使用数学归纳法找规律
f(1) = 1
f(2) = 1*2 = 2
f(3) = 1*2*3=6 = f(2) *3
f(4)= 1*2*3*4 =  f(3) *4
....
f(n) = 1*2*...n = f(n-1) * n
 */
public class Demo2 {
    public static void main(String[] args) {
        int n = 5;
        int result = factorial(n);
        System.out.println(result);
    }

    public static int factorial(int n) {
        // 递归出口
        if (n == 1) {
            return 1;
        }
        // 递归体
        return factorial(n-1) * n;
    }
}

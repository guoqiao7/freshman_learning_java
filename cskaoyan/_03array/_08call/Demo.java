package com.cskaoyan._03array._08call;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/2 8:49
 **/

public class Demo {
    public static void main(String[] args) {
        int a = 1;
        // 调用m1()
        m1(a);
        System.out.println("main " + a);
    }

    public static void m1(int a) {
        a *= 2;
        System.out.println("m1 " + a);
    }
}

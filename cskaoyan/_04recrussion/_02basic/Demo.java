package com.cskaoyan._04recrussion._02basic;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/2 9:39
 **/
/*
自然数求和
 */
public class Demo {
    public static void main(String[] args) {
        int n = 10;
    }

    public static int getSum(int n) {
        if (n == 0) {
            // do sth 结束
        }
        return n + getSum(n - 1);
    }
}

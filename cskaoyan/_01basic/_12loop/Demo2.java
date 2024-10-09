package com.cskaoyan._01basic._12loop;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/29 17:16
 **/

/*
单次for循环
1. 用for循环计算1+2+3+...+100
 */
public class Demo2 {
    public static void main(String[] args) {
        // 快捷键 fori
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}

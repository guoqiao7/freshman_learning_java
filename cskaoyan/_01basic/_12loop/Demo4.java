package com.cskaoyan._01basic._12loop;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/29 17:22
 **/
/*
珠峰的高度是8848m，假设有一张足够大可折叠的纸张，初始厚度是0.01m。
求解这张纸折叠多少次，纸张的厚度开始超过珠峰？
 */
public class Demo4 {
    public static void main(String[] args) {
        double n = 0.01;
        int count = 0;
        while (n <= 8848) {
            n *= 2;
            count++;
        }
        System.out.println("count = " + count);
    }
}

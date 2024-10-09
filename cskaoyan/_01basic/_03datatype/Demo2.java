package com.cskaoyan._01basic._03datatype;
/**
 * @description:
 * @author: 景天
 * @date: 2023/12/29 10:11
 **/

public class Demo2 {
    public static void main(String[] args) {
        // 以String作为引用数据类型为例
        String s = "abc";
        String s1 = "你好";

        // 字符串内容的比较 不要用==
        // 要使用equals方法进行比较
        String s2 = "aaa";
        String s3 = "aab";
        System.out.println(s2.equals(s3));
        System.out.println(s2+s3);
    }
}

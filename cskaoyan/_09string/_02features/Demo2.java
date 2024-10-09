package com.cskaoyan._09string._02features;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/9 15:06
 **/
/*
两种实例化方式:
1.直接赋值String s = "abc"
2.构造器赋值String s = new String("abc")
 */
public class Demo2 {
    public static void main(String[] args) {
        //String s = "abc";
        //String s2 = "abc";
        //System.out.println(s == s2);
        //s2 = "abcd";
        //System.out.println(s);

        String s2 = "abc";
        String s1 = new String("abc");
        System.out.println(s1 == s2);
    }
}

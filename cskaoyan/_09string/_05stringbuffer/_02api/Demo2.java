package com.cskaoyan._09string._05stringbuffer._02api;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/10 10:57
 **/

public class Demo2 {
    public static void main(String[] args) {
        String s = "abc";
        StringBuffer sb = new StringBuffer("abc");
        System.out.println(s);
        System.out.println(sb);
        // s.euqals(sb)
        System.out.println(s.equals(sb));
        // StringBuffer--->String
        String str = sb.toString();
        System.out.println(s.equals(str));
    }
}

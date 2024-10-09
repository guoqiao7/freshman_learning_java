package com.cskaoyan._09string._03api;

import java.util.Arrays;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/9 17:15
 **/

public class Demo4 {
    public static void main(String[] args) {
        String s = "abcdef";
        //String类的替换功能
        //在新的字符串中，用新(new)字符，替换旧(old)字符  "abcd"
        //String replace(char old,char new)
        //
        //在新的字符串中，用新的字符串(new), 替换旧(old)字符串
        //String replace(String old, String new)
        String s1 = s.replace("ef", "**");
        System.out.println("s1 = " + s1);

        //在新的字符串中，去掉开头和结尾的空格字符 "abc"  "abc "
        //String trim()
        String s2 = " abc ";
        String trim = s2.trim();
        System.out.println("trim = " + trim);
        // s2.replace(" ", "");


        //分隔功能
        //将字符串按照符号分隔成字符串数组  "a,b,c,d"
        //String[] split(String re)
        String s3 = "a,b,c,d";
        String[] split = s3.split(",");
        System.out.println(Arrays.toString(split));
        //String类的比较功能
        //int compareTo(String str)
        String s4 = "ab";
        String s5 = "abcde";
        int compare = s4.compareTo(s5);
        System.out.println("compare = " + compare);

        //int compareToIgnoreCase(String str)
    }
}

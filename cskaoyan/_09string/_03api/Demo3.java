package com.cskaoyan._09string._03api;

import java.util.Arrays;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/9 16:55
 **/

public class Demo3 {
    public static void main(String[] args) {
        String s = "abcdef";
        // 获取一个用来表示字符串对象字符序列的，字节数组
        //byte[] getBytes()
        byte[] bytes = s.getBytes();
        System.out.println(Arrays.toString(bytes));

        //获取的是用来表示字符串对象字符序列的，字符数组
        //char[] toCharArray()
        char[] chars = s.toCharArray();
        System.out.println(Arrays.toString(chars));

        //把字符数组转换成字符串
        //static String valueOf(char[] chs)
        String s1 = String.valueOf(chars);
        System.out.println("s1 = " + s1);

        //把各种基本数据类型和对象转换成字符串  100---> "100"
        //static String valueOf(int i/double...)
        String s2 = String.valueOf(100);
        System.out.println("s2 = " + s2);
        String s3 = String.valueOf(3.14);
        System.out.println("s3 = " + s3); //"3.14"
        String s4 = String.valueOf(true); // "true"


        //把字符串全部转化为小写
        //String toLowerCase()
        //
        //把字符串全部转换为大写
        //String toUpperCase()
        String upperCase = s.toUpperCase();
        System.out.println(upperCase);
        //字符串拼接，作用等价于 + 实现的字符串拼接
        //String concat(String str)
        String concat = s.concat("gh");
        System.out.println("concat = " + concat);
    }
}

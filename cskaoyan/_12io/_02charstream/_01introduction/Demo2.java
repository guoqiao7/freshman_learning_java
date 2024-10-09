package com.cskaoyan._12io._02charstream._01introduction;

import java.util.Arrays;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/12 16:28
 **/

public class Demo2 {
    public static void main(String[] args) {
        String s = "你";
        // '你' 20320

        // 1110xxxx 10xxxxxx 10xxxxxx
        // 11100100 10       10

        byte[] bytes = s.getBytes();
        System.out.println(Arrays.toString(bytes));

        // [-28, -67, -96]
        // 28的二进制  00011100
        // -28的补码   11100100
    }
}

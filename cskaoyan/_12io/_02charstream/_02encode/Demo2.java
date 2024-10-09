package com.cskaoyan._12io._02charstream._02encode;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/12 16:58
 **/

public class Demo2 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // Java中的编码与解码

        String s = "你好";
        // 编码--->getBytes(); 默认字符集
        // byte[] bytes = s.getBytes();
        // 指定字符集
        // getBytes(String charsetName)
        byte[] bytes = s.getBytes("GBK");

        System.out.println(Arrays.toString(bytes));
        // [-28, -67, -96, -27, -91, -67] utf-8
        // [-60, -29, -70, -61] gbk

        // 解码--->String的构造方法
        // String(byte[] bytes)
        // 通过使用平台的默认字符集解码指定的 byte 数组，构造一个新的 String。
        // String str = new String(bytes);
        // 使用指定的字符集进行解码
        // String(byte[] bytes, String charsetName)
        // 通过使用指定的 charset 解码指定的 byte 数组，构造一个新的 String
        String str = new String(bytes, "GBK");

        System.out.println("str = " + str);


    }
}

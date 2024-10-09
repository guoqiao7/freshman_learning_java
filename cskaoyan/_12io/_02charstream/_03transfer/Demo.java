package com.cskaoyan._12io._02charstream._03transfer;

import java.io.*;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/12 17:23
 **/
/*
使用转换流写数据
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        // 创建输出流对象
        // new OutputStreamWriter(new FileOutputStream(new File("a.txt")));
        // new OutputStreamWriter(new BufferedOutputStream(new FileOutputStream(new File("a.txt"))));
        OutputStreamWriter out = new OutputStreamWriter(
                new FileOutputStream("a.txt"));

        // write方法
        // write(int c) 写单个字符
        out.write(97);
        out.write(System.lineSeparator());

        // write(char[] c) 写字符数组数据
        String s = "宝,今天我输液了,什么夜,想你的夜";
        // String --->char[]
        char[] chars = s.toCharArray();
        out.write(chars);

        // write(char[] c,int off,int len) 写字符数组的部分
        // write(String s) 写字符串数据
        out.write(System.lineSeparator());
        String s2 = "宝,我今天拉便便了,什么便,想你的一遍又一遍";
        out.write(s2);

        // write(String s,int off,int len)

        out.flush();

        // close
        out.close();


    }
}

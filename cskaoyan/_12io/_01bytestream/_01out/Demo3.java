package com.cskaoyan._12io._01bytestream._01out;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/12 9:39
 **/
/*
实现换行功能 ---->写入换行符
 */
public class Demo3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream out = new FileOutputStream("a.txt");
        // write
        out.write("abcd".getBytes());
        // 写入换行符
        // "\r\n"
        out.write("\r\n".getBytes());
        out.write("abcd".getBytes());
        // 利用系统默认换行符
        // System.lineSeparator()
        out.write(System.lineSeparator().getBytes());
        out.write("abcd".getBytes());

        // close
        out.close();
    }
}

package com.cskaoyan._12io._01bytestream._04buffer;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/12 15:06
 **/
/*
使用缓冲的字节输出流写数据
1.创建输出流对象
2.write写数据
3.flush
4.close
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        //1.创建输出流对象
        BufferedOutputStream out =
                new BufferedOutputStream(new FileOutputStream(new File("a.txt")));
        //2.write写数据
        // write(int b)
        out.write(97);
        // write(byte[] b)
        out.write("abcd".getBytes());

        // write(byte[] b,int off,int len)

        //3.flush
        out.flush();
        //4.close
        out.close();
    }
}

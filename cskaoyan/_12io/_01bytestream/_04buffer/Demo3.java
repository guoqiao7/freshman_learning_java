package com.cskaoyan._12io._01bytestream._04buffer;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/12 15:42
 **/

public class Demo3 {
    public static void main(String[] args) throws IOException {
        // 创建缓冲的输入流对象
        BufferedInputStream in =
                new BufferedInputStream(new FileInputStream("a.txt"));
        // read
        // read()
        int readData = in.read();
        System.out.println(((char) readData));
        // read(byte[] b)
        byte[] bytes = new byte[1024];
        int readCount = in.read(bytes);
        System.out.println(new String(bytes, 0, readCount));
        // read(byte[] b,int off,int len)
        // close
        in.close();
    }
}

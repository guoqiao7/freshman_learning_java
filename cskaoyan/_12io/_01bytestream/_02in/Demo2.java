package com.cskaoyan._12io._01bytestream._02in;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/12 10:40
 **/

public class Demo2 {
    public static void main(String[] args) throws IOException {
        // 创建输入流对象
        FileInputStream in = new FileInputStream("a.txt");
        // read
        byte[] bytes = new byte[4];
        int readCount = in.read(bytes);
        System.out.println(new String(bytes));
        // abcd
        // readCount=4
        System.out.println(readCount);
        int readCount2 = in.read(bytes);
        System.out.println(new String(bytes,0,readCount2));
        // efcd
        // readCount2 = 2
        System.out.println(readCount2);
        // close
    }
}

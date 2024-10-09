package com.cskaoyan._12io._02charstream._02encode;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/12 17:08
 **/

public class Demo3 {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("D:\\b.txt");
        byte[] bytes = new byte[1024];
        int readCount = in.read(bytes);
        System.out.println(new String(bytes, 0, readCount));
        in.close();
    }
}

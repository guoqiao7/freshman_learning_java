package com.cskaoyan._12io._02charstream._07standard;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/13 10:42
 **/
/*
标准输入流
    本质 InputStream-->普通的字节输入流
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        // 标准输入流 System.in
        // 默认输入设备--->键盘
        // Scanner scanner = new Scanner(System.in);

        InputStream in = System.in;
        byte[] bytes = new byte[1024];

        // read是一个阻塞方法
        System.out.println("read before");
        int readCount = in.read(bytes);
        System.out.println("read after");
        System.out.println(new String(bytes, 0, readCount));
        in.close();
    }
}

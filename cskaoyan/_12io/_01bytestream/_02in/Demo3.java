package com.cskaoyan._12io._01bytestream._02in;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/12 10:56
 **/
/*
循环读取
 */
public class Demo3 {
    public static void main(String[] args) throws IOException {
        // 创建输入流对象
        FileInputStream in = new FileInputStream("a.txt");
        // 传统方式: 单字节循环读取 传统方式
        // readWhile1(in);

        // 新的方式
        // 方式一:单字节循环读取
        // read()
        // readWhile2(in);

        // 方式二:批量循环读取
        byte[] bytes = new byte[1024];
        int readCount; // 表示读到了多少个字节个数
        while ((readCount = in.read(bytes)) != -1) {
            System.out.println(new String(bytes,0,readCount));
        }

        // close
        in.close();
    }

    private static void readWhile2(FileInputStream in) throws IOException {
        int readData;
        while ((readData = in.read()) != -1) {
            System.out.println(readData);
        }
    }

    private static void readWhile1(FileInputStream in) throws IOException {
        // read()
        while (true) {
            int readData = in.read();
            if (readData == -1) {
                break;
            }
            System.out.println(((char) readData));
        }
    }
}

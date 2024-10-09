package com.cskaoyan._12io._02charstream._01introduction;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLOutput;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/12 16:05
 **/
/*
使用字节流读取英文 数字
--->没有问题
读取中文数据
--->可能 有问题
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        // 创建字节输入流对象
        FileInputStream in = new FileInputStream("a.txt");
        //while (true) {
        //    int readData = in.read();
        //    if (readData == -1) {
        //        break;
        //    }
        //    System.out.println(((char) readData));
        //}

        byte[] bytes = new byte[11];
        int readCount;
        while ((readCount = in.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, readCount));
        }

        in.close();

    }
}

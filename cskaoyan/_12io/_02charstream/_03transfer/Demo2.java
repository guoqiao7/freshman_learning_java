package com.cskaoyan._12io._02charstream._03transfer;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/13 9:09
 **/
/*
使用转换流读取数据
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        // 创建输入流对象
        InputStreamReader in = new InputStreamReader(
                new FileInputStream("a.txt"));
        // read
        // read() 读取单个字符
        int readData = in.read();
        System.out.println(readData);
        System.out.println(((char) readData));
        // read(char[] c) 读取字符数据填充到字符数组中
        char[] chars = new char[1024];
        // readCount 读取到了多少个字符
        int readCount = in.read(chars);
        // char[] ---->String
        System.out.println(new String(chars, 0, readCount));

        // read(char[] c,int off,int len) 读取字符数据填充到字符数组中
        
        // close
        in.close();
    }
}

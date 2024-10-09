package com.cskaoyan._12io._02charstream._05sample;

import java.io.FileReader;
import java.io.IOException;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/13 10:12
 **/
/*
使用简化流读取数据
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        // 创建输入流对象
        FileReader fileReader = new FileReader("D:\\b.txt");
        // read读取数据
        char[] chars = new char[1024];
        int readCount = fileReader.read(chars);
        System.out.println(new String(chars,0,readCount));
        // close
        fileReader.close();
    }
}

package com.cskaoyan._12io._02charstream._03transfer;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/13 10:16
 **/

public class Demo3 {
    public static void main(String[] args) throws IOException {
        // 创建转换流对象
        InputStreamReader in = new InputStreamReader(
                new FileInputStream("D:\\b.txt"), "GBK");
        // read读取数据
        char[] chars = new char[1024];
        int readCount = in.read(chars);
        System.out.println(new String(chars,0,readCount));
        in.close();
    }
}

package com.cskaoyan._12io._01bytestream._01out;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/12 9:21
 **/
/*
使用字节输出流写数据的基本步骤
1.创建输出流对象
2.利用write方法写数据
3.close释放资源
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        //1.创建输出流对象
        //File file = new File("D:\\workspace2\\2024-short-online\\b.txt");
        //FileOutputStream out = new FileOutputStream(file);

        FileOutputStream out = new FileOutputStream("b.txt");
        //2.利用write方法写数据
        // write(int b) 写单个字节
        // out.write(97);


        // write(byte[] b)写字节数组
        String str = "abcdef";
        // String--->byte[]
        byte[] bytes = str.getBytes();
        //out.write(bytes);

        // write(byte[] b,int off,int len) 写字节数组的部分
        out.write(bytes, 1, 2);

        //3.close释放资源
        out.close();
    }
}

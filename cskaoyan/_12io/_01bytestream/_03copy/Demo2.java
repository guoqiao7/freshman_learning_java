package com.cskaoyan._12io._01bytestream._03copy;

import com.cskaoyan._12io.utils.FileUtils;

import java.io.*;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/12 15:56
 **/
/*
文件复制功能:
1.文本文件
    单字节: 565ms--->6ms
    字节数组: 1ms--->2ms
2.图片文件
    单字节: 1926ms--->10ms
    字节数组: 2ms---->2ms
3.视频文件
    单字节: 19959ms-->40ms
    字节数组: 35ms--->6ms
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        // 使用工具类中的方法
        //BufferedInputStream in = new BufferedInputStream(
        //        new FileInputStream("D:\\a.txt"));
        //BufferedOutputStream out = new BufferedOutputStream(
        //        new FileOutputStream("copy_a.txt"));

        //BufferedInputStream in = new BufferedInputStream(
        //        new FileInputStream("D:\\a.jpg"));
        //BufferedOutputStream out = new BufferedOutputStream(
        //        new FileOutputStream("copy_a.jpg"));

        BufferedInputStream in = new BufferedInputStream(
                new FileInputStream("D:\\aa.mp4"));
        BufferedOutputStream out = new BufferedOutputStream(
                new FileOutputStream("copy_aa.mp4"));

        long start = System.currentTimeMillis();

        // FileUtils.copySingle(in, out);
        FileUtils.copyMulti(in, out);


        long end = System.currentTimeMillis();
        System.out.println(end - start);

        in.close();
        out.close();
    }
}

package com.cskaoyan._12io._01bytestream._04buffer;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/12 15:36
 **/

public class Demo2 {
    public static void main(String[] args) throws IOException {
        // 创建输出流对象 指定缓冲区的大小
        BufferedOutputStream out = new BufferedOutputStream(
                new FileOutputStream("a.txt"), 4);

        //write
        out.write("abcdef".getBytes());
        // 超过了缓冲区大小会自动的刷新

        // flush
        // close
    }
}

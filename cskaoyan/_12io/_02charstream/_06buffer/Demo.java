package com.cskaoyan._12io._02charstream._06buffer;

import java.io.*;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/13 10:25
 **/
/*
使用缓冲字符输入流写数据
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        // 创建输出流对象
        //new BufferedWriter(
        //        new OutputStreamWriter(
        //                new BufferedOutputStream(
        //                        new FileOutputStream(new File("a.txt")))));
        BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));
        // write
        // 5个常规的write方法
        bw.write("大郎,来喝药!");

        // 自己独有的方法 newLine方法 --->换行
        bw.newLine();
        bw.write("大郎,来喝药!");

        // flush
        bw.flush();
        // close
        bw.close();
    }
}

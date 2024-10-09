package com.cskaoyan._12io._02charstream._04copy;

import com.cskaoyan._12io.utils.FileUtils;

import java.io.*;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/13 9:22
 **/
/*
使用字符流进行复制
文本文件--->OK
图片文件--->NO
视频文件--->NO
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        // 使用工具类的方法 使用字符流进行复制
        // 创建输入流对象
        //InputStreamReader in = new InputStreamReader(
        //        new FileInputStream("D:\\a.txt"));
        //InputStreamReader in = new InputStreamReader(
        //        new FileInputStream("D:\\a.jpg"));
        InputStreamReader in = new InputStreamReader(
                new FileInputStream("D:\\aa.mp4"));
        // 创建输出流对象
        //OutputStreamWriter out = new OutputStreamWriter(
        //        new FileOutputStream("copy_a.txt"));

        //OutputStreamWriter out = new OutputStreamWriter(
        //        new FileOutputStream("copy_a.jpg"));
        OutputStreamWriter out = new OutputStreamWriter(
                new FileOutputStream("copy_aa.mp4"));

        // FileUtils.copySingleChar(in, out);
        FileUtils.copyMultiChar(in,out);


        in.close();
        out.close();
    }
}

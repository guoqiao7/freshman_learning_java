package com.cskaoyan._12io.utils;

import java.io.*;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/12 15:47
 **/
/*
文件相关的工具类
提供静态的方法
 */
public class FileUtils {
    // 提供进行文件复制的方法
    // 单字节复制
    //public static void copy1(FileInputStream in, FileOutputStream out) {
    //    // ....
    //}
    ////字节数组方式复制
    //public static void copy2(FileInputStream in, FileOutputStream out) {
    //    // ....
    //}
    //
    //
    //// 缓冲流单字节复制
    //public static void copy3(BufferedInputStream in, BufferedOutputStream out) {
    //    // ....
    //}
    //
    //// 缓冲流字节数组方式复制
    //public static void copy4(BufferedInputStream in, BufferedOutputStream out) {
    //    // ....
    //}

    // 提供2个通用的进行复制的方法
    // 单字节复制
    public static void copySingle(InputStream in,OutputStream out) throws IOException{
        int readData;
        // 边读边写
        while ((readData = in.read()) != -1) {
            // write写入到新文件中
            out.write(readData);
        }

    }

    // 字节数组方式复制
    public static void copyMulti(InputStream in,OutputStream out) throws IOException{
        int readCount;
        byte[] bytes = new byte[1024];
        // 边读边写
        while ((readCount = in.read(bytes)) != -1) {
            // write写入到新文件中
            out.write(bytes,0,readCount);
        }

    }


    // 单字符复制
    public static void copySingleChar(Reader reader,Writer writer) throws IOException{
        // 边读边写
        // 表示读取到的字符值
        int readData;
        while ((readData = reader.read()) != -1) {
            writer.write(readData);
        }
    }

    // 字符数组方式赋值
    public static void copyMultiChar(Reader reader,Writer writer) throws IOException{
        // 表示读取到的字符的个数
        int readCount;
        char[] chars = new char[1024];
        while ((readCount = reader.read(chars)) != -1) {
            writer.write(chars, 0, readCount);
        }
    }
}

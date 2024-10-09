package com.cskaoyan._12io._02charstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/13 8:48
 **/
/*
了解就行
 */
public class Temp {
    public static void main(String[] args) throws IOException {
        //FileInputStream in = new FileInputStream("D:\\b.txt");
        //FileOutputStream out = new FileOutputStream("copy_b.txt");
        //FileOutputStream out2 = new FileOutputStream("copy_b2.txt");
        //// 文件复制
        //copy1(in, out);
        //
        //copy2(in,out2);
        //
        //in.close();
        //out.close();
        //out2.close();
        RandomAccessFile raf = new RandomAccessFile("a.txt", "r");
        // mode : 模式  r: readOnly    rw: readWrite
        // 获取文件指针
        long filePointer = raf.getFilePointer();
        System.out.println(filePointer);
        //raf.write("abcdef".getBytes());
        //System.out.println(raf.getFilePointer());
        //// 移动文件指针
        //raf.seek(0);
        //raf.write("你".getBytes());
        //System.out.println(raf.getFilePointer());
        byte[] bytes = new byte[4];
        int readCount = raf.read(bytes);
        System.out.println(new String(bytes, 0, readCount));
        System.out.println(raf.getFilePointer());

        raf.close();
    }

    public static void copy1(FileInputStream in,FileOutputStream out) throws IOException{
        // 单字节复制
        int readData;
        while ((readData = in.read()) != -1) {
            out.write(readData);
        }
    }

    // 字节数组的复制
    public static void copy2(FileInputStream in,FileOutputStream out) throws IOException{
        int readCount;
        byte[] bytes = new byte[1024];
        while ((readCount = in.read(bytes)) != -1) {
            out.write(bytes,0,readCount);
        }
    }
}

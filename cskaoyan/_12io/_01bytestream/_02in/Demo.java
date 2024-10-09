package com.cskaoyan._12io._01bytestream._02in;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/12 10:26
 **/
/*
读取文件数据的步骤:
1.创建输入流对象
2.利用read方法读取数据
3.close释放资源
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        //1.创建输入流对象
        FileInputStream in = new FileInputStream(new File("a.txt"));
        //2.利用read方法读取数据
        // read()读取单个字节  返回值表示读取到的字节值 readData
        // readSingle(in);


        // read(byte[] b) 读取字节填充到数组中 返回值表示读取的字节的个数 readCount
        byte[] bytes = new byte[1024];
        // readMulti(in, bytes);

        // read(byte[] b,int off,int len)
        int readCount = in.read(bytes, 1, 3);
        System.out.println(new String(bytes));

        //3.close释放资源
        in.close();

    }

    private static void readMulti(FileInputStream in, byte[] bytes) throws IOException {
        int readCount = in.read(bytes);
        System.out.println(readCount);
        // byte[]---->String
        String str = new String(bytes);
        System.out.println(str);

        int readCount2 = in.read(bytes);
        System.out.println(readCount2);
    }

    private static void readSingle(FileInputStream in) throws IOException {
        int readData = in.read();
        System.out.println(((char) readData));
        int readData2 = in.read();
        System.out.println(readData2);

        int readData3 = in.read();
        System.out.println(readData3);
        int readData4 = in.read();
        System.out.println(readData4);
    }
}

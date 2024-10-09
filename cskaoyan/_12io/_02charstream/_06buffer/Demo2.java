package com.cskaoyan._12io._02charstream._06buffer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/13 10:32
 **/
/*
使用字符缓冲输入流读取数据
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        // 创建输入流对象
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));

        // read
        // 3个read
        //char[] chars = new char[1024];
        //int readCount = br.read(chars);
        //System.out.println(new String(chars, 0, readCount));

        // 独有的方法 readLine--->读取一行数据 String
        // readSingLine(br);

        // 按行循环读取
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        // close
        br.close();
    }

    private static void readSingLine(BufferedReader br) throws IOException {
        String line1 = br.readLine();
        System.out.println(line1);
        String line2 = br.readLine();
        System.out.println(line2);
        String line3 = br.readLine();
        System.out.println(line3);
    }
}

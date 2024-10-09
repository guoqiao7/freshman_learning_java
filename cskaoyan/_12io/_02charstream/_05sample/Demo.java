package com.cskaoyan._12io._02charstream._05sample;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/13 10:08
 **/
/*
使用简化流写数据
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        // 创建输出流对象
        FileWriter fileWriter = new FileWriter("a.txt");
        // write
        fileWriter.write("宝,你知道为什么我喜欢吃鱼头吗?因为余生都是你");

        // flush
        fileWriter.flush();

        // close
        fileWriter.close();
    }
}

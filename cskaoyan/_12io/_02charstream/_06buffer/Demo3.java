package com.cskaoyan._12io._02charstream._06buffer;

import java.io.*;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/13 10:38
 **/

public class Demo3 {
    public static void main(String[] args) throws IOException {
        // 使用缓冲流进行文本文件的复制
        // 按行复制
        // 创建输入流对象
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));
        // 创建输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("copy2_a.txt"));
        // 读一行写一行
        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
        }

        bw.flush();
        // close
        bw.close();
    }
}

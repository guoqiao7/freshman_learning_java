package com.cskaoyan._12io._01bytestream._03copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/12 14:16
 **/
/*
文件复制功能:
1.文本文件
    单字节: 565ms
    字节数组: 1ms
2.图片文件
    单字节: 1926ms
    字节数组: 2ms
3.视频文件
    单字节: 19959ms
    字节数组: 35ms
买了5件快递京东的
如果是单字节: 快递小哥1次送1个
字节数组: 东哥说大家都是兄弟 买个五菱 装快递
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        // 创建输入流对象
        //FileInputStream in = new FileInputStream("D:\\a.txt");
        //FileInputStream in = new FileInputStream("D:\\a.jpg");
        FileInputStream in = new FileInputStream("D:\\aa.mp4");
        // 创建输出流对象
        //FileOutputStream out = new FileOutputStream("copy_a.txt");
        // FileOutputStream out = new FileOutputStream("copy_a.jpg");
        FileOutputStream out = new FileOutputStream("copy_aa.mp4");
        // 边读边写
        // 单字节复制
        // 获取时间戳
        long start = System.currentTimeMillis();

        // copySingle(in, out);

        // 字节数组复制
        copyMulti(in, out);

        long end = System.currentTimeMillis();
        System.out.println((end - start) + "ms");

        // 循环结束 复制完成


        // close
        in.close();
        out.close();
    }

    private static void copyMulti(FileInputStream in, FileOutputStream out) throws IOException {
        byte[] bytes = new byte[1024];
        int readCount;
        while ((readCount = in.read(bytes)) != -1) {
            // write数据到新的文件
            out.write(bytes, 0, readCount);
        }
    }

    private static void copySingle(FileInputStream in, FileOutputStream out) throws IOException {
        int readData;
        while ((readData = in.read()) != -1) {
            // 通过out写入到新的文件当中
            out.write(readData);
        }
    }
}

package com.cskaoyan._11file._03api;

import java.io.File;
import java.io.IOException;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/11 15:55
 **/
/*
创建功能
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        // //只负责创建文件，目录路径如果不存在，会报错而不是帮你创建
        //public boolean createNewFile()
        // 相对路径
        File file = new File("a.txt");
        System.out.println(file.createNewFile());

        File file2 = new File("D:\\workspace2\\2024-short-online\\b.txt");
        System.out.println(file2.createNewFile());

        ////只负责创建目录，但只能创建单层目录，如果有多级目录不存在的话，创建失败
        //public boolean mkdir()
        //File dir = new File("a");
        //System.out.println(dir.mkdir());

        //File dir = new File("c.txt");
        //System.out.println(dir.mkdir());


        //File dir = new File("a\\b\\c");
        //System.out.println(dir.mkdir());
        ////只负责创建目录，但可以创建多级目录，如果多级目录不存在，则帮你全部创建
        //public boolean mkdirs()
        File dir = new File("a\\b\\c");
        System.out.println(dir.mkdirs());
    }
}

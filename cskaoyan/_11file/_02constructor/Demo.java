package com.cskaoyan._11file._02constructor;

import java.io.File;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/11 15:50
 **/

public class Demo {
    public static void main(String[] args) {
        // File (String pathname)
        File file = new File("D:\\app2\\b.txt");
        //判断，File对象表示的文件，是否物理存在
        //public boolean exists()
        System.out.println(file.exists());

        //File (String parent, Sting child)
        File file1 = new File("D:\\app2", "a.txt");
        System.out.println(file1.exists());

        //File (File parent, String child)
        File file2 = new File(new File("D:\\app2"), "a.txt");
        System.out.println(file2.exists());

        File dir = new File("D:\\app2");
        System.out.println(dir.exists());
    }
}

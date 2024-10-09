package com.cskaoyan._11file._03api;

import java.io.File;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/11 16:16
 **/

public class Demo4 {
    public static void main(String[] args) {
        File file = new File("b.txt");
        // // 判断File对象是否表示的是一个文件
        //public boolean isFile()
        System.out.println(file.isFile());
        ////判断File对象是否表示的是一个目录
        // public boolean isDirectory()
        //
        ////判断，File对象表示的文件，是否物理存在
        //public boolean exists()
        if (file.isDirectory()) {
            // do sth
        }
    }
}

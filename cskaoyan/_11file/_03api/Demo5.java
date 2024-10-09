package com.cskaoyan._11file._03api;

import java.io.File;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/11 16:18
 **/

public class Demo5 {
    public static void main(String[] args) {
        File file = new File("D:\\workspace2\\2024-short-online\\b.txt");
        ////获取File对象表示的抽象文件的绝对路径
        //public String getAbsolutePath()
        String absolutePath = file.getAbsolutePath();
        System.out.println(absolutePath);
        // D:\workspace2\2024-short-online\b.txt

        ////获取File对象表示的抽象文件，路径名字符串
        // public String getPath()
        String path = file.getPath();
        System.out.println(path);

        ////获取文件或者目录的名字
        // public String getName()
        String fileName = file.getName();
        System.out.println("fileName = " + fileName);

        ////返回由此抽象路径名表示的文件的长度。不能返回文件夹的长度
        ////此抽象路径名表示的文件的长度，以字节为单位；如果文件不存在，则返回 0L
        // public long length()
        long length = file.length();
        System.out.println(length);


        ////返回此抽象路径名表示的文件最后一次被修改的时间。
        ////表示文件最后一次被修改的时间的 long 值，用与时间点（1970 年1月1日，00:00:00 GMT）之间的毫秒数表示
        //public long lastModified()
        long l = file.lastModified();
        System.out.println(l);
    }
}

package com.cskaoyan._11file._04ex;

import java.io.File;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/11 16:32
 **/
/*
判断某个目录(单级)下有没有a.jpg文件,有的话输出
 */
public class Demo {
    public static void main(String[] args) {
        // 明确要查找的文件夹
        File dir = new File("D:\\app2");
        // 把目标文件夹里的东西都列出来
        // listFiles--->File[]
        File[] files = dir.listFiles();
        for (File file : files) {
            // 遍历数组
            // 判断是不是文件
            if (file.isFile()) {
                // 如果是文件
                // 获取文件的名字 跟目标文件名字比较
                String fileName = file.getName();
                if ("a.jpg".equals(fileName)) {
                    // 找到了 输出绝对路径
                    System.out.println(file.getAbsolutePath());
                }
            }

        }
    }
}

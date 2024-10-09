package com.cskaoyan._11file._04ex;

import java.io.File;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/11 16:48
 **/
/*
练习2
递归输出某个目录下的所有java文件
 */
public class Demo2 {
    public static void main(String[] args) {
        // 确定目标目录
        File dir = new File("D:\\app2");
        findAllJavaFile(dir);
    }
    public static void findAllJavaFile(File dir) {
        // 列出当前目录的所有的文件 文件夹
        // listFiles()---->File[]
        File[] files = dir.listFiles();
        // 遍历数组对象
        for (File file : files) {
            // 判断是不是文件
            if (file.isFile()) {
                // 如果是文件
                // 判断是不是目标文件
                if (file.getName().endsWith(".java")) {
                    // 输出绝对路径
                    System.out.println(file.getAbsolutePath());
                }

            }
            else {
                // 如果是文件夹
                // 递归查找
                findAllJavaFile(file);
            }

        }
    }
}

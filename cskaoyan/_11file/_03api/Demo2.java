package com.cskaoyan._11file._03api;

import java.io.File;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/11 16:04
 **/
/*
重命名
 */
public class Demo2 {
    public static void main(String[] args) {
        // 重新命名此抽象路径名表示的文件
        // public boolean renameTo(File dest)
        //File file = new File("a\\b\\c\\a.txt");
        //boolean result = file.renameTo(new File("a\\b\\c\\aa.txt"));
        //System.out.println("result = " + result);


        File srcFile = new File("a\\b\\c\\aa.txt");
        boolean result = srcFile.renameTo(new File("a\\bb.txt"));
        System.out.println("result = " + result);
    }
}

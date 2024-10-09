package com.cskaoyan._11file._03api;

import java.io.File;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/11 16:09
 **/
/*
删除
 */
public class Demo3 {
    public static void main(String[] args) {
        // 删除此抽象路径名表示的文件或目录。
        // 如果此路径名表示一个目录，则该目录必须为空才能删除
        // delete不会因为文件不存在,路径名不正确而抛出异常,只会返回false,
        // 并且不会进入回收站
        // public boolean delete()

        File dir = new File("a\\b\\c");
        System.out.println(dir.delete());

        //File dir = new File("a\\b\\c\\bb.txt");
        //System.out.println(dir.delete());
    }
}

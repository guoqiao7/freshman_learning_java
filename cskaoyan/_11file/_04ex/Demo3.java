package com.cskaoyan._11file._04ex;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/11 16:59
 **/
// 通过文件过滤器 查找单层目录下的所有的.java文件
public class Demo3 {
    public static void main(String[] args) {
        // m1(new IAImpl());
        File dir = new File("D:\\app2");
        // 使用接口的实现类去做   匿名对象
        //File[] files = dir.listFiles(new MyFileFilter());
        //System.out.println(Arrays.toString(files));

        // 其他方式实现
        //匿名内部类--->接口的实现类对象
        //File[] files = dir.listFiles(new FileFilter() {
        //    @Override
        //    public boolean accept(File pathname) {
        //        return pathname.getName().endsWith(".jpg");
        //    }
        //});
        //System.out.println(Arrays.toString(files));

        // lambda表达式
        File[] files = dir.listFiles(
                (File f) -> { return  f.getName().endsWith(".jpg");}
        );

        // 最简形式
        //File[] files = dir.listFiles(
        //        f -> f.getName().endsWith(".jpg")
        //);

        System.out.println(Arrays.toString(files));

    }

    public static void m1(IA ia) {

    }
}
interface IA{

}
class IAImpl implements IA{

}

class MyFileFilter implements FileFilter {

    @Override
    public boolean accept(File pathname) {
        return pathname.getName().endsWith(".java");
    }
}

@FunctionalInterface
interface IB {
    void m1();
}
//Multiple non-overriding abstract methods found in interface com.cskaoyan._11file._04ex.IC
//@FunctionalInterface
//interface IC {
//    void m1();
//    void m2();
//}

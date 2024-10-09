package com.cskaoyan._03array._04memory;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/30 15:34
 **/

public class Demo2 {
    public static void main(String[] args) {
        int a= 1;
        int b= 2;
        int c = a+b;
        // 堆内存大小最大默认是系统的1/4
        long l = Runtime.getRuntime().maxMemory();
        System.out.println(l/1024/1024);
    }
}

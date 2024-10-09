package com.cskaoyan._16collection._05set;

import java.util.TreeSet;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/25 17:23
 **/
/*
1. TreeSet是Set的子实现
2. TreeSet底层持有了一个TreeMap对象
3. TreeSet的特点和TreeMap的key保持一直
4. TreeSet存储数据: 大小有序
5. TreeSet不允许存储重复数据:  (大小重复)
6. TreeSet不允许存储null
7. 线程不安全
 */
public class Demo4 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
    }
}

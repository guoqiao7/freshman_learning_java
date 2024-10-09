package com.cskaoyan._16collection._04map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/25 16:50
 **/
/*
// 1, LinkedHashMap是HashMap的子类
// 2, LinkedHashMap底层基本上完全复用了HashMap的结构 -->
LinkedHashMap的特点基本上和HashMap一样 (结构: 数组+链表+红黑树, hash, 重复)
// 3, LinkedHashMap在HashMap的基础上额外定义了一个双向链表, 用以保证迭代顺序 (重要)
// 4, LinkedHashMap存储数据有序
// 5, LinkedHashMap不允许存储重复数据
// 6, LinkedHashMap允许存储null
// 7, 线程不安全
 */
public class Demo {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("zs", 20);
        map.put("ls", 18);
        System.out.println(map);
    }
}

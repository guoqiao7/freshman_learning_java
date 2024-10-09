package com.cskaoyan._16collection._04map.hashtable;

import java.util.Hashtable;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/25 16:54
 **/
/*
// 1, Hashtbale是Map的子实现
// 2, Hashtable底层结构是: 数组+链表  (和HashMap在jdk1.8之前一样)
// 3, Hashtable底层数组长度11, 扩容机制2倍+1.
// 4, Hashtable存储数据无序
// 5, Hashtable不允许存储重复数据 (重复的定义和HashMap一样)
// 6, Hashtable不允许存储null作为key, 也不允许存储null作为value
// 7, 线程安全.
// 8, jdk1.0时候出现, HashMap是1.2出现 (HashMap出现就是为了取代Hashtable)
 */
public class Demo {
    public static void main(String[] args) {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
    }
}

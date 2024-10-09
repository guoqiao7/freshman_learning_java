package com.cskaoyan._16collection._03queue.arraydeque;

import java.util.ArrayDeque;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/25 14:56
 **/
/*
1. ArrayDeque是Deque接口的子实现
2. 数据结构表现:  队列, 双端队列, 栈
3. 底层结构是数组: 循环数组
4. 默认初始长度:16;  默认扩容机制:2倍 --> 数组长度保持2的幂值
5. 存储元素有序
6. 允许存储重复数据
7. 不允许存储null
8. 线程不安全
 */
public class Demo {
    public static void main(String[] args) {
        ArrayDeque<String> queue = new ArrayDeque<>();
    }
}

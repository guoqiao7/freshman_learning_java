package com.cskaoyan._16collection._03queue;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/25 14:48
 **/
/*
1. Queue接口是Collection的子接口
2. Queue数据结构定义队列
3. Queue存储数据有序
4. Queue允许存储重复数据
5. Queue不允许存储null  (LinkedList除外)
 */
public class APITest {
    @Test
    public void test1() {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(1);
        queue.add(2);
        // 不能存null
        // queue.add(null);
        System.out.println(queue);
    }

    // -----------Queue-----------------
//        boolean offer(E e)
//        将指定元素添加到此列表的末尾（最后一个元素）。
//        E peek()
//        获取但不移除此列表的头（第一个元素）。
//        E poll()
//        获取并移除此列表的头（第一个元素）
}

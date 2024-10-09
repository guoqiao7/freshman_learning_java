package com.cskaoyan._16collection._02list.linkedlist;

import java.util.LinkedList;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/25 14:32
 **/
/*
1. LinkedList是List的子实现, 同时还是Deque接口的子实现.(主要把LinkedList看做List的子实现)
2. LinkedList数据结构表现为: 线性表, 队列, 双端队列, 栈
3. LinkedList底层是一个双向链表
4. LinkedList存储元素有序
5. LinkenList允许存储重复数据
6. LinkedList允许存储null
7. 线程不安全
 */
public class Demo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        // 作为线性表使用
        list.add("a");
        list.add("a");
        list.add("b");
        list.add(null);
        System.out.println(list);

        // 作为队列使用
        LinkedList<String> list2 = new LinkedList<>();
        list2.offer("zs");
        list2.offer("ls");
        System.out.println(list2.poll());

        // 作为双端队列使用
        LinkedList<String> list3 = new LinkedList<>();
        list3.offerFirst("a");
        list3.offerLast("b");
        list3.pollLast();


        // 作为栈使用
        LinkedList<String> list4 = new LinkedList<>();
        list4.push("a");
        list4.push("a");
        System.out.println(list4.pop());

    }
}

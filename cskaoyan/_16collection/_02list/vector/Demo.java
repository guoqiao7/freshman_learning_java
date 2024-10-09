package com.cskaoyan._16collection._02list.vector;

import java.util.Vector;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/25 14:19
 **/
/*
1. Vector是List的子实现
2. Vector数据结构为线性表
3. Vector的底层结构是数组
4. Vector底层数组的默认长度10,
扩容机制(如果Vector有大于0的增量, 那么,每次扩容扩大增量个,
如果增量是小于等于0, 每次扩容扩为原来的2倍)
5. Vector存储数据有序
6. Vector允许存储重复数据
7. Vector允许存储null
8. 线程安全 (锁)
9. Vector是jdk1.0的时候出现 (ArrayList在jdk1.2时候出现, ArrayList出现就是为了取代Vector)
 */
public class Demo {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("a");
        vector.add("a");
        vector.add("b");
        vector.add(null);
        System.out.println(vector);
    }
}

package com.cskaoyan._16collection._02list.arraylist;

import java.util.ArrayList;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/25 14:08
 **/
/*
ArrayList的特点

1. ArrayList是List接口的子实现
2. ArrayList数据结构是线性表
3. ArrayList底层是数组
4. ArrayList底层持有的数组默认初始长度10, 扩容机制1.5倍
5. ArrayList存储数据有序
6. ArrayList允许存储重复数据
7. ArrayList允许存储null
8. ArrayList线程不安全
 */
public class Demo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("c");
        list.add(null);
        System.out.println(list);

    }
}

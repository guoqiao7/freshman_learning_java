package com.cskaoyan._16collection._01basic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/25 10:49
 **/
/*
集合中有2大体系
1. Collection : 存储单个数据
2. Map体系: 存储k-v数据

每个集合类我们需要关注它什么特点

1. 这个集合类的父子关系(继承关系)
2. 逻辑表现
3. 底层表现 (数组: 默认初始长度, 扩容问题)
4. 是否有序
5. 是否可以有重复数据
6. 是否可以存储null
7. 是否线程安全
 */
public class Demo {
    public static void main(String[] args) {
        // Collection体系
        // 存单个数据
        Collection<String> list = new ArrayList<>();
        list.add("zs");
        list.add("ls");
        list.add("ww");
        System.out.println(list);
        // Map体系 存k-v数据
        Map<String, String> map = new HashMap<>();
        map.put("name", "zs");
        map.put("city", "bj");
        System.out.println(map);
    }
}

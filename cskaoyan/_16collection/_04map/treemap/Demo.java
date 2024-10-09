package com.cskaoyan._16collection._04map.treemap;

import java.util.TreeMap;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/25 17:09
 **/
/*
// 1, TreeMap是Map接口子实现
// 2, TreeMap数据结构表现是红黑树
// 3, TreeMap存储数据大小有序
// 4, TreeMap不允许存储重复数据  (什么叫重复?  key的大小一样)
// 5, TreeMap不允许null作为key
// 6, TreeMap线程不安全
 */
public class Demo {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "zs");
        treeMap.put(3, "ls");
        treeMap.put(2, "ww");
        System.out.println(treeMap);
    }
}

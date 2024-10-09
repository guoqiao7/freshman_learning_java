package com.cskaoyan._16collection._05set;

import java.util.HashSet;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/25 17:18
 **/
/*
1. Set接口是Collection的子接口
2. Set接口数据结构: 集合
3. Set的一些子实现有序(LinkedHashSet, TreeSet), 有一些子实现是无序的
4. Set都不允许存储重复数据
5. Set的一些子实现允许存储null(HashSet, LinkedHashSet) 有一些子实现不允许存储null(TreeSet)
 */
public class Demo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("zs");
        set.add("zs");
        set.add("ls");
        System.out.println(set);
    }
}

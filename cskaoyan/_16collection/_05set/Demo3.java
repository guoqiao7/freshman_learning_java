package com.cskaoyan._16collection._05set;

import java.util.LinkedHashSet;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/25 17:22
 **/
/*
1. LinkedHashSet是HashSet的子类
2. LInkedHashSet底层持有了一个LinkedHashMap对象(向LInkedHashSet添加的数据,都加到底层的LinkedHashMap的key上)
3. LinkedHashSet的特点和LinkedHashMap的key一样
4. LinkedHashSet存储数据有序
5. 不允许存储重复数据
6. 允许存储null
7. 线程不安全
 */
public class Demo3 {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
    }
}

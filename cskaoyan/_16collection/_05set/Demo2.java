package com.cskaoyan._16collection._05set;

import java.util.HashSet;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/25 17:20
 **/
/*
1. HashSet是Set的子实现
2. HashSet底层持有了一个HashMap对象,
 我们添加到HashSet的数据实际上都添加到底层持有的HashMap的key上了.
3. HashSet的特点基本上要遵照于HashMap的key的特点
4. 存储数据无序
5. 不允许存储重复数据(   重复的依据: hashCode, equals )
6. 允许存储null
7. 线程不安全
 */
public class Demo2 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

    }
}

package com.cskaoyan._16collection._02list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/25 14:05
 **/
/*
List的特点
1. List是Collection的接口的子接口
2. List在Collection作为数据容器定义的基础上, 定义了数据结构为线性表
3. List所有子实现存储数据 都 有序
4. List允许存储重复数据
5. List允许存储null
 */
public class APITest {
    @Test
    public void test1() {
        List<String> list = new ArrayList<>();
        list.add("zs");
        list.add("zs");
        list.add("ls");
        list.add(null);
        System.out.println(list);

    }
    // -----首选拥有从Collection继承来的api: 略(可以参考Collection的api看一下)---------

// -----添加删除相关的: List下标相关操作(看一下)---------------------
//        void add(int index, E element): 根据下标的添加
//        boolean addAll(int index, Collection<? extends E> c): 根据下标添加所有
//        E remove(int index): 根据下标的删除
//        E get(int index): 根据下标获取下标位置存储的内容
//        int indexOf(Object o): 根据内容查找这个数据出现的第一次下标位置
//        int lastIndexOf(Object o): 根据内容查找这个数据出现的最后一次下标位置
//        E set(int index, E element): 根据修改下标位置存储的内容

// ------特殊api: List下标相关操作--------------------------

//        ListIterator<E> listIterator()
//        ListIterator<E> listIterator(int index):
// 		  提供了一个从某个位置开始, 不仅可以向后遍历, 也可以向前遍历的方式previous()

//        List<E> subList(int fromIndex, int toIndex)
//        返回列表中指定的 fromIndex（包括 ）和 toIndex（不包括）之间的部分视图。
}

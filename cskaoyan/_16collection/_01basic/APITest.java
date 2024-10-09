package com.cskaoyan._16collection._01basic;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/25 10:57
 **/
/*
Collection的特点
1. Collection是Collection集合体系的顶级接口
2. Collection定义了一个数据容器(用来存储数据的)
3. Collection的一些子实现存储数据有序, Collection一些子实现存储数据无序
4. Collection的一些子实现允许存储重复数据, Collection一些子实现不允许存储重复数据
5. Collection的一些子实现允许存储null, Collection一些子实现不允许存储null
 */
public class APITest {
// -----------Collection: 增删改查相关的api (作为数据容器具有)-------------
//        boolean add(E e): 添加方法
//        boolean addAll(Collection<? extends E> c): 添加所有
//        boolean remove(Object o): 根据内容删除
//        boolean removeAll(Collection<?> c): 删除所有匹配数据
//        boolean contains(Object o): 查找
//        boolean containsAll(Collection<?> c): 查找是否都存在
//        boolean retainAll(Collection<?> c): 保留匹配数据
// -----------辅助方法: size isEmpty, equals, hashCode..--------------
//        int size()
//        boolean isEmpty()
//        boolean equals(Object o): 重写了这个方法, 按照内容进行比较
//        int hashCode()
//        void clear()

    @Test
    public void test1() {
        Collection<String> list = new ArrayList<>();
        list.add("zs");
        list.add("ls");
        list.add("ww");
        // -----------特殊方法: 帮助我们对Collection进行遍历的---------------------------
        //  Object[] toArray()
        //  返回包含此 collection 中所有元素的数组。
        Object[] array = list.toArray();
        System.out.println(Arrays.toString(array));
        //  <T> T[] toArray(T[] a)
        //  返回包含此 collection 中所有元素的数组；返回与指定数组的运行时类型相同。

        for (String s : list) {
            System.out.println(s);
        }
        //  Iterator<E> iterator()
        //  返回在此 collection 的元素上进行迭代的迭代器。
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.println(str);
        }
    }

}

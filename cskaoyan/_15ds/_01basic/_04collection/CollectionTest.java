package com.cskaoyan._15ds._01basic._04collection;

import org.junit.Test;

import java.util.ArrayList;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/22 10:53
 **/

public class CollectionTest {
    @Test
    public void test1() {
        Collection2 collection2 = new Collection2();
        collection2.add(new Goods("苹果", 5));
        collection2.add(new Goods("香蕉", 6));
        collection2.add(new Goods("梨", 7));
        collection2.add(new Goods("西瓜", 10));

        int count = collection2.getCount();
        System.out.println(count);
    }

    @Test
    public void test2() {
        // Java中提供的数据容器 集合
        ArrayList<Goods> list = new ArrayList<>();
        list.add(new Goods("苹果", 2));
        list.add(new Goods("香蕉", 3));
        System.out.println(list);
        System.out.println(list.size());

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("zs");
        list1.add("ls");
    }
}

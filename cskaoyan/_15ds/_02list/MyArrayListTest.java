package com.cskaoyan._15ds._02list;

import org.junit.Test;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/22 14:31
 **/

public class MyArrayListTest {
    @Test
    public void testAdd() {
        MyArrayList list = new MyArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
    }

    @Test
    public void testContains() {
        MyArrayList list = new MyArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");

        boolean contains = list.contains("c");
        boolean contains2 = list.contains("f");
        boolean contains3 = list.contains("g");
    }

    @Test
    public void testSet() {
        MyArrayList list = new MyArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");

        boolean result1 = list.set("a", "A");
        boolean result2 = list.set("e", "E");
        boolean result3 = list.set("g", "G");
    }


    @Test
    public void testAdd2() {
        MyArrayList list = new MyArrayList();
        list.add(0,"a");
        list.add(1,"b");
        list.add(2,"c");
        list.add(3,"d");
        list.add(4,"e");
        list.add(5,"f");


        list.add(0, "AA");
        list.add(3, "BB");
    }

    @Test
    public void testRemove() {
        MyArrayList list = new MyArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");

        boolean r1 = list.remove(0);
        boolean r2 = list.remove(2);
        boolean r3 = list.remove(1);
    }

    @Test
    public void testRemove2() {
        MyArrayList list = new MyArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");

        boolean r1 = list.remove("d");
        boolean r2 = list.remove("f");
        boolean r3 = list.remove("a");
    }

    @Test
    public void testSet2() {
        MyArrayList list = new MyArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");

        String s1 = list.set(0, "aa");
        String s2 = list.set(1, "bb");
        String s3 = list.set(2, "cc");
    }
}

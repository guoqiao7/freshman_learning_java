package com.cskaoyan._15ds._02list;

import org.junit.Test;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/22 17:14
 **/

public class MyDBLinkedTest {
    @Test
    public void testAdd() {
        MyDBLinkedList list = new MyDBLinkedList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
    }


    @Test
    public void testRemove() {
        MyDBLinkedList list = new MyDBLinkedList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.remove("a");
        list.remove("c");
        list.remove("d");

    }

    @Test
    public void testContails() {
        MyDBLinkedList list = new MyDBLinkedList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        boolean r1 = list.contains("a");
        boolean r2 = list.contains("c");
        boolean r3 = list.contains("e");

    }

    @Test
    public void testAdd2() {
        MyDBLinkedList list = new MyDBLinkedList();
        list.add(0,"a");
        list.add(1,"b");
        list.add(2,"c");

        list.add(0, "AA");


    }

    @Test
    public void testRemove2() {
        MyDBLinkedList list = new MyDBLinkedList();
        list.add(0,"a");
        list.add(1,"b");
        list.add(2,"c");
        list.add(0, "AA");

        list.remove(0);
        list.remove(2);

    }

    @Test
    public void testContains2() {
        MyDBLinkedList list = new MyDBLinkedList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        String s1 = list.contains(0);
        String s2 = list.contains(3);
        String s3 = list.contains(1);
    }

    @Test
    public void testSet2() {
        MyDBLinkedList list = new MyDBLinkedList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        String s1 = list.set(0,"AA");
        String s2 = list.set(3,"DD");
        String s3 = list.set(1,"BB");
    }
}

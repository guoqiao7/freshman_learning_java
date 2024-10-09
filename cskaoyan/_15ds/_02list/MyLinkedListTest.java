package com.cskaoyan._15ds._02list;

import org.junit.Test;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/22 15:48
 **/

public class MyLinkedListTest {
    @Test
    public void testAdd() {
        MyLinkedList list = new MyLinkedList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list.size());
    }

    @Test
    public void testRemove() {
        MyLinkedList list = new MyLinkedList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        boolean r1 = list.remove("a");
        boolean r2 = list.remove("d");
        boolean r3 = list.remove("c");
    }

    @Test
    public void testContains() {
        MyLinkedList list = new MyLinkedList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        boolean r1 = list.contains("a");
        boolean r2 = list.contains("d");
        boolean r3 = list.contains("A");
    }


    @Test
    public void testSet() {
        MyLinkedList list = new MyLinkedList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        boolean r1 = list.set("a","AA");
        boolean r2 = list.set("b","BB");
        boolean r3 = list.set("c","CC");
    }


    @Test
    public void testAdd2() {
        MyLinkedList list = new MyLinkedList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        list.add(0, "e");
        list.add(1, "f");
    }


    @Test
    public void testRemove2() {
        MyLinkedList list = new MyLinkedList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        list.remove(0);
        list.remove(2);
    }
}

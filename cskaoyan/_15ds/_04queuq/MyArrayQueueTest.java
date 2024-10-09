package com.cskaoyan._15ds._04queuq;

import org.junit.Test;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/23 14:41
 **/

public class MyArrayQueueTest {
    @Test
    public void testOffer() {
        MyArrayQueue<String> queue = new MyArrayQueue<>();
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");
        queue.offer("e");
        queue.offer("f");
    }

    @Test
    public void testPoll() {
        MyArrayQueue<String> queue = new MyArrayQueue<>();
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("e");


        String poll1 = queue.poll();
        String poll2 = queue.poll();
        queue.offer("f");
        queue.offer("g");
        queue.offer("h");
        queue.offer("i");


    }
}

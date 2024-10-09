package com.cskaoyan._15ds._04queuq;

import org.junit.Test;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/23 15:46
 **/

public class MyLinkedQueueTest {
    @Test
    public void testOffer() {
        MyLinkedQueue<Integer> queue = new MyLinkedQueue<>();
        queue.offer(0);
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
    }

    @Test
    public void testPoll() {
        MyLinkedQueue<Integer> queue = new MyLinkedQueue<>();
        queue.offer(0);
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        Integer poll = queue.poll();
        Integer poll2 = queue.poll();
        Integer poll3 = queue.poll();
        Integer poll4 = queue.poll();
    }
}

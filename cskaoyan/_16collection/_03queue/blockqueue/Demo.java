package com.cskaoyan._16collection._03queue.blockqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/25 15:29
 **/
/*
BlockingQueue: 阻塞队列;  什么是阻塞队列? 阻塞队列的应用场景?
一般用在线程池中
阻塞队列:
1. 一个大小容量有限的队列
2. 添加操作的时候, 队列添加满了, 添加线程等待
3. 删除操作的时候, 队列删除空了, 删除线程等待
 */
public class Demo {
    public static void main(String[] args) throws InterruptedException {
        // BlockingQueue关于添加和删除的方法有四类:
        // 不满足条件抛出异常: add, remove
        // 不满足条件返回特殊值: offer(布尔值), poll(null)
        // 不满足条件一直阻塞: put, take
        // 在指定时间内阻塞:  超时的offer/poll
        ArrayBlockingQueue<String> blockingQueue =
                new ArrayBlockingQueue<String>(2);
        //blockingQueue.put("a");
        //System.out.println("put a");
        //blockingQueue.put("b");
        //System.out.println("put b");

        blockingQueue.offer("a",10, TimeUnit.SECONDS);
        System.out.println("put a");
        blockingQueue.offer("b",10,TimeUnit.SECONDS);
        System.out.println("put b");
        // 阻塞
        blockingQueue.offer("c",10,TimeUnit.SECONDS);

        System.out.println("main end");
    }
}

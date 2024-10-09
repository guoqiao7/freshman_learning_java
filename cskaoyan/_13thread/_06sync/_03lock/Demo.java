package com.cskaoyan._13thread._06sync._03lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/16 10:52
 **/
/*
     Lock l = ...; --->定义锁  使用ReentrantLock 作为Lock接口的实现类

     l.lock(); ---->加锁
     try {
     // 对共享数据 的访问操作
         // access the resource protected by this lock
     } finally {
         l.unlock();---->释放锁
     }

 */
public class Demo {
    public static void main(String[] args) {
        SellWindow task = new SellWindow();
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);
        t1.setName("A");
        t2.setName("B");
        t3.setName("C");
        t1.start();
        t2.start();
        t3.start();
    }
}

class  SellWindow implements Runnable{
    // 定义一把锁 使用Lock接口
    // 使用ReentrantLock 作为Lock接口的实现类
    Lock lock = new ReentrantLock();
    int tickets = 100;
    @Override
    public void run() {
        while (true) {
            // 获取锁 加锁
            // lock()
            lock.lock();
            try {
                // 对共享数据的访问操作
                if (tickets > 0) {
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName()+
                            "卖了第"+(tickets--)+"张票");
                }
            }finally {
                // 保证锁一定被释放 --->放到finally
                // 释放锁 unlock()
                lock.unlock();
            }

        }
    }
}
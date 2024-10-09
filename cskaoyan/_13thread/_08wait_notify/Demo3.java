package com.cskaoyan._13thread._08wait_notify;

import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/16 15:02
 **/
/*
验证wait执行特点2: 释放锁
 */
public class Demo3 {
    // 定义一把锁
    public static final Object OBJECT = new Object();
    public static void main(String[] args) {
        // 创建并启动一个线程A
        new Thread(()->{
            System.out.println("A线程执行了");
            // sync
            synchronized (OBJECT) {
                System.out.println("A线程进入到了sync");
                try {
                    TimeUnit.SECONDS.sleep(15);
                    System.out.println("wait before");
                    // wait
                    OBJECT.wait();
                    System.out.println("wait after");

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        },"A").start();

        // sleep--->让A线程先启动先执行先拿到锁
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // 创建并启动一个线程B
        new Thread(()->{
            System.out.println("B线程已经执行了");
            synchronized (OBJECT) {
                System.out.println("B线程进入到了sync");
                System.out.println("B线程进入退出了sync");
            }
        },"B").start();
    }
}

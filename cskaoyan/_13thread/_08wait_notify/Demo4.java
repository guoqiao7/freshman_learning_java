package com.cskaoyan._13thread._08wait_notify;

import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/16 15:33
 **/
/*
wait与notify的使用
 */
public class Demo4 {
    // 定义一把锁
    public static final Object OBJECT = new Object();
    public static void main(String[] args) {
        // 创建并启动一个线程A
        new Thread(()->{
            System.out.println("A线程开始执行了");
            // sync
            synchronized (OBJECT) {
                System.out.println("A线程进入sync");
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

        }).start();
        // sleep
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // 创建并启动一个线程B
        new Thread(()->{
            System.out.println("B已经执行了");
            synchronized (OBJECT) {
                System.out.println("B线程进入sync");

                System.out.println("notify before");
                // notify
                OBJECT.notify();// 并不会释放锁
                System.out.println("notify after");
                System.out.println("B退出sync");
            }
        },"B").start();
    }
}

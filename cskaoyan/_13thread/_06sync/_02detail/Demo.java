package com.cskaoyan._13thread._06sync._02detail;

import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/16 10:15
 **/
/*
sync执行流程
 */
public class Demo {
    // 定义一把锁
    public static final Object OBJECT = new Object();
    public static void main(String[] args) {
        // 创建并启动一个线程
        new Thread(()->{
            System.out.println("A线程开始执行");
            // sync
            synchronized (OBJECT) {
                System.out.println("A线程进入sync");
                // sleep
                try {
                    TimeUnit.SECONDS.sleep(15);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println("A线程退出sync");
            }

        },"A").start();

        // sleep ---> 目的是保证第一个线程先启动先执行 先拿到锁
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // 创建并启动一个线程
        new Thread(()->{
            System.out.println("B线程开始执行了!");
            // sync
            synchronized (OBJECT) {
                System.out.println("B进入sync");
                System.out.println("B退出sync");
            }
        },"B").start();
    }
}

package com.cskaoyan._13thread._08wait_notify;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/16 15:43
 **/
/*
2个线程AB
A打印奇数 B打印偶数 一共打印100个数
A---1
B---2
A---3
B---4
......

使用wait / notify
 */
public class Ex {
    // 定义一把锁
    public static final Object LOCK = new Object();
    public static void main(String[] args) {
        // 创建一个线程并启动A
        // A打印奇数
        new Thread(()->{
            // sync
            synchronized (LOCK) {
                for (int i = 1; i < 100; i += 2) {
                    // 先唤醒对方法
                    LOCK.notify();
                    // 打印
                    System.out.println(Thread.currentThread().getName() +
                            "----" + i);
                    // 阻止A再打印
                    //wait
                    try {
                        LOCK.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
                // 再次唤醒对方
                LOCK.notify();
            }
        },"A").start();

        //try {
        //    Thread.sleep(100);
        //} catch (InterruptedException e) {
        //    throw new RuntimeException(e);
        //}

        // 创建一个线程并启动B
        // B打印偶数
        new Thread(()->{
            // sync
            synchronized (LOCK) {
                for (int i = 2; i <=100 ; i+=2) {
                    // 先唤醒对方
                    LOCK.notify();
                    // 打印数据
                    System.out.println(Thread.currentThread().getName() +
                            "------" + i);
                    // 阻止B线程打印
                    // wait
                    try {
                        LOCK.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                // 再次唤醒对方
                LOCK.notify();
            }
        },"B").start();
    }
}

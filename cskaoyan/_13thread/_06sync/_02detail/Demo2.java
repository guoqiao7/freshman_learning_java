package com.cskaoyan._13thread._06sync._02detail;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/16 10:25
 **/
/*
验证异常会释放锁
 */
public class Demo2 {
    // 定义一把锁
    public static final Object OBJECT = new Object();
    public static int count = 0;
    public static void main(String[] args) {
        // 创建并启动一个线程A
        new Thread(()->{
            System.out.println("A线程开始执行了");
            // sync
            synchronized (OBJECT) {
                System.out.println("A线程进入sync");
                // 使用死循环
                while (true) {
                    count++;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    if (count == 10) {
                        System.out.println(count);
                        //制造一个异常
                        System.out.println(10/0);
                    }
                }
            }
        },"A").start();

        // sleep-->保证A先执行 先拿到锁
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // 创建并启动一个线程B
        new Thread(()->{
            System.out.println("B线程已经执行了!");
            // sync
            synchronized (OBJECT) {
                System.out.println("B线程进入sync!");

                System.out.println("B线程退出sync,并释放锁!");
            }
        },"B").start();
    }
}

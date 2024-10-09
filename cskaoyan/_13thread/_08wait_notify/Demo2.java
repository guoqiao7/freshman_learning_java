package com.cskaoyan._13thread._08wait_notify;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/16 14:56
 **/
/*
wait方法的执行特点1 --->阻塞

 */
public class Demo2 {
    public static void main(String[] args) {
        Object o = new Object();
        // sync
        synchronized (o) {
            // wait
            try {
                System.out.println("wait before");
                // 在锁对象上调用wait
                o.wait();
                System.out.println("wait after");

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            /*
            输出结果:
            wait before
            wait方法使当前线程处于阻塞状态
            当前线程?--->main线程
            wait after 没有输出
            想让他输出?
            --->需要再其他线程中 并且是同一个锁对象调用notify唤醒
             */
        }
    }
}

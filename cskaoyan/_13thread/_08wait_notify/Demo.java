package com.cskaoyan._13thread._08wait_notify;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/16 14:54
 **/
/*
wait的使用条件
 */
public class Demo {
    public static void main(String[] args) {
        Object o = new Object();
        try {
            // java.lang.IllegalMonitorStateException
            // 使用wait的条件--->先有锁对象
            // 要在锁对象上调用wait
            o.wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

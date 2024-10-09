package com.cskaoyan._13thread._06sync._02detail;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/16 10:35
 **/
/*
synchronized是可重入锁,锁对象关联的moniter中有个entry count计数器

synchronized无法看到加锁释放锁的过程--->JVM帮我们完成的
 */
public class Demo3 {
    public static void main(String[] args) {
        Object o = new Object();
        // monitorenter
        synchronized (o) {
            System.out.println(111);
        }
        // monitorexit
    }
}

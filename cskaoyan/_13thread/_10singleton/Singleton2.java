package com.cskaoyan._13thread._10singleton;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/17 9:20
 **/
/*
使用double check方式来保证线程安全
 */
public class Singleton2 {
    private static Singleton2 instance;
    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        // A先执行
        // check
        if (instance == null) {
            // A进入
            // B进入 B没有锁 -->阻塞
            // sync
            synchronized (Singleton2.class) {
                // A进入 没赋值就发生了线程切换
                // A释放锁后 B进入
                // 第二次check
                if (instance == null) {
                    instance = new Singleton2();
                }

            }
        }
        return instance;
    }
}

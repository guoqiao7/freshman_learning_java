package com.cskaoyan._13thread._10singleton;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/17 9:01
 **/
/*
如何实现单例设计模式?
1.构造器私有
2.提供一个静态方法来返回这个唯一对象
3.提供自身类型的全局成员变量

线程安全的懒加载单例
 */
public class Singleton {
    private static Singleton instance;
    private Singleton() {
    }

    // 锁的颗粒度比较大
    public static synchronized Singleton getInstance() {
        // A B 2个线程执行
        // 假设A先执行
        // B线程执行
        if (instance == null) {
            // A进入if中 发生了线程切换--->B
            // B线程进入if
            instance = new Singleton();
        }
        return instance;
    }

}

package com.cskaoyan._05oop1._14Singleton;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/5 10:32
 **/
// 实现立即加载单例 线程安全的
public class Singleton2 {
    // 提供一个自身类型的全局的成员变量

    private static Singleton2 instance = new Singleton2();

    // 构造器私有

    private Singleton2() {
    }


    // 提供一个静态的方法返回唯一的对象
    public static Singleton2 getInstance() {
        // 返回唯一的对象
        return instance;
    }

}

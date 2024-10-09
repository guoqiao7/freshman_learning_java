package com.cskaoyan._05oop1._14Singleton;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/5 10:14
 **/
/*
实现单例的步骤
- 构造器私有
- 提供一个静态的方法 , 来返回唯一的这个对象
- 提供一个自身类型的静态成员变量
 */


// 线程不安全的懒加载单例
public class Singleton {
    // 提供一个自身类型的静态成员变量
    private static Singleton instance;

    // 构造器私有
    private Singleton() {
    }

    // 提供一个静态的方法 , 来返回唯一的这个对象
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();

        }
        return instance;
    }
}

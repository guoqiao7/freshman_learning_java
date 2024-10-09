package com.cskaoyan._14generic._02generic_clazz;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/20 10:46
 **/
// 泛型不能创建对象
public class User3 <T>{
    T data;
    // static T data1;

    static {
        // Non-static field 'data' cannot be referenced from a static context
        // 静态域中不能使用泛型
        // System.out.println(data);
    }
    public User3(T data) {
        this.data = data;
    }

    public User3() {
        // Type parameter 'T' cannot be instantiated directly
        // 泛型不能直接new对象
        // T t = new T();
    }
}

package com.cskaoyan._14generic._04generic_method;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/20 11:07
 **/
/*
泛型方法
格式: public <泛型类型> 返回类型 方法名(泛型类型 .)
 */
public class Demo<T> {
    // 只是在方法中使用泛型
    public void func(T t) {
        System.out.println(t);
    }
    // 泛型方法
    public <E> void func2(E data) {
        System.out.println(data);
    }

}

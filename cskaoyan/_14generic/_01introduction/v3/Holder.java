package com.cskaoyan._14generic._01introduction.v3;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/20 9:40
 **/
// 车库类---> 使用泛型
public class Holder<T> {
    // 成员变量
    private T car;


    public Holder(T car) {
        this.car = car;
    }

    public T getCar() {
        return car;
    }
}

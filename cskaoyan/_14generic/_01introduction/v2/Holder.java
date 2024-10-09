package com.cskaoyan._14generic._01introduction.v2;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/20 9:40
 **/
// 车库类
public class Holder {
    // 成员变量
    // 使用Object类型来接收任意类型的汽车
    private Object car;

    public Holder(Object car) {
        this.car = car;
    }

    public Object getCar() {
        return car;
    }
}

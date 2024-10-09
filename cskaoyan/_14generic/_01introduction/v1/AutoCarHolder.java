package com.cskaoyan._14generic._01introduction.v1;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/20 9:27
 **/
/*
- 汽车的车库(主要用于存放车)。还提供一个方法从车库中获取汽车。
 */
public class AutoCarHolder {
    // 用来存放新能源汽车
    private AutoCar autoCar;

    public AutoCarHolder(AutoCar autoCar) {
        this.autoCar = autoCar;
    }

    public AutoCar getAutoCar() {
        return autoCar;
    }
}

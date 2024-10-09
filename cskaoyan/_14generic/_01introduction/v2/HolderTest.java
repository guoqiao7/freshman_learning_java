package com.cskaoyan._14generic._01introduction.v2;

import org.junit.Test;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/20 9:41
 **/

public class HolderTest {
    @Test
    public void testAutoCar() {
        // 创建车库
        Holder holder = new Holder(new AutoCar());
        // 取车
        Object car = holder.getCar();
        // run
        ((AutoCar) car).run();
    }

    @Test
    public void testTruck() {
        // 创建车库
        Holder holder = new Holder(new Truck());
        // 取车
        Object car = holder.getCar();
        // run
        ((Truck) car).run();
    }

    @Test
    public void testBike() {
        // 创建车库
        Holder holder = new Holder(new Bike());
        // 取车
        Object car = holder.getCar();
        // run
        ((Bike) car).run();
    }

    @Test
    public void testBike2() {
        // 创建车库
        Holder holder = new Holder(new AutoCar());
        // 取车
        Object car = holder.getCar();
        // run
        ((Bike) car).run();
    }
}

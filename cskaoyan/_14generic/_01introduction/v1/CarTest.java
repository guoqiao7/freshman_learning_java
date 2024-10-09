package com.cskaoyan._14generic._01introduction.v1;

import org.junit.Test;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/20 9:32
 **/

public class CarTest {
    @Test
    public void testAutoCar() {
        // 创建车库
        AutoCarHolder autoCarHolder = new AutoCarHolder(new AutoCar());
        // 从车库中取车
        AutoCar autoCar = autoCarHolder.getAutoCar();
        autoCar.run();
    }
    @Test
    public void testTruck() {
        // 创建车库
        TruckHolder truckHolder = new TruckHolder(new Truck());
        // 从车库中取车
        Truck truck = truckHolder.getTruck();
        truck.run();
    }

}

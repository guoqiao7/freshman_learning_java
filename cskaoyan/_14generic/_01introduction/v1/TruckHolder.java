package com.cskaoyan._14generic._01introduction.v1;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/20 9:31
 **/
/*
停放卡车的车库
 */
public class TruckHolder {
    private Truck truck;

    public TruckHolder(Truck truck) {
        this.truck = truck;
    }

    public Truck getTruck() {
        return truck;
    }
}

package com.cskaoyan._14generic._01introduction.v3;

import org.junit.Test;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/20 9:47
 **/

public class HolderTest {

    @Test
    public void myTest() {
        Holder<AutoCar> holder = new Holder<>(new AutoCar());
        AutoCar car = holder.getCar();
        car.run();

        Holder<Bike> holder2 = new Holder<>(new Bike());
        Bike car1 = holder2.getCar();
        car1.run();
    }
}

class Student implements Comparable<Student>{
    @Override
    public int compareTo(Student o) {
        return 0;
    }

    //@Override
    //public int compareTo(Object o) {
    //    return 0;
    //}
}
package com.cskaoyan._05oop1._06this;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/2 16:37
 **/
/*
创建一个汽车类，有颜色（color）和速度（speed）两个属性，行为是可以跑（run）。

实现：
1. 在run成员方法中访问速度和颜色两个属性，调用该方法查看结果。
2. 在run成员方法的形参列表中，添加一个局部变量speed，不修改方法体，调用该方法查看结果。
思考：
1. 两次方法调用的结果一样吗？为什么？
2. 如果我想在2中得到1的访问结果，怎么办呢？
 */
public class Demo {
    public static void main(String[] args) {
        // 创建Car对象
        // 对象.成员方法(实参)
        Car car = new Car();
        // car.run();
        // 一辆黑色颜色的汽车以100的速度疾驰!

        car.run(120);
        //一辆黑色颜色的汽车以120的速度疾驰!
    }
}

class Car{
    String color = "黑色";
    int speed = 100;

    // 成员方法
    //public void run() {
    //    System.out.println("一辆" + color + "颜色的汽车以" + speed + "的速度疾驰!");
    //}

    public void run(int speed) {
        // 出现了同名的成员变量与局部变量
        // 就近原则--->访问的是局部变量形参speed
        // 想要访问成员变量speed, 使用this.成员变量访问
        // System.out.println("一辆" + color + "颜色的汽车以" + speed + "的速度疾驰!");
        // this来区分同名的成员变量与局部变量
        System.out.println("一辆" + color + "颜色的汽车以" + this.speed + "的速度疾驰!");
    }

    public void run1() {
        System.out.println(this.color);
        System.out.println(this.speed);
    }
    public void run2() {
        System.out.println(color);
        System.out.println(speed);
    }
}
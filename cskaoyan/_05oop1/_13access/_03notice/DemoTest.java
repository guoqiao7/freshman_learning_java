package com.cskaoyan._05oop1._13access._03notice;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/5 9:13
 **/

public class DemoTest {
    public static void main(String[] args) {
        Demo demo = new Demo(1);

        // Demo()' has private access in 'com.cskaoyan._05oop1._13access._03notice.Demo'
        // Demo demo1 = new Demo();
        // Math.pow()

        //'Math()' has private access in 'java.lang.Math'
        // Math math = new Math();
        // Arrays arrays = new Arrays();
    }

    public static int getSum() {
        // do sth
        return m1();
    }

    private static int m1() {
        // do sth
        return m2();
    }

    private static int m2() {
        // do sth
        return 1;
    }
}

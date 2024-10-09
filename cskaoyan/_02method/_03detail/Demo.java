package com.cskaoyan._02method._03detail;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/30 9:35
 **/
/*
实参的自动类型转换: 方法在调用时，如果填入的实参的数据类型，
可以自动类型转换成形参的数据类型，那么即便数据类型不一致，
语法上仍然允许该数据类型的变量作为实参。反之强制类型转换不行。
方法的返回值和它的返回值类型也存在这种特点！(如果一个方法需要传入一个long类型数据，
那我传入一个int值可以吗？如果传入double值可以吗?)
 */
public class Demo {
    public static void main(String[] args) {
        // int a = 1;
        byte a = 1;
        // 存在自动类型转换 byte--->int 小--->大
        m1(a);

        // int b = 1;
        // m2(b);

    }

    public static void m1(int a) {

    }

    public static void m2(byte a) {

    }

    public static int m3() {
        // int a = 1;
        byte a = 1;
        // 自动类型准换
        return a;
    }
}

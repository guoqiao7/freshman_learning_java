package com.cskaoyan._02method._04overload;

/**
 * @description:
 * @author: 景天
 * @date: 2023/12/30 10:42
 **/

public class Demo3 {
    public static void main(String[] args) {
        m1(10);
        // 3个方法都匹配的时候 就近原则
        //System.out.println(1);
        //System.out.println(1.1);
        //System.out.println("aaa");

        // m2(10,10);
        // Ambiguous method call.
    }

    // 方法1
    //public static void m1(int a){}
    // 方法2
    public static void m1(double a){}
    // 方法3
    public static void m1(float a){}



    // 方法1
    public static void m2(int a,double b){}
    // 方法2
    public static void m2(double a,int b){}
}

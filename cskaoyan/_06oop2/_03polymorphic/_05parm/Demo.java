package com.cskaoyan._06oop2._03polymorphic._05parm;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/8 14:07
 **/

public class Demo {
    public static void main(String[] args) {
        int a = 1;
        test1(a);
        // 小-->大 自动类型转换
        byte b = 1;
        test1(b);

        test2(new Fruit());
        // 自动类型转换
        test2(new Apple());

    }

    public static void test1(int a) {

    }

    public static void test2(Fruit fruit) {

    }

    public static int test3() {
        //int a = 1;
        //return a;
        byte b = 1;
        // 自动类型转换
        return b;
    }

    public static Fruit test4() {
        //return new Fruit();
        // 自动类型转换
        return new Apple();
    }
}

class Fruit{

}

class Apple extends Fruit{

}
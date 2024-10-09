package com.cskaoyan._06oop2._02extends._11override._01introduction;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/6 10:28
 **/

public class Demo {
    public static void main(String[] args) {
        Son son = new Son();
        son.m1();
        // son m1

        son.test();
        // son m1
    }
}

class Father{
    public void m1() {
        System.out.println("father m1");
    }

    public void test() {
        m1();
    }
}

class Son extends Father{
    public void m1() {
        System.out.println("son m1");
    }
}

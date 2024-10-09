package com.cskaoyan._13thread._02implone;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/15 10:12
 **/
/*
多线程的执行特点--->随机的 每次执行的结果可能不同
 */
public class Demo2 {
    public static void main(String[] args) {
        System.out.println("main start");
        // 创建子类对象
        MyThread2 t1 = new MyThread2();
        MyThread2 t2 = new MyThread2();
        // start
        t1.start();
        t2.start();
        System.out.println("main end");

    }
}
// 继承Thread类
class MyThread2 extends Thread{
    // run

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            // getName() --->获取线程名称
            System.out.println(getName()+"-----"+i);
        }
    }
}

package com.cskaoyan._13thread._02implone;

import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/15 10:07
 **/
/*
多线程的实现方式一:通过继承Thread
1. 定义一个类继承Thread类
2. 重写run方法
3. 创建子类对象
4. 通过start方法启动线程
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("main start");
        //3. 创建子类对象
        MyThread myThread = new MyThread();
        //4. 通过start方法启动线程
        myThread.start();

        // sleep
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("main end");

    }
}

//1. 定义一个类继承Thread类
class MyThread extends Thread{
    //2. 重写run方法
    @Override
    public void run() {
        // do sth
        System.out.println("子线程执行了!");
    }
}
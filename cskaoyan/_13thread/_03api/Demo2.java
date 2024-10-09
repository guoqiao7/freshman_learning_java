package com.cskaoyan._13thread._03api;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/15 10:52
 **/
/*
线程的优先级 1-10
static int MAX_PRIORITY
          线程可以具有的最高优先级。
static int MIN_PRIORITY
          线程可以具有的最低优先级。
static int NORM_PRIORITY
          分配给线程的默认优先级。

 */
public class Demo2 {
    public static void main(String[] args) {
        MyThread2 t1 = new MyThread2();
        // 更改优先级 setPriority(int n)
        t1.setPriority(Thread.MAX_PRIORITY);


        // getPriority()-->获取优先级
        int priority = t1.getPriority();
        System.out.println(priority);
        t1.start();
    }
}
class MyThread2 extends Thread{
    @Override
    public void run() {
        System.out.println("xxxxxx");
    }
}
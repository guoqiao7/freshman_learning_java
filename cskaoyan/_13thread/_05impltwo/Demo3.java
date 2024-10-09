package com.cskaoyan._13thread._05impltwo;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/15 16:17
 **/
/*
方式二更便于解耦--->把执行路径跟执行路劲上要做的事情(任务) 区分开来
 */
public class Demo3 {
    public static void main(String[] args) {
        // 创建Runnable子类对象--->任务
        MyRunnable3 task = new MyRunnable3();

        MyRunnable4 task2 = new MyRunnable4();

        // 创建线程对象
        // Thread t = new Thread(task);
        Thread t = new Thread(task2);

        t.start();
    }
}

class MyRunnable3 implements Runnable{
    @Override
    public void run() {
        System.out.println(1111);
    }
}

class MyRunnable4 implements Runnable{

    @Override
    public void run() {
        System.out.println(2222);

    }
}
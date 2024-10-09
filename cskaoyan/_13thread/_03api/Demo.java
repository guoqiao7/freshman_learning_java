package com.cskaoyan._13thread._03api;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/15 10:36
 **/

public class Demo {
    public static void main(String[] args) {
        // 如何获取main线程的名字--->"main"
        // static Thread currentThread()
        // 返回对当前正在执行的线程对象的引用。
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());
        // 创建线程对象
        //MyThread t1 = new MyThread();
        //MyThread t2 = new MyThread();
        // setName(String name)   设置线程名称
        //t1.setName("彭于晏");
        //t2.setName("吴彦祖");

        MyThread t1 = new MyThread("A");
        MyThread t2 = new MyThread("B");

        // 启动线程
        t1.start();
        t2.start();

    }
}

class MyThread extends Thread{
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            // System.out.println(getName() + "----" + i);
            System.out.println(Thread.currentThread().getName() + "----" + i);

        }
    }
}

package com.cskaoyan._13thread._04control;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/15 14:21
 **/

public class SleepDemo {
    public static void main(String[] args) {
        System.out.println("main start");

        // 创建线程对象并启动
        //ThreadSleep t = new ThreadSleep();
        //t.start();
        // 使用匿名对象
        new ThreadSleep().start();


        // 让main睡眠
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("main end");

    }
}

class ThreadSleep extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            // Thread.sleep(毫秒);
            // 等价于TimeUnit.seconds(2).sleep
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

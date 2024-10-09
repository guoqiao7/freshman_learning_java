package com.cskaoyan._13thread._03api;

import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/15 14:12
 **/

public class Demo4 {
    public static void main(String[] args) {
        MyThread4 t1 = new MyThread4();

        MyThread5 t2 = new MyThread5();

        t1.start();
        t2.start();
    }
}

class MyThread4 extends Thread{
    @Override
    public void run() {
        while (true) {
            System.out.println(getName()+"---"+"你好");
            try {
                TimeUnit.MILLISECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


class MyThread5 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(getName()+"----"+i);
            try {
                TimeUnit.MILLISECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
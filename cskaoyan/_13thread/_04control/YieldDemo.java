package com.cskaoyan._13thread._04control;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/15 14:41
 **/
/*
创建并启动2个线程 A B

都是打印10个数

要求A打印0, B打印0, A打印1, B打印1.....

A----0
B----0
A----1
B----1
A----2
A----3
A----4
A----5
A----6
A----7
A----8
A----9
B----2
B----3
B----4
B----5
B----6
B----7
B----8
B----9

===>使用yield方法做不到让线程交替打印
 */
public class YieldDemo {
    public static void main(String[] args) {
        // 创建2个线程并启动
        new ThreadYield("A").start();
        new ThreadYield("B").start();
    }
}

class ThreadYield extends Thread{
    public ThreadYield(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName()+"----"+i);
            // yield 暂停当前正在执行的线程对象，并执行其他线程。
            Thread.yield();
            // Java中采用的是抢占的调度方式
            // 假设A先执行,执行到yield 主动放弃了CPU的执行权
            // 但是请问此时下次哪个线程先执行???
            // A线程还是可以参与下一轮的CPU竞争
        }
    }
}


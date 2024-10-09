package com.cskaoyan._13thread._04control;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/15 14:57
 **/

public class DaemonDemo {
    public static void main(String[] args) {
        // main线程肯定是用户线程
        System.out.println("main start");

        // 创建并启动线程
        ThreadDaemon t = new ThreadDaemon();

        // setDaemon(true) 设置为守护线程
        // 需要在start之前使用
        // java.lang.IllegalThreadStateException
        t.setDaemon(true);
        t.start();
        // main 打印3个数
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName()+
                    "----"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("main end");
    }
}

class ThreadDaemon extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + "---" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
package com.cskaoyan._13thread._06sync._01basic;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/15 17:26
 **/
/*

静态同步方法
锁对象是谁? Class对象
 */
public class Demo4 {
    public static void main(String[] args) {
        // 创建Runnable子类对象
        SellWindow4 task = new SellWindow4();
        // 创建3个线程
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);

        t1.setName("A窗口");
        t2.setName("B窗口");
        t3.setName("C窗口");
        // start
        t1.start();
        t2.start();
        t3.start();
    }
}

class SellWindow4 implements Runnable {
    // 定义票
    static int tickets = 100;
    // 定义一把锁
    Object lock = new Object();
    // B lock = new B();

    int i = 0;


    // run
    @Override
    public void run() {
        while (true) {
            if (i % 2 == 0) {
                // 同步代码块
                // 使用字节码文件对象
                // 对象.getClass()--->Class对象
                // 类名.class--->Class对象
                synchronized (SellWindow4.class) {
                    // 对共享数据的访问操作
                    if (tickets > 0) {
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                        System.out.println(
                                Thread.currentThread().getName()
                                        + "卖了第" + (tickets--) + "张票");

                    }
                }
            } else {
                // 同步方法
                sell();
            }
            i++;

        }
    }

    // 静态同步方法
    public static synchronized void sell() {
        // 对共享数据的访问操作
        if (tickets > 0) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(
                    Thread.currentThread().getName()
                            + "卖了第" + (tickets--) + "张票");
        }

    }
}

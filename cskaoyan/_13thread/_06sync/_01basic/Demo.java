package com.cskaoyan._13thread._06sync._01basic;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/15 17:26
 **/
/*

同步代码块
使用一个对象来充当锁的角色
synchronized(锁对象){
    // 对共享数据的访问操作
}

注意:锁对象可以是任意Java对象 但是要保证是同一个
 */
public class Demo {
    public static void main(String[] args) {
        // 创建Runnable子类对象
        SellWindow task = new SellWindow();
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

class SellWindow implements Runnable {
    // 定义票
    int tickets = 100;
    // 定义一把锁
    // A lock = new A();
    Object lock = new Object();

    // run
    @Override
    public void run() {
        while (true) {
            // synchronized(锁对象){
            //    // 对共享数据的访问操作
            //}
            synchronized (lock) {
                // 对共享数据的访问操作
                // 模拟卖票
                if (tickets > 0) {
                    try {
                        // 增加一个网络时延
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
    }
}

class A {

}
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

===> 故意写个错误示例
 */
public class Demo2 {
    public static void main(String[] args) {
        // 创建Runnable子类对象
        SellWindow2 task = new SellWindow2();
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

class SellWindow2 implements Runnable {
    // 定义票
    int tickets = 100;
    // 定义一把锁
    // A lock = new A();
    Object lock = new Object();

    // run
    @Override
    public void run() {
        while (true) {
            // ABC 线程都在执行 tickets = 1;
            // A先执行
            // B执行
            // C执行
            if (tickets > 0) {
                // A进入
                // B执行进入if 不能进入sync 阻塞
                // C执行进入if 不能进入sync 阻塞
                synchronized (lock) {
                    // A进入
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

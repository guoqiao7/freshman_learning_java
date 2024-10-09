package com.cskaoyan._13thread._06datasecurity;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/15 16:23
 **/
/*
多线程仿真如下场景：
假设A电影院正在上映某电影，该电影有100张电影票可供出售，
现在假设有3个窗口售票。请设计程序模拟窗口售票的场景。

分析：
3个窗口售票，互不影响，同时进行。 -----> 多线程  3个线程
3个窗口共同出售这100张电影票		-------> 多线程共享数据

方式二实现
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
class SellWindow2 implements Runnable{
    // 定义票
    int tickets = 100;

    // run
    @Override
    public void run() {
        while (true) {
            // 分析出现3张100 票的情况

            // 假设此时tickets = 100
            // ABC 3个线程同时执行
            // 假设A线程先执行
            // 假设B线程抢到了CPU执行权  tickets = 100
            // 假设C线程抢到了CPU执行权  tickets = 100
            //

            // 分析出现不存在的票的情况
            // 假设此时tickets = 1
            // ABC 3个线程同时执行
            // 假设A线程先执行  tickets = 1
            // 假设B线程先执行  tickets = 1
            // 假设C线程先执行  tickets = 1

            // 模拟卖票
            if (tickets > 0) {
                // A进入if 睡眠
                // B进入if 睡眠
                // C进入if 睡眠
                // 3个线程全部进来
                try {
                    // 增加一个网络时延
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println(
                        Thread.currentThread().getName()
                                + "卖了第"+ (tickets--)+ "张票");
                // tickets-- 分为几步?
                // 1.取值 2.-1 3.重新赋值

                // 假设A先执行  取值tickets = 100 没来得及-1发生了线程切换
                // 假设B抢到了  取值tickets = 100 没来得及-1发生了线程切换
                // C抢到了     取值tickets = 100
                //===>ABC 都卖了第100

                // 假设A先执行 打印A窗口卖了第1张票 剩余0张
                // 假设B执行 打印B窗口卖了第0张票 剩余-1张
                // 假设C执行 打印C窗口卖了第-1张票 剩余-2张
            }
        }
    }
}


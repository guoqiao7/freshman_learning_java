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

方式一实现
 */
public class Demo {
    public static void main(String[] args) {
        // 创建3个线程
        SellWindow t1 = new SellWindow();
        SellWindow t2 = new SellWindow();
        SellWindow t3 = new SellWindow();
        t1.setName("A窗口");
        t2.setName("B窗口");
        t3.setName("C窗口");
        // start
        t1.start();
        t2.start();
        t3.start();
    }
}
class SellWindow extends Thread{
    // 定义票
    static int tickets = 100;

    // run
    @Override
    public void run() {
        while (true) {
            // 模拟卖票
            if (tickets > 0) {
                System.out.println(getName() + "卖了第"+ (tickets--)+
                        "张票");
            }
        }
    }
}


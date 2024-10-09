package com.cskaoyan._13thread._04control;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/15 14:27
 **/
/*
join 方法搞清楚2个问题

1.谁等待? 主线程等待---->join这个代码运行在哪个线程中,哪个线程就等待
2.等待谁? 等待的是子线程--->等待的是调用了join的这个线程   t.join();
 */
public class JoinDemo {
    public static void main(String[] args) {
        System.out.println("main start");

        ThreadJoin t = new ThreadJoin();
        t.start();

        // join
        try {
            t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // 让main线程 打印3个数
        for (int i = 0; i < 3; i++) {
            System.out.println("main---" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("main end");
    }
}

class ThreadJoin extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + "----" + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
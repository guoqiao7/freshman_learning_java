package com.cskaoyan._13thread._09producer_consumer.v1;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/16 16:12
 **/

// 消费者任务
public class ConsumerTask implements Runnable{
    // 定义成员
    Container container;

    public ConsumerTask(Container container) {
        this.container = container;
    }

    @Override
    public void run() {
        // 吃包子
        while (true) {
            // sync
            synchronized (container) {
                // 判断蒸笼状态
                if (container.isEmpty()) {
                    //如果蒸笼为空 说明没有包子
                    //阻止自己吃包子  wait
                    try {
                        container.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    //如果蒸笼非空 说明有包子
                    //吃包子
                    container.eatFood();
                    //通知生产者继续生产包子
                    //notify
                    // container.notify();
                    container.notifyAll();

                }
            }
        }
    }
}

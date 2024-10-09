package com.cskaoyan._13thread._09producer_consumer.v2;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/16 16:54
 **/

public class ConsumerTask implements Runnable{
    Container container;

    public ConsumerTask(Container container) {
        this.container = container;
    }

    @Override
    public void run() {
        // 吃包子
        while (true) {
            container.eatFood();
        }
    }
}

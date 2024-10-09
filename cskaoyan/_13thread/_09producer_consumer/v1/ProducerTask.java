package com.cskaoyan._13thread._09producer_consumer.v1;

import java.util.Random;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/16 16:11
 **/
// 生产者任务
public class ProducerTask implements Runnable{
    // 定义成员
    Container container;
    // 包子数组
    Food[] foods = {new Food("韭菜鸡蛋包", 1),
            new Food("生蚝包", 10),
            new Food("羊腰子包", 20)};

    Random random = new Random();
    public ProducerTask(Container container) {
        this.container = container;
    }

    @Override
    public void run() {
        while (true) {
            // sync
            synchronized (container) {
                // 判断蒸笼状态
                if (container.isEmpty()) {
                    //如果蒸笼为空 说明没有包子
                    //生产包子 放进入
                    int index = random.nextInt(foods.length);
                    container.setFood(foods[index]);
                    //通知消费者吃包子 notify
                    //container.notify();
                    container.notifyAll();
                }else{
                    //如果蒸笼非空 有包子
                    //阻止自己生产包子 wait
                    try {
                        container.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}

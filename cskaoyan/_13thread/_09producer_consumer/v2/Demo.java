package com.cskaoyan._13thread._09producer_consumer.v2;


/**
 * @description:
 * @author: 景天
 * @date: 2024/1/16 16:48
 **/

public class Demo {
    public static void main(String[] args) {
        // 进行测试
        // 创建蒸笼对象
        Container container = new Container();

        // 创建生产者任务
        ProducerTask producerTask = new ProducerTask(container);

        // 创建消费者任务
        ConsumerTask consumerTask = new ConsumerTask(container);

        // 创建生产者线程
        Thread t1 = new Thread(producerTask);

        // 创建消费者线程
        Thread t2 = new Thread(consumerTask);
        t1.setName("生产者");
        t2.setName("消费者");
        // start启动线程
        t1.start();
        t2.start();
    }
}

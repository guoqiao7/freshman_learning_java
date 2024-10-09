package com.cskaoyan._13thread._09producer_consumer.v2;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/16 16:48
 **/

// 蒸笼类
public class Container {
    // 成员
    Food food;

    // 提供一个生产包子的方法 只有生产者执行
    public synchronized void setFood(Food newFood) {
        // 判断蒸笼状态
        if (food == null) {
            //如果蒸笼为空 说明没有包子
            //生产包子 放进入
            food = newFood;
            System.out.println(Thread.currentThread().getName() +
                    "生产了" + food);
            //通知消费者吃包子 notify
            this.notify();

        }else{
            //如果蒸笼非空 有包子
            //阻止自己生产包子 wait
            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    // 提供一个吃包子的方法 只有消费者执行
    public synchronized void eatFood() {
        // 判断蒸笼状态
        if (food == null) {
            //如果蒸笼为空 说明没有包子
            //阻止自己吃包子  wait
            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }else{
            //如果蒸笼非空 说明有包子
            System.out.println(Thread.currentThread().getName() +
                    "吃了" + food);
            //吃包子
            food = null;
            //通知生产者继续生产包子
            //notify
            this.notify();
        }
    }
}


class Food{
    String name;
    int price;

    public Food(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
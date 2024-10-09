package com.cskaoyan._13thread._09producer_consumer.v1;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/16 16:13
 **/

// 蒸笼类
public class Container {
    // 定义成员变量
    Food food;

    // 提供一些方法
    // 生产包子的方法 ---> 只有生产者才执行
    public void setFood(Food newFood) {
        // 给成员变量赋值--->装进蒸笼里了
        food = newFood;
        // 输出
        System.out.println(Thread.currentThread().getName() +
                "生产了" + food);
    }

    // 吃包子的方法 ----> 只有消费者才执行
    public void eatFood() {
        // 输出
        System.out.println(Thread.currentThread().getName() +
                "吃了" + food);
        // 包子被吃了
        food = null;
    }

    // 判断蒸笼状态的方法
    public boolean isEmpty() {
        return food == null;
        // true---->蒸笼为空
        // false--->非空
    }

}


// 表示包子类
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
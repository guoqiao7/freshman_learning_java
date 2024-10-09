package com.cskaoyan._13thread._09producer_consumer.v2;

import java.util.Random;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/16 16:51
 **/

public class ProducerTask implements Runnable{
    // 成员
    Container container;
    Food[] foods = {new Food("酱肉包", 2),
            new Food("青菜包", 1),
            new Food("狗不理包子",40)};
    Random random = new Random();
    public ProducerTask(Container container) {
        this.container = container;
    }

    @Override
    public void run() {
        // 只做一件事 生产包子
        while (true) {
            int index = random.nextInt(foods.length);
            container.setFood(foods[index]);

        }
    }
}

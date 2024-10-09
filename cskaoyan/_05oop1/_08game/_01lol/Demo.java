package com.cskaoyan._05oop1._08game._01lol;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/3 10:08
 **/

public class Demo {
    public static void main(String[] args) {
        // 创建不同的英雄角色
        Hero garen = new Hero("盖伦", "沉默", "勇气", "爱的魔力转圈圈",
                "大宝剑", 1000, 0);

        garen.fight();

        Hero timo = new Hero("Timo", "致盲", "跑的快", "放毒", "种蘑菇,",
                500, 300);
        timo.fight();
    }
}

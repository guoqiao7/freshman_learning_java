package com.cskaoyan._05oop1._08game._02pvz;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/3 10:28
 **/

public class Demo {
    public static void main(String[] args) {
        // 进行测试
        // 创建植物对象
        Plant plant = new Plant("豌豆射手", 20, 50, 200);
        // 创建僵尸对象
        Zombie zombie = new Zombie("头盔僵尸", 100, 1000, 5);

        // 对象之间进行交互 互相持有对方的引用
        // 赋值 建立联系
        plant.zombie = zombie;
        zombie.plant = plant;

        plant.attack();
        zombie.unAttack();

        plant.attack();
        zombie.unAttack();

        zombie.attack();
        plant.unAttacked();

        zombie.attack();
        plant.unAttacked();

        zombie.move();
        // ......
        zombie.eat();
    }
}

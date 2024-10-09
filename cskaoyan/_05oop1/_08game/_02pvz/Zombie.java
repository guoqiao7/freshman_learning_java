package com.cskaoyan._05oop1._08game._02pvz;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/3 10:29
 **/

// 僵尸类
public class Zombie {
    String name;
    int damage;
    int hp;
    int speed;
    // 持有植物类型的引用
    Plant plant;

    public Zombie(String name, int damage, int hp, int speed) {
        this.name = name;
        this.damage = damage;
        this.hp = hp;
        this.speed = speed;
    }

    // 定义成员方法
    public void attack() {
        System.out.println(name + "正在攻击,伤害是: " + damage);

    }

    public void unAttack() {
        System.out.println(name + "正在被"+ plant.name +"攻击,hp还剩余"
                + (hp - plant.damage));
        // 修改僵尸的总血量
        hp = hp - plant.damage;
    }
    public void move() {
        System.out.println("正在以"+speed +"的速度移动");
    }

    public void eat() {
        System.out.println("你的脑子被吃了!");
    }
}

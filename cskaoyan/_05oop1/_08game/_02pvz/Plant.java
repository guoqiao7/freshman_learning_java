package com.cskaoyan._05oop1._08game._02pvz;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/3 10:29
 **/

// 植物类
public class Plant {
    String name;
    int price;
    int damage;
    int hp;
    Zombie zombie;

    public Plant(String name, int price, int damage, int hp) {
        this.name = name;
        this.price = price;
        this.damage = damage;
        this.hp = hp;
    }

    public void attack() {
        System.out.println(name + "正在攻击,伤害是: " + damage);
    }

    public void unAttacked() {
        System.out.println(name + "正在被"+ zombie.name +"攻击,hp还剩余"
                + (hp - zombie.damage));
        // update血量
        hp = hp - zombie.damage;
    }
}

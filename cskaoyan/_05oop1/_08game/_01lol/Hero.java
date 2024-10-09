package com.cskaoyan._05oop1._08game._01lol;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/3 10:18
 **/
// 英雄模板类
public class Hero {
    String name;
    String skillQ;
    String skillW;
    String skillE;
    String skillR;
    int hp;
    int mp;

    public Hero(String name, String skillQ, String skillW, String skillE, String skillR, int hp, int mp) {
        this.name = name;
        this.skillQ = skillQ;
        this.skillW = skillW;
        this.skillE = skillE;
        this.skillR = skillR;
        this.hp = hp;
        this.mp = mp;
    }

    public void fight() {
        System.out.println(name + "使用了" + skillR + "进行战斗,血量有: " + hp +
                "蓝量: " + mp);
    }
}

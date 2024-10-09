package com.cskaoyan._05oop1._09static._01introudction;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/3 14:30
 **/
/*
场景如下:
一场篮球比赛, 梦之队有5名顶级球员Kobe, James, Stephen...... 都是神射手擅长投3分,投篮必进
每进一球, 队伍分数+3, 比赛结束, 统计一下该队伍得分情况,  写程序模拟这个场景.
思路:
- main里面定义int count, 用来记录分数
- 每当有1个球员进球, 分数+3
 */
public class Demo {
    public static void main(String[] args) {
        int count = 0;
        Player p1 = new Player("Kobe");
        Player p2 = new Player("James");
        Player p3 = new Player("Stephen");
        p1.shot();
        count += 3;
        p1.shot();
        count += 3;

        p2.shot();
        count += 3;

        p3.shot();
        count += 3;

        p3.shot();
        count += 3;

        // ... 比赛结束
        System.out.println("球队得分:" + count);

    }
}

class Player{
    String name;

    public Player(String name) {
        this.name = name;
    }

    public void shot() {
        System.out.println(name+"投了一个三分,进了!");
    }
}
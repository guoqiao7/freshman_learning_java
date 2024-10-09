package com.cskaoyan._05oop1._09static._01introudction;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/3 14:48
 **/
/*
场景如下:
一场篮球比赛, 梦之队有5名顶级球员Kobe, James, Stephen...... 都是神射手擅长投3分,投篮必进
每进一球, 队伍分数+3, 比赛结束, 统计一下该队伍得分情况,  写程序模拟这个场景.

使用静态成员变量改进
 */
public class Demo3 {
    public static void main(String[] args) {
        Player2 p1 = new Player2("Kobe");
        Player2 p2 = new Player2("James");
        Player2 p3 = new Player2("Stephen");
        p1.shot();
        p1.shot();
        p2.shot();
        p2.shot();
        p3.shot();


        //。。。
        System.out.println("球队得分： " + Player2.count);

        //System.out.println("球队得分： " + p1.count);
        //System.out.println("球队得分： " + p2.count);
        //System.out.println("球队得分： " + p3.count);

    }
}


class Player2{
    String name;

    // 静态成员变量
    static int count = 0;
    public Player2(String name) {
        this.name = name;
    }

    public void shot() {
        System.out.println(name+"投了一个三分,进了!");
        Player2.count += 3;
    }
}
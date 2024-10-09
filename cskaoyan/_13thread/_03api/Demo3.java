package com.cskaoyan._13thread._03api;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/15 10:56
 **/
/*
A线程打印1-10   A的优先级为10
B线程打印1-10   B的优先级为1

通过设置优先级能不能保证先A 后B---->不能保证---->优先级没有作用

优先级分静态与动态
操作系统优先级
动态优先级:
    优先级高的线程会随着执行时间的延长 优先级降低
    优先级低的线程会随着等待时间的延长 优先级升高
静态优先级:固定值

动态+静态

java优先级是静态优先级--->只是对操作系统的建议
 */
public class Demo3 {
    public static void main(String[] args) {
        MyThread3 t1 = new MyThread3();
        MyThread3 t2 = new MyThread3();
        t1.setName("A");
        t2.setName("B");
        t1.setPriority(10);
        t2.setPriority(1);
        t1.start();
        t2.start();
    }
}


class MyThread3 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName()+"----"+i);
        }
    }
}
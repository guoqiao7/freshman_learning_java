package com.cskaoyan._13thread._07dielock;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/16 14:07
 **/
/*
解决死锁:
方式一:使加锁顺序一致
 */
public class Demo2 {
    public static void main(String[] args) {
        new Thread(new DieLock2(true)).start();
        new Thread(new DieLock2(false)).start();
    }
}
// 定义一个锁类
class MyLock2{
    public static final Object OBJECT_A = new Object();
    public static final Object OBJECT_B = new Object();
}


// 死锁类
class DieLock2 implements Runnable{
    boolean flag;

    public DieLock2(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag) {
            synchronized (MyLock2.OBJECT_A) {
                System.out.println("if A");
                synchronized (MyLock2.OBJECT_B) {
                    System.out.println("if B");
                }
            }
        }else {
            synchronized (MyLock2.OBJECT_A) {
                System.out.println("else B");
                synchronized (MyLock2.OBJECT_B) {
                    System.out.println("else A");
                }
            }
        }
    }
}

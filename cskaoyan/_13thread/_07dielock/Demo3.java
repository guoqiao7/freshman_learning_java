package com.cskaoyan._13thread._07dielock;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/16 14:07
 **/
/*
解决死锁:
方式二:把非原子操作变成原子操作===>再加一把锁
 */
public class Demo3 {
    public static void main(String[] args) {
        new Thread(new DieLock3(true)).start();
        new Thread(new DieLock3(false)).start();
    }
}
// 定义一个锁类
class MyLock3{
    public static final Object OBJECT_A = new Object();
    public static final Object OBJECT_B = new Object();
    public static final Object OBJECT_C = new Object();
}


// 死锁类
class DieLock3 implements Runnable{
    boolean flag;

    public DieLock3(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag) {
            synchronized (MyLock3.OBJECT_C) {
                synchronized (MyLock3.OBJECT_A) {
                    System.out.println("if A");
                    synchronized (MyLock3.OBJECT_B) {
                        System.out.println("if B");
                    }
                }
            }

        }else {
            synchronized (MyLock3.OBJECT_C) {
                synchronized (MyLock3.OBJECT_B) {
                    System.out.println("else B");
                    synchronized (MyLock3.OBJECT_A) {
                        System.out.println("else A");
                    }
                }

            }
        }
    }
}

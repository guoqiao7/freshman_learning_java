package com.cskaoyan._13thread._07dielock;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/16 14:07
 **/
/*
死锁一般发生在同步代码块嵌套中
synchronized(A){
    synchronized(B){
    }
}
 */
public class Demo {
    public static void main(String[] args) {
        new Thread(new DieLock(true)).start();
        new Thread(new DieLock(false)).start();
    }
}
// 定义一个锁类
class MyLock{
    public static final Object OBJECT_A = new Object();
    public static final Object OBJECT_B = new Object();
}


// 死锁类
class DieLock implements Runnable{
    boolean flag;

    public DieLock(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag) {
            // 同步代码块嵌套
            // 假设A线程先执行
            synchronized (MyLock.OBJECT_A) {
                // A线程持有A锁 进入外层sync
                System.out.println("if A");
                // A线程想要访问里层的sync 需要B锁 发生了线程切换
                // A线程接着执行 B锁被B线程持有
                // A只能在sync外面等待
                synchronized (MyLock.OBJECT_B) {
                    System.out.println("if B");
                }
            }
        }else {
            // B线程执行 B线程持有B锁
            synchronized (MyLock.OBJECT_B) {
                // B线程进入外层sync
                System.out.println("else B");
                // B想要访问里层的sync 需要A锁 此时A线程持有A锁
                // B线程只能处于阻塞状态
                synchronized (MyLock.OBJECT_A) {
                    System.out.println("else A");
                }
            }
        }
    }
}

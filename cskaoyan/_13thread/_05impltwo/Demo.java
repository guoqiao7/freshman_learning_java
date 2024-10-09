package com.cskaoyan._13thread._05impltwo;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/15 15:42
 **/
/*
多线程的实现方式二:实现Runnable接口
1. 定义一个类实现Runnable接口
2. 重写run方法
3. 创建子类对象
4. 创建线程对象, 把实现了Runnable接口的子类对象作为参数传递
5. start方法启动线程


 */
public class Demo {
    public static void main(String[] args) {
        // 3. 创建子类对象
        MyRunnable myRunnable = new MyRunnable();
        //4. 创建线程对象, 把实现了Runnable接口的子类对象作为参数传递
        Thread thread = new Thread(myRunnable);
        // start
        thread.start();
    }
}


//1. 定义一个类实现Runnable接口
class MyRunnable implements Runnable{
    @Override
    public void run() {
        // 2. 重写run方法
        System.out.println("子线程执行了!");
    }

}
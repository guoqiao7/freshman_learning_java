package com.cskaoyan._13thread._02implone;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/15 10:12
 **/
/*
start VS run
run方法执行只是普通方法的调用, 还是一条执行路径 ,并没有开辟新的执行路径-->单线程
start方法才是开辟新的执行路径,启动新的线程

注意:
    同一个线程不能多次start

 */
public class Demo3 {
    public static void main(String[] args) {
        System.out.println("main start");
        // 创建子类对象
        MyThread3 t1 = new MyThread3();
        // start
        t1.start();
        // java.lang.IllegalThreadStateException
        // 同一个线程多次start
        // t1.start();
        // run()--->单线程
        // 对象名.方法名() ---> 普通成员方法的调用
        // t1.run();
        System.out.println("main end");

    }
}
// 继承Thread类
class MyThread3 extends Thread{
    // run

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            // getName() --->获取线程名称
            System.out.println(getName()+"-----"+i);
        }
    }
}

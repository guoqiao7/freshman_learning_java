package com.cskaoyan._13thread._10singleton;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/17 9:01
 **/

public class SingletonTest {
    public static void main(String[] args) {
        //new Thread(()->{
        //    Singleton instance = Singleton.getInstance();
        //    System.out.println(instance);
        //}).start();
        //
        //new Thread(()->{
        //    Singleton instance = Singleton.getInstance();
        //    System.out.println(instance);
        //}).start();



        new Thread(()->{
            Singleton2 instance = Singleton2.getInstance();
            System.out.println(instance);
        }).start();

        new Thread(()->{
            Singleton2 instance = Singleton2.getInstance();
            System.out.println(instance);
        }).start();
    }
}

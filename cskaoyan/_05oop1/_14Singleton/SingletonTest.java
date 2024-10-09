package com.cskaoyan._05oop1._14Singleton;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/5 10:14
 **/

public class SingletonTest {
    public static void main(String[] args) {
        // 通过静态方法来获取对象
        // 必须是同一个对象
        //Singleton instance1 = Singleton.getInstance();
        //Singleton instance2 = Singleton.getInstance();
        //Singleton instance3 = Singleton.getInstance();
        //System.out.println(instance1);
        //System.out.println(instance2);
        //System.out.println(instance3);

        // 懒加载单例 线程不安全
        // 不获取对象的操作放在不同的线程中
        //new Thread(()->{
        //    Singleton instance1 = Singleton.getInstance();
        //    System.out.println(instance1);
        //}).start();

        //new Thread(()->{
        //    Singleton instance1 = Singleton.getInstance();
        //    System.out.println(instance1);
        //}).start();


        // 测试立即加载单例
        Singleton2 instance1 = Singleton2.getInstance();
        Singleton2 instance2 = Singleton2.getInstance();
        Singleton2 instance3 = Singleton2.getInstance();
        System.out.println(instance1);
        System.out.println(instance2);
        System.out.println(instance3);

        //new Thread(()->{
        //    Singleton2 instance1 = Singleton2.getInstance();
        //    System.out.println(instance1);
        //}).start();
        //
        //new Thread(()->{
        //    Singleton2 instance1 = Singleton2.getInstance();
        //    System.out.println(instance1);
        //}).start();
    }
}

package com.cskaoyan._13thread._05impltwo;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/15 15:45
 **/

public class Demo2 {
    public static void main(String[] args) {
        // 不同写法
        // 使用匿名内部类
        /*
        new Runnable() {
            @Override
            public void run() {

            }
        } ===> 表示Runnable接口的子类对象
         */
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(11111);
            }
        });
        t1.start();

        // 还可以使用lambda表达式的写法
        // 必须是功能接口
        /*
        ()-> {
            // 重写的方法体
            System.out.println(2222);
        } ===>表示Runnable接口的子类对象
         */
        new Thread(()-> {
            // 重写的方法体
            System.out.println(2222);
        }).start();

    }
}


